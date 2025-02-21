package days15;

/**
 * @author msg
 * @date 2025. 2. 21. - 오후 2:36:08
 * @subject
 * @content
 */

public class Ex06 {

	public static void main(String[] args) {
		/*
		 * [ this 키워드 ] p.245
		 * 1. 정의 : 클래스 자기 자신(인스턴스 자신)의 주소값 갖는 참조변수 
		 * 
		 * 2. this의 3가지 용도
		 * 	1) 멤버를 가리킬 때의 this 용도
		 * 	2) 생성자에서 또 다른 생성자를 호출할 때의 this
		 * 		- 생성자 호출 시기?
		 * 	3) 단독(홀로) 사용될 때의 this 용도
		 * 		- 매개변수 : ex06_02.java
		 * 		- 리턴값	: Ex06_03. java
		 * 
		 * 
		 * */

		 //Person p1 = new Person();
		 // 객체명.멤버(필드, 메서드)...
		 // p1.name
		
		Person p2 = new Person(); // 디폴트 생성자 호출
		System.out.println(p2.name);
		
		
		 
	} // main

} // class
