package com.assets.service;

import com.assets.common.utils.ResponseResult;
import com.assets.pojo.SysUser;

public interface RegisterService {

	ResponseResult checkData(String param,int type);
	ResponseResult register(SysUser user);
}
