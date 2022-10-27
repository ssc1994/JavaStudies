package com.ssc.quiz1;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		String str = "180.76.15.5 - - [15/Nov/2015:03:45:45 +0000] \"GET / HTTP/1.1\" 200 6812";
		String[] s = str.split(" ");
		System.out.println(s.length);
		System.out.println(Arrays.toString(s));
		String sstr = "52.27.124.159 - - [15/Nov/2015:03:46:26 +0000] \"POST /samsblog/wp-cron.php?doing_wp_cron=1447559186.3994779586791992187500 HTTP/1.0\" 200 -";
		String[] ss = sstr.split(" ");
		System.out.println(ss.length);
		System.out.println(Arrays.toString(ss));
		String ssstr = "66.249.79.123 - - [15/Nov/2015:05:28:23 +0000] \"GET /robots.txt HTTP/1.1\" 404 286";
		String[] sss = ssstr.split(" ");
		System.out.println(sss.length);
		System.out.println(Arrays.toString(sss));
//		모두 10칸짜리 데이터
//		0번째 = Ip
//		3번째는 시간
//		4번째는 +0000
//		5번째는 동작
//		6번째는 url  
//		7번째 HTTP버전
//		8번째 ???
//		9번째 트래픽
		
		
		try{
			
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
	}

}
