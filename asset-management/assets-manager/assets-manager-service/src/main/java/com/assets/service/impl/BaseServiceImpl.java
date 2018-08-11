package com.assets.service.impl;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.cache.Cache.ValueWrapper;

import com.assets.common.utils.CookieUtils;
import com.assets.common.utils.JsonUtils;
import com.assets.common.utils.ResponseResult;
import com.assets.pojo.SysUser;
import com.assets.service.BaseService;

/**
 * 公用方法接口实现类
 * 
 * @author Administrator
 *
 */
@Resource
public class BaseServiceImpl implements BaseService {

	@Autowired
	private CacheManager cacheManager;

	@Value("${EHCACHE_SESSION_KEY}")
	private String EHCACHE_SESSION_KEY;

	// cookie 中存的key 名称
	@Value("${COOKIE_TOKEN_KEY}")
	private String COOKIE_TOKEN_KEY;

	@Value("${EHCACHE_NAME_LOGIN_KEY}")
	private String EHCACHE_NAME_LOGIN_KEY;


	/**
	 * 获取ECache缓存的登录人员信息
	 */
	@Override
	public ResponseResult getUserByToken(String token) {
		// 根据token获取用户信息，ehcache中取
		try {
			Cache loginCache = cacheManager.getCache(EHCACHE_NAME_LOGIN_KEY);
			ValueWrapper valueWrapper = loginCache.get(EHCACHE_SESSION_KEY
					+ ":" + token);
			// 判断结果是否为空，为空说明过期，因为设置了30分钟
			if (valueWrapper == null) {
				return ResponseResult.build(400, "用户session已过期");
			}
			// 把json转换成java对象
			SysUser user = JsonUtils.jsonToPojo(valueWrapper.get().toString(),
					SysUser.class);
			// 更新session的过期时间
			return ResponseResult.ok(user);
		} catch (Exception e) {
			return ResponseResult.build(400, "用户session已过期");
		}
	}

	/**
	 * 获取ECache缓存的登录人员psn_code信息
	 */
	@Override
	public ResponseResult getUserPsnCodeByRequest(HttpServletRequest request) {
		// 根据token获取用户信息，ehcache中取
		try {
			// 获取cookie中的token值
			String token = CookieUtils
					.getCookieValue(request, COOKIE_TOKEN_KEY);
			Cache loginCache = cacheManager.getCache(EHCACHE_NAME_LOGIN_KEY);
			ValueWrapper valueWrapper = loginCache.get(EHCACHE_SESSION_KEY
					+ ":" + token);
			// 判断结果是否为空，为空说明过期，因为设置了30分钟
			if (valueWrapper == null) {
				return ResponseResult.build(400, "用户session已过期");
			}
			// 把json转换成java对象
			SysUser user = JsonUtils.jsonToPojo(valueWrapper.get().toString(),
					SysUser.class);
			// 更新session的过期时间
			return ResponseResult.ok(user.getUserid());
		} catch (Exception e) {
			return ResponseResult.build(400, "用户session已过期");
		}
	}

}
