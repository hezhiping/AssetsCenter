package com.assets.test;

import static org.junit.Assert.*;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.junit.Test;

public class testThreadPool {

	@Test
	public void testPoo1() {
		for (int i = 0; i < 15; i++) {
			testPool(i);
		}
		
		for (int i = 0; i < 15; i++) {
			System.out.println("没有调用线程 :" + i);
		}
	}
	
	public void testPool(final int i) {		
		ThreadPoolExecutor pool1 = new ThreadPoolExecutor(5, 10, 200,  TimeUnit.MILLISECONDS, new ArrayBlockingQueue<Runnable>(5));
		pool1.execute(new  Runnable() {			
			@Override
			public void run() {				
				System.out.println("线程 :" + i);
				
			}
		});
		
	}
	
	/*	// 创建一个线程池
	ThreadPoolExecutor pool = new ThreadPoolExecutor(5,10, 200, TimeUnit.MILLISECONDS,new ArrayBlockingQueue<Runnable>(5));
	pool.execute(new Runnable() {				
		@Override
		public void run() {
			// 获取登入人员的PSN_CODE
			ResponseResult responseResult = getUserPsnCodeByRequest(request);
			if (responseResult.getStatus() == 200) {
			Map<String, Object> map = new HashMap<String, Object>();
			//查询
			map.put("psnCode", Integer.valueOf(responseResult.getData().toString())); // 设置查询条件当前人
			map.put("currentYear", DateUtilHelp.getNowYearStr());// 设置查询条件当前年
			map.put("currentMonth", DateUtilHelp.getNowMonthStr()); // 设置查询条件当前月				
			List<FundChange> list = fundChangeMapper.selectFundChangeList(map); //查询 
			
			}
		}
	});*/
	
}
