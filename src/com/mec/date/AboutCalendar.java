package com.mec.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class AboutCalendar {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		System.out.print(today.get(Calendar.YEAR) + "年");
		System.out.print(today.get(Calendar.MONTH) + "月");
		System.out.print(today.get(Calendar.DATE) + "日");
		System.out.print(today.get(Calendar.HOUR_OF_DAY) + "时");
		System.out.print(today.get(Calendar.MINUTE) + "分");
		System.out.println(today.get(Calendar.SECOND) + "秒");
		
		System.out.println("------------------------------");
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String todayString = dateFormat.format(today.getTime());
		System.out.println(todayString);
		
		System.out.println("------------------------------");
		
		Scanner in = new Scanner(System.in);
		System.out.println("请输入年：");
		int year = in.nextInt();
		System.out.println("请输入月：");
		int month = in.nextInt();
		today.set(year, month-1, 1);
		todayString = dateFormat.format(today.getTime());
		int date = today.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(date);
		System.out.println(todayString);
		in.close();
	}
}
