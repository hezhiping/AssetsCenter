package com.assets.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import com.assets.common.utils.ResponseResult;
import com.assets.pojo.SysUser;
import com.assets.service.RegisterService;

@Service
public class RegisterServiceImpl implements RegisterService {

	// @Autowired
	// private TbUserMapper userMapper;

	@Override
	public ResponseResult checkData(String param, int type) {
		/*TbUserExample example = new TbUserExample();
		Criteria criteria = example.createCriteria();
		// type为类型，可选参数1、2、3分别代表username、phone、email
		if (1 == type) {
			criteria.andUsernameEqualTo(param);
		} else if (2 == type) {
			criteria.andPhoneEqualTo(param);
		} else if (3 == type) {
			criteria.andEmailEqualTo(param);
		}

		// 根据参数和type类型查找数据
		List<TbUser> list = userMapper.selectByExample(example);
		if (list == null || list.isEmpty()) {
			return ResponseResult.ok(true);
		}*/
		return ResponseResult.ok(false);
	}

	@Override
	public ResponseResult register(SysUser user) {
		// TODO 注册用户
		// 校验数据是否存在
		// 用户名和密码
		/*
		 * if (StringUtils.isEmpty(user.getUsername()) ||
		 * StringUtils.isEmpty(user.getPassword())) { return
		 * ResponseResult.build(400, "注册失败. 请校验数据后请再提交数据."); } //
		 * type为类型，可选参数1、2、3分别代表username、phone、email // 检验用户名重复 ResponseResult
		 * result = checkData(user.getUsername(), 1); if (!(boolean)
		 * result.getData()) { return ResponseResult.build(400, "用户名重复"); } //
		 * 手机号 if (null != user.getPhone()) { result =
		 * checkData(user.getPhone(), 2); if (!(boolean) result.getData()) {
		 * return ResponseResult.build(400, "手机号重复"); } } // 邮箱 if (null !=
		 * user.getEmail()) { result = checkData(user.getEmail(), 3); if
		 * (!(boolean) result.getData()) { return ResponseResult.build(400,
		 * "邮箱重复"); } }
		 * 
		 * // 添加用户 user.setCreated(new Date()); user.setUpdated(new Date()); //
		 * 调用spring中的DigestUtils工具类DigestUtils方法进行MD5加密
		 * user.setPassword(DigestUtils.md5DigestAsHex(user.getPassword()
		 * .getBytes())); userMapper.insert(user);
		 */
		return ResponseResult.ok();
	}

	
}
