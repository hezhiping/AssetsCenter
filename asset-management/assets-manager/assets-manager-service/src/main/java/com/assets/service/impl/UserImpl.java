package com.assets.service.impl;

import java.util.Collection;

import net.sf.ehcache.Element;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.Cache.ValueWrapper;
import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Service;

import com.assets.service.IUser;

@Service
public class UserImpl implements IUser {

	@Autowired
	private CacheManager cacheManager;

	@Override
	public String getCacheUser(String key) {

		Cache cache = cacheManager.getCache("cache");
		
		cache.put("123", "hezhiping");

		ValueWrapper value = cache.get(key);		
		String strValue = (String) value.get();
		
		return strValue;

	}

}
