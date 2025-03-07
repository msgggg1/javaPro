package days14;

/**
 * @author msg
 * @date 2025. 2. 20. - 오후 2:01:04
 * @subject
 * @content
 */

public class Ex04 {
	
	/* 내부(inner) 클래스
	private static class X{
		
	} 
	
	protected class Y{
		
	}
	*/

	public static void main(String[] args) {
		
		/*
		 * [클래스 선언 시 앞에 붙는 접근지정자 설명]
			1. public			활성화
				ㄴ 패키지 내/외부에서 사용(참조, 상속) 가능하다. 
			3. default(package)	활성화
				ㄴ 패키지 내부에서만 사용(참조, 상속) 가능하다.
			
			- 중첩 클래스(=내부inner클래스)를 선언할 때만 사용할 수 있는 접근지정자
				ㄴ4가지 종류
			2. protected		비활성
				ㄴ 패키지 내부에서만 사용(참조, 상속) 가능하다.
				+ 패키지 외부에서는 상속만 가능하다. 
			4. private			비활성
				ㄴ같은 파일 내에서만 사용(참조, 상속) 가능하다.
				
				[클래스 선언 시 앞에 붙는 기타제어자 설명]
				1. abstract	활성화 : 추상 클래스
				2. final	활성화 : 최종 클래스
				3. static	비활성 : 정적 클래스
							ㄴ 중첩 클래스 선언 시에만(클래스 안의 클래스) 사용할 수 있는 키워드
		 * [멤버(필드, 메서드) 선언 시 앞에 붙는 접근지정자 설명]
		 *  1. public
			2. protected
			3. default(package)
			4. private
		 * 
		 * */
		
		// 같은 패키지 내부 (days14)이ㅣ기에 Ex04클래스에서 person 클래스 사용가능
		Person p1 = new Person();
		p1.name = "홍길동";
		p1.age = 20;
		p1.run();
		
		p1.age = 31;
		p1.run();

		
	} // main

} // class
