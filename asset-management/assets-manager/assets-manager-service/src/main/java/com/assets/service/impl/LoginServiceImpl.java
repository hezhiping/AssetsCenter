package com.assets.service.impl;

import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.Cache;
import org.springframework.cache.Cache.ValueWrapper;
import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import com.assets.common.utils.CookieUtils;
import com.assets.common.utils.JsonUtils;
import com.assets.common.utils.ResponseResult;
import com.assets.mapper.SysUserMapper;
import com.assets.pojo.SysUser;
import com.assets.pojo.SysUserExample;
import com.assets.pojo.SysUserExample.Criteria;
import com.assets.service.LoginService;

@Service
public class LoginServiceImpl extends BaseServiceImpl implements LoginService {

	@Autowired
	private SysUserMapper userMapper;

	@Autowired
	private CacheManager cacheManager;

	@Value("${EHCACHE_SESSION_KEY}")
	private String EHCACHE_SESSION_KEY;

	@Override
	public ResponseResult login(String userName, String password,
			String checkcode, HttpServletRequest request,
			HttpServletResponse response) {
		
		// 获取缓存中生成的验证码
		String keyValue =(String) request.getSession().getAttribute("key");
		if (StringUtils.isNotBlank(keyValue) && keyValue.equals(checkcode)) {
			// 登录
			if (StringUtils.isBlank(userName) || StringUtils.isBlank(password)) {
				return ResponseResult.build(400, "请检查用户名和密码");
			}
			SysUserExample example = new SysUserExample();
			Criteria criteria = example.createCriteria();
			criteria.andLoginNameEqualTo(userName);
			// 查询
			List<SysUser> list = userMapper.selectByExample(example);
			
			if (list == null || list.isEmpty()) {
				return ResponseResult.build(400, "用户名或密码错误!");
			}
			SysUser user = list.get(0);

			// 校验密码
			if (!user.getPassword().equals(
					DigestUtils.md5DigestAsHex(password.getBytes()))) {
				return ResponseResult.build(400, "用户名或密码错误!");
			}
			// 登录成功
			// 获取缓存对象
			Cache loginCache = cacheManager.getCache("loginCache");
			// 生成token
			String token = UUID.randomUUID().toString();

			// 把用户信息写入ehcache
			// key:EHCACHE_SESSION:{TOKEN}
			// value:user转json
			String key = EHCACHE_SESSION_KEY + ":" + token;
			// 把密码设置为空，不能暴露密码
			// user.setPassword(null);
			loginCache.put(key, JsonUtils.objectToJson(user));

			// 写入cookie
			CookieUtils.setCookie(request, response, "TT_TOKEN", token);
			return ResponseResult.ok(token);
		} else {
			//验证码错误,设置错误提示信息，跳转到登录页面
			return ResponseResult.build(400, "验证码错误!!!");
		}
	}

//	@Override
//	public ResponseResult getUserByToken(String token)  {
//		// 根据token获取用户信息，ehcache中取		
//		try {
//			Cache loginCache = cacheManager.getCache("loginCache");
//			ValueWrapper valueWrapper = loginCache.get(EHCACHE_SESSION_KEY + ":" + token);					
//			// 判断结果是否为空，为空说明过期，因为设置了30分钟
//			if (valueWrapper == null) {
//				return ResponseResult.build(400, "用户session已过期");
//			}			
//			// 把json转换成java对象
//			SysUser user = JsonUtils.jsonToPojo(valueWrapper.get().toString(), SysUser.class);
//			// 更新session的过期时间		
//			return ResponseResult.ok(user);
//		} catch (Exception e) {
//			return ResponseResult.build(400, "用户session已过期");
//		}
	//}
}
