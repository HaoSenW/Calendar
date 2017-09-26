package com.mec.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class AboutCalendar {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		System.out.print(today.get(Calendar.YEAR) + "��");
		System.out.print(today.get(Calendar.MONTH) + "��");
		System.out.print(today.get(Calendar.DATE) + "��");
		System.out.print(today.get(Calendar.HOUR_OF_DAY) + "ʱ");
		System.out.print(today.get(Calendar.MINUTE) + "��");
		System.out.println(today.get(Calendar.SECOND) + "��");
		
		System.out.println("------------------------------");
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String todayString = dateFormat.format(today.getTime());
		System.out.println(todayString);
		
		System.out.println("------------------------------");
		
		Scanner in = new Scanner(System.in);
		System.out.println("�������꣺");
		int year = in.nextInt();
		System.out.println("�������£�");
		int month = in.nextInt();
		today.set(year, month-1, 1);
		todayString = dateFormat.format(today.getTime());
		int date = today.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(date);
		System.out.println(todayString);
		in.close();
	}
}
