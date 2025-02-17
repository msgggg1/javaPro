package com.util;

public class Graphic2D { ///그래픽작업하는 기능 구현
	
	
	public static void drawLine(/*매개변수 없음*/) {
		System.out.print("--------------");// 50줄 코딩 가정
	}
	
	
	// Duplicate method drawLine() in type Ex04_03  -> 매개변수 자료형, 개수 다르게
	// 메소드 오버로딩(overload): 동일한 메소드명으로 중복 선언하는 것 (중복함수)/ 조건: 매개변수 타입, 갯수 달라야. 리턴자료형은 해당X.
	public static void drawLine(int length) {
		for (int i = 1; i < length; i++) {
			System.out.print("=");
		} // for i
		System.out.println();// 50줄 코딩 가정
	}

	
	public static void drawLine(int length, String style) {
		for (int i = 1; i < length; i++) {
			System.out.print(style);
		} // for i
		System.out.println();// 50줄 코딩 가정
	}

}
