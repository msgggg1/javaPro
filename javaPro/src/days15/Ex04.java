package days15;

import java.util.Date;

/**
 * @author msg
 * @date 2025. 2. 21. - 오후 12:11:43
 * @subject
 * @content p.220
 */

public class Ex04 {
	
	//메소드와 비교
	// 접 기 리턴자료형 메소드명(){}
	
	// 생성자(constructor)
	//접,기 올수있음. 리턴자료형x 함수이름 = 파일명
	/*public*/ Ex04(){
		
	}

	public static void main(String[] args) {
		/*
		 * [생성자(constructor)] p.220
		 * 1. 일종의 메서드이다. (함수다)
		 * 2. 리턴자료형 아예 안붙임. void도 x
		 * 3. 반드시 메서드명은 클래스명과 동일하게 설정.
		 * 4. "디폴트 생성자(default constructor)": 매개변수 없는 생성자
		 * 5. 생성자의 역할 : 필드 초기화 -> 리턴할 필요가 없음
		 * 6. 생성자 호출되는 시기: 인위적으로 생성자를 호출할 수 없다. (호출하고싶다고 할수없음)
		 * 						객체를 생성할때만 자동으로 호출
		 * 7. 제한자(modifier) 사용할 수 있다.
		 * 8. 생성자도 오버로딩이 가능하다. (중복 선언 가능)
		 * 9. 생성자는 상속되지 않는다. 
		 * 10. 생성자가 하나도 없는 경우에는 컴파일러가 자동으로 디폴트 생성자를 추가한다. // 디폴트x.+ (); -> 에러
		 * */
	
//		[1] 생성자 없을때 객체생성, 필드초기화 각각
//		MyPoint p1 = new MyPoint();
//		// x, y 필드 초기화 (= 값 설정)
//		p1.x = 10;
//		p1.y = 20;
		
//		new MyPoint();
		
//		The constructor MyPoint(int, int) is undefined 
		MyPoint p1 = new MyPoint(10,20);// (); 객체생성시 무조건 생성자 함수 호출.생성자 함수의 매개변수를 넘기겠다. 빈();매개변수없는 생성자 함수 넘긴다는 뜻
		p1.dispMyPoint();
		
		/*
		Date d = new Date();
		d.setYear(2000-1900);   // getter, setter
		d.setMonth(10-1);
		*/
		Date d = new Date(2000-1900, 10-1, 1);
		System.out.println( d.toLocaleString() );
		
	} // main

} // class



