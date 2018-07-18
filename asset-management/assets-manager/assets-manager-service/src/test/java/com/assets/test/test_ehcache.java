package com.assets.test;

import java.util.Collection;
import java.util.List;

import net.sf.ehcache.Element;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.Cache.ValueWrapper;
import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Service;

@Service
public class test_ehcache {
	
	@Autowired
	private CacheManager cacheManager;
	
	public void getCache() {
		
		Cache cache = cacheManager.getCache("cache");
	 	Collection<String> str = cacheManager.getCacheNames();
		cache.put("123","hezhiping");
		ValueWrapper getkey = cache.get("123");
		System.out.println(getkey);
		
	}

}
