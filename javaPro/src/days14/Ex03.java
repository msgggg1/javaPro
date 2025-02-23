package days14;

/**
 * @author msg
 * @date 2025. 2. 20. - 오후 12:05:53
 * @subject
 * @content
 */

public class Ex03 {

	public static void main(String[] args) {
		int [] m ; // m: (지역)변수, 참조변수, 배열명

		//변수 선언 형식
//		자료형 변수명[=초기값];  // 참조타입 자료형
		Car myCar = null;
		// myCar : (지역)변수, 참조변수(주소값 담음), 객체명 // stack의 저장공간
		// 클래스? 객체의 설계도 					Car
		// 객체 ? 클래스로 선언된 참조변수				myCar
		// 인스턴스 ? new 연산자 클래스의 객체가 실제 힙 영역에 생성된 것.
		
		new Car(); //인스턴스화, 객체생성과정 // 이것만 있어도 문제는 안되나 부를 이름이 없음
		
		myCar = new Car();
		//저장공간 접근
		// 객체명. 필드명
		// 객체명.메서드명();
		myCar.name = "";
		myCar.dispCarInfo();
		
		// *****nullPointerException : new Car(); 인스턴스화 안됐다
		
		/*                                          Car 클래스
		 * 
		 *                                          [0x100]
		 *   인스턴스                                 myCar
		 *   [name][speed][wc][메주소]                변수
		 *   0x100                                   지역변수
		 *                                          참조변수
		 *                                          객체명
		 *                                          
		 *                                          
		 *               [dispCarInto()]
		 *               주소                            
		 * */
		
	
		
	} // main

} // class
