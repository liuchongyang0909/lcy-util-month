package com.liuchongyang.common.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {
	public static int getAge(Date birthday) {
		// 获取当前系统的日历类
		Calendar c = Calendar.getInstance();
		// 获取当前年月日
		int yearNow = c.get(Calendar.YEAR);
		int monthNow = c.get(Calendar.MONTH);
		int dateNow = c.get(Calendar.DAY_OF_MONTH);
		c.setTime(birthday);// 用生日初始化日历类
		int yearBirth = c.get(Calendar.YEAR);
		int monthBirth = c.get(Calendar.MONTH);
		int dateBirth = c.get(Calendar.DAY_OF_MONTH);
		// 年龄 1990-02-10 2019-02-08
		int age = yearNow - yearBirth;
		// 出生月份大于前月份 年龄减少1
		if (monthBirth > monthNow) {
			age--;
		}
		// 如果月份一致并且 日期大于当前日期 年龄减少1
		if (monthBirth == monthNow && dateBirth > dateNow) {
			age--;
		}
		return age;
	}

	public static Date getMonthEnd(Date date) {
		Calendar c = Calendar.getInstance();
		// 用传入的日期初始化日历类
		c.setTime(date);
		// 让当前月份+1
		c.add(Calendar.MONTH, 1);
		// 让日期变成下个月月初

		Date init = getMonthInit(c.getTime());

		// 用月初再次初始日历类
		c.setTime(init);
		// 日期的秒数-1
		c.add(Calendar.SECOND, -1);

		return c.getTime();
	}

	public static Date getMonthInit(Date date) {
		// 获取的当前系统的时间的日历类
		Calendar c = Calendar.getInstance();
		// 用传入的日期初始化日历类
		c.setTime(date);
		// 设置月份的天为 1
		c.set(Calendar.DAY_OF_MONTH, 1);
		c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);

		return c.getTime();
	}

	public static Date random(Date minDate, Date maxDate) {
		// 开始毫秒数
		long t1 = minDate.getTime();
		// 结束毫秒数
		long t2 = maxDate.getTime();
		// 介于t2 t1之间的毫米数
		long t3 = (long) (Math.random() * (t2 - t1 + 1) + t1);

		return new Date(t3);

	}
}
