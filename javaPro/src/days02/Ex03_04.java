package days02;

public class Ex03_04 {

	public static void main(String[] args) {
		
		String name = "홍길동";
		int age = 25;
		double height = 180.78;
		
		
		//System.out.println("이름은 \""+ name +"\"이고, 나이는"+age+"살이고, 키는 "+height+"cm이다.");
		
		// println보다 printf(ormat)이 더 편리
		// 메서드 3가지: 기능, 매개변수, 리턴값
		//System.out.printf(String format, Object...args);
		//System.out.printf("이름은 \"홍길동\"이고, 나이는25살이고, 키는 180.78cm이다."
		//		,name, age, height);//값 계속 나열, 꼭 변수가 안와도 됨.
				//%: conversion
				// string s
				// int    d
				// double f
 		//System.out.printf("이름은 \"%s\"이고, 나이는 %d살이고, 키는 %fcm이다."
		//				,name, age, height);//값 계속 나열, 꼭 변수가 안와도 됨.
		System.out.printf("이름은 \"%s\"이고, 나이는 %d살이고, 키는 %.2fcm이다."
						,name, age, height);
			
	}//main
	
}//class
		
