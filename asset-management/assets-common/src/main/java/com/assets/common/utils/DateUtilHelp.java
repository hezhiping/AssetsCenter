package com.assets.common.utils;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.assets.common.pojo.KeyValueHelp;

public class DateUtilHelp {

	/**
	 * 获取年份，当前年上5年和当前年后10年
	 * @return
	 */
	public static List<KeyValueHelp> getYearLength() {
		// 获取当前年份
		Date now = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy");
		int year = Integer.valueOf(simpleDateFormat.format(now));
		// 创建年份集合
		List<KeyValueHelp> list = new ArrayList<KeyValueHelp>();
		for (int i = -5; i + year <= year + 10; i++) {
			// 创建combox 结果对象
			KeyValueHelp keyValueHelp = new KeyValueHelp();
			keyValueHelp.setDateKey(year + i);
			keyValueHelp.setDateValue(year + i);
			list.add(keyValueHelp);
		}
		return list;

	}
	
	/**
	 * 获取月份
	 * @return
	 */
	public static List<KeyValueHelp> getMonth() {
	
		List<KeyValueHelp> list = new ArrayList<KeyValueHelp>();
		for (int i = 1; i  <= 12; i++) {
			// 创建combox 结果对象
			KeyValueHelp keyValueHelp = new KeyValueHelp();
			String month = String.valueOf(i);
			// 补齐两位数字
			if(month.length()==1){
				month = "0"+month;
			}
			keyValueHelp.setDateKey(month);
			keyValueHelp.setDateValue(month);
			list.add(keyValueHelp);
		}
		return list;

	}

}
