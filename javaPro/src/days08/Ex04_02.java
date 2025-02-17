package days08;

import java.util.Iterator;

/**
 * @author msg
 * @date 2025. 2. 12. - 오후 12:09:41
 * @subject
 * @content
 */
public class Ex04_02 {

	public static void main(String[] args) {
//		System.out.println("--------------");// 50줄 코딩 가정
		drawLine(50, "*"); // 메소드 호출부

		drawLine(10); // 메소드 호출부
		
		drawLine(); // 메소드 호출부

	} // main

	// 메소드 밖 클래스 안
	
	// [메소드 선언부] -> 호출해야 일 함. 
	// 1) 기능(일): 라인(선)을 긋는 메소드 drawLine(맘대로)
	// 2) 매개변수 : x
	// 3) 리턴값: x 
	//            -> 리턴자료형: void
	
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
	
//	public static int drawLine() { // 리턴자료형은 중복함수 조건에 해당안됨. 
//		System.out.println("--------------");// 50줄 코딩 가정
//		return 0 ;  
//	}
	
	// 앞으로 계속 사용할 메소드 저장
	// 패키지명 + 클래스명 = 풀(full)네임
	// com.util.Graphic2D.java
	
	
} // class
