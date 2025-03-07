package days01;

/** shift + alt + J
 * @author msg
 * @date 2025. 2. 3. - 오후 2:47:38
 * @subject [ 자바 프로그램의 기본 구조 설명 ]
 * @content
 * 	jdk = jre + 개발도구(java.exe, javac.exe 등등)
 * 	JRE = JVM + class library
 */
public class Ex02 {
	
	/** shift + alt + J
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * 1. 자바는 "객체 지향적 프로그램 언어"이다.
		 * 			Object Oriented Programming
		 * 			(OOP) 
		 *  예) 완성된 프로그램
		 *     완성된 조립컴퓨터 = 부품+부품+부품+... -> 유지, 보수, 확장성
		 *     				 클래스 클래스 ...
		 *     				시작개체
		 *     Sample.java 소스파일
		 *     javac Sample.java -> Sample.class 컴파일
		 *     java Sample 실행
		 *     		-> JRE(JVM) -> Sample 클래스 -> 전원 On/off 기능
		 *     						시작개체         기능=메서드(method)
		 *                                        main 메서드의 기능
		 *                                        프로그램 시작점~종료
		 *     
		 *     				     객체(=Object=개체)
		 * 2. 클래스 = 부품(객체==Object) 설계도
		 *  
		 * 3. 자바 클래스 선언 형식
		 *  Public= 접근지정자
		 *       modifieres
		 *  [접근지정자] [기타제어자] class예약어 클래스명 {   클래스몸체{}
		 *  }
		 *  - 클래스명은 반드시 첫 문자 => 대문자 시작
		 *  - 식별자:개발자가 명명하는 것(클래스 명)
		 *  - 자바에서 식별자를 명명하는 규칙
		 *  
		 * 4. 자바에서 메서드 선언 형식
		 *  public static void main(String[] args) {
		 *  }
		 *  [접근지정자] [기타제어자] 리턴자료형 메서드명([매개변수...](=파라미터, 인자, 인수)){ 메서드 몸체
		 *  
		 *  		[return 리턴값;] 생략
		 *  		(void: 돌려줄 값이 없음)
		 *  }
		 *  
		 *  예)	홍길동 -> 담배 심부름(일/기능)
		 *  			파라미터, 매개변수 : 담배값, 담배명
		 *  			반환(리턴)값     : 담배
		 * */
		
	} // main

}// class