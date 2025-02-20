package days14;

/**
 * @author msg
 * @date 2025. 2. 20. - 오후 4:30:22
 * @subject
 * @content
 */

public class Ex11 {
	
	// [필드] - 인스턴스, 클래스 변수로 나뉨
    // 1) 인스턴스 변수
	public String color;
	// 2) 클래스(static) 변수
	public static int number;

	// 메소드
	public static void main(String[] args/*지역변수임*/) {
		/* 암기***
		 * [ 자바 변수의 선언되는 위치에 따른 종류 ]
		 * 								<선언위치>							<생성시기>								<소멸시점>							<초기화>
		 * 1. 인스턴스 변수					클래스 안							인스턴스가 생성될 때						소멸 시. ex) t = null-> garbage	자동
		 * 2. 클래스(static) 변수			클래스 안							클래스가 메모리에 올라갈 때/=프로그램 시작 시 	종료 시 							자동
		 * 3. 지역변수						메소드 안, 초기화블럭 안, 생성자 안		변수 선언문 실행될 때.													해야함
		 * 
		 * 
		 * */

		int age; // 지역변수
		
	} // main

} // class
