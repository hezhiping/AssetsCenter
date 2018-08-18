package com.assets.common.utils;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.assets.common.pojo.KeyValueHelp;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.apache.commons.lang3.StringUtils;


public class DateUtilHelp {

	// 默认日期格式
    public static final String DATE_DEFAULT_FORMAT = "yyyy-MM-dd";
    
    // 默认月份格式
    public static final String YEAR_DEFAULT_FORMAT = "yyyy";
    
    // 默认月份格式
    public static final String MONTH_DEFAULT_FORMAT = "MM";

    // 默认时间格式
    public static final String DATETIME_DEFAULT_FORMAT = "yyyy-MM-dd HH:mm:ss";

    public static final String TIME_DEFAULT_FORMAT = "HH:mm:ss";

    // 日期格式化
    private static DateFormat dateFormat = null;

    // 时间格式化
    private static DateFormat dateTimeFormat = null;

    private static DateFormat timeFormat = null;
    
    private static DateFormat yearFormat = null;
    
    private static DateFormat monthFormat = null;

    private static Calendar gregorianCalendar = null;

    static {
        dateFormat = new SimpleDateFormat(DATE_DEFAULT_FORMAT);
        dateTimeFormat = new SimpleDateFormat(DATETIME_DEFAULT_FORMAT);
        timeFormat = new SimpleDateFormat(TIME_DEFAULT_FORMAT);
        monthFormat = new SimpleDateFormat(MONTH_DEFAULT_FORMAT);
        yearFormat = new SimpleDateFormat(YEAR_DEFAULT_FORMAT);
        gregorianCalendar = new GregorianCalendar();
    }

    
	/**
	 * 获取年份，当前年上5年和当前年后10年
	 * @return
	 */
	public static List<KeyValueHelp> getYearLength() {
		// 获取当前年份
		int year = getNowYearInt(); 
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
	 * 获取所有月份
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
	
	  /**
     * 日期格式化yyyy-MM-dd
     * 
     * @param date
     * @return
     */
    public static Date formatDate(String date, String format) {
        try {
            return new SimpleDateFormat(format).parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 日期格式化yyyy-MM-dd
     * 
     * @param date
     * @return
     */
    public static String getDateFormat(Date date) {
        return dateFormat.format(date);
    }

    /**
     * 日期格式化yyyy-MM-dd HH:mm:ss
     * 
     * @param date
     * @return
     */
    public static String getDateTimeFormat(Date date) {
        return dateTimeFormat.format(date);
    }

    /**
     * 时间格式化
     * 
     * @param date
     * @return HH:mm:ss
     */
    public static String getTimeFormat(Date date) {
        return timeFormat.format(date);
    }

    /**
     * 日期格式化
     * 
     * @param date
     * @param 格式类型
     * @return
     */
    public static String getDateFormat(Date date, String formatStr) {
        if (StringUtils.isNotBlank(formatStr)) {
            return new SimpleDateFormat(formatStr).format(date);
        }
        return null;
    }

    /**
     * 日期格式化
     * 
     * @param date
     * @return
     */
    public static Date getDateFormat(String date) {
        try {
            return dateFormat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 时间格式化
     * 
     * @param date
     * @return
     */
    public static Date getDateTimeFormat(String date) {
        try {
            return dateTimeFormat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 获取当前日期(yyyy-MM-dd)
     * 
     * @param date
     * @return
     */
    public static Date getNowDate() {
        return DateUtilHelp.getDateFormat(dateFormat.format(new Date()));
    }

    /**
     * 获取当前日期星期一日期
     * 
     * @return date
     */
    public static Date getFirstDayOfWeek() {
        gregorianCalendar.setFirstDayOfWeek(Calendar.MONDAY);
        gregorianCalendar.setTime(new Date());
        gregorianCalendar.set(Calendar.DAY_OF_WEEK, gregorianCalendar.getFirstDayOfWeek()); // Monday
        return gregorianCalendar.getTime();
    }

    /**
     * 获取当前日期星期日日期
     * 
     * @return date
     */
    public static Date getLastDayOfWeek() {
        gregorianCalendar.setFirstDayOfWeek(Calendar.MONDAY);
        gregorianCalendar.setTime(new Date());
        gregorianCalendar.set(Calendar.DAY_OF_WEEK, gregorianCalendar.getFirstDayOfWeek() + 6); // Monday
        return gregorianCalendar.getTime();
    }

    /**
     * 获取日期星期一日期
     * 
     * @param 指定日期
     * @return date
     */
    public static Date getFirstDayOfWeek(Date date) {
        if (date == null) {
            return null;
        }
        gregorianCalendar.setFirstDayOfWeek(Calendar.MONDAY);
        gregorianCalendar.setTime(date);
        gregorianCalendar.set(Calendar.DAY_OF_WEEK, gregorianCalendar.getFirstDayOfWeek()); // Monday
        return gregorianCalendar.getTime();
    }

    /**
     * 获取日期星期一日期
     * 
     * @param 指定日期
     * @return date
     */
    public static Date getLastDayOfWeek(Date date) {
        if (date == null) {
            return null;
        }
        gregorianCalendar.setFirstDayOfWeek(Calendar.MONDAY);
        gregorianCalendar.setTime(date);
        gregorianCalendar.set(Calendar.DAY_OF_WEEK, gregorianCalendar.getFirstDayOfWeek() + 6); // Monday
        return gregorianCalendar.getTime();
    }

    /**
     * 获取当前月的第一天
     * 
     * @return date
     */
    public static Date getFirstDayOfMonth() {
        gregorianCalendar.setTime(new Date());
        gregorianCalendar.set(Calendar.DAY_OF_MONTH, 1);
        return gregorianCalendar.getTime();
    }

    /**
     * 获取当前月的最后一天
     * 
     * @return
     */
    public static Date getLastDayOfMonth() {
        gregorianCalendar.setTime(new Date());
        gregorianCalendar.set(Calendar.DAY_OF_MONTH, 1);
        gregorianCalendar.add(Calendar.MONTH, 1);
        gregorianCalendar.add(Calendar.DAY_OF_MONTH, -1);
        return gregorianCalendar.getTime();
    }

    /**
     * 获取指定月的第一天
     * 
     * @param date
     * @return
     */
    public static Date getFirstDayOfMonth(Date date) {
        gregorianCalendar.setTime(date);
        gregorianCalendar.set(Calendar.DAY_OF_MONTH, 1);
        return gregorianCalendar.getTime();
    }

    /**
     * 获取指定月的最后一天
     * 
     * @param date
     * @return
     */
    public static Date getLastDayOfMonth(Date date) {
        gregorianCalendar.setTime(date);
        gregorianCalendar.set(Calendar.DAY_OF_MONTH, 1);
        gregorianCalendar.add(Calendar.MONTH, 1);
        gregorianCalendar.add(Calendar.DAY_OF_MONTH, -1);
        return gregorianCalendar.getTime();
    }

    /**
     * 获取日期前一天
     * 
     * @param date
     * @return
     */
    public static Date getDayBefore(Date date) {
        gregorianCalendar.setTime(date);
        int day = gregorianCalendar.get(Calendar.DATE);
        gregorianCalendar.set(Calendar.DATE, day - 1);
        return gregorianCalendar.getTime();
    }

    /**
     * 获取日期后一天
     * 
     * @param date
     * @return
     */
    public static Date getDayAfter(Date date) {
        gregorianCalendar.setTime(date);
        int day = gregorianCalendar.get(Calendar.DATE);
        gregorianCalendar.set(Calendar.DATE, day + 1);
        return gregorianCalendar.getTime();
    }

    /**
     * 获取当前年字符串
     * 
     * @return
     */
    public static String getNowYearStr() {
        Calendar d = Calendar.getInstance();
        return String.valueOf(d.get(Calendar.YEAR));
    }
    /**
     * 获取当前年INT
     * 
     * @return
     */
    public static int getNowYearInt() {
        Calendar d = Calendar.getInstance();
        return d.get(Calendar.YEAR);
    }

    /**
     * 获取当前月份  不补0
     * @return
     */
    public static int getNowMonthInt() {
        Calendar d = Calendar.getInstance();
        return d.get(Calendar.MONTH) + 1;
    }
    /**
     * 获取当前月份 MM 格式 
     * @return
     */
    public static String getNowMonthStr() { 
        return monthFormat.format(new Date());//d.get(Calendar.MONTH) + 1);
    }

    /**
     * 获取当月天数
     * 
     * @return
     */
    public static int getNowMonthDay() {
        Calendar d = Calendar.getInstance();
        return d.getActualMaximum(Calendar.DATE);
    }

    /**
     * 获取时间段的每一天
     * 
     * @param 开始日期
     * @param 结算日期
     * @return 日期列表
     */
    public static List<Date> getEveryDay(Date startDate, Date endDate) {
        if (startDate == null || endDate == null) {
            return null;
        }
        // 格式化日期(yy-MM-dd)
        startDate = DateUtilHelp.getDateFormat(DateUtilHelp.getDateFormat(startDate));
        endDate = DateUtilHelp.getDateFormat(DateUtilHelp.getDateFormat(endDate));
        List<Date> dates = new ArrayList<Date>();
        gregorianCalendar.setTime(startDate);
        dates.add(gregorianCalendar.getTime());
        while (gregorianCalendar.getTime().compareTo(endDate) < 0) {
            // 加1天
            gregorianCalendar.add(Calendar.DAY_OF_MONTH, 1);
            dates.add(gregorianCalendar.getTime());
        }
        return dates;
    }

    /**
     * 获取提前多少个月
     * 
     * @param monty
     * @return
     */
    public static Date getFirstMonth(int monty) {
        Calendar c = Calendar.getInstance();
        c.add(Calendar.MONTH, -monty);
        return c.getTime();
    }

    /**
     * 根据传入的日期获取年
     * @param consumeDate
     * @return
     */
	public static String getNowYearStr(Date consumeDate) {
		return yearFormat.format(consumeDate);
	}

    /**
     * 根据传入的日期获取月
     * @param consumeDate
     * @return
     */
	public static String getNowMonthStr(Date consumeDate) {
		  return monthFormat.format(consumeDate);
	}
	
	
}
