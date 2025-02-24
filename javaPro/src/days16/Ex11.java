package days16;

/**
 * @author msg
 * @date 2025. 2. 24. - 오후 4:48:31
 * @subject
 * @content
 */
public class Ex11 {

	public static void main(String[] args) {
		/*
		[ 상속 계층도 ]

	               Object            모든 클래스의 최상위 부모 클래스이다. 
	                 ↑                
	              Employee           
	           ↑                  ↑
	         Regular             Temp
	           ↑
	        SalesMan
	        
	           1. 상속성 정리
	           2. 다형성/인터페이스
	           3. 업캐스팅, 다운케스팅
	           4. 오버로딩/오버라이딩
	           5. 추상화(추상메소드, 추상클래스)
	           6. this, super 키워드 설명
	           7. final 키워드 설명.
			*/
		
		// 사원 객체 생성 후 사원정보 출력 메소드 호출
		
		// 2. 정규직 사원 객체 생성 + 호출
		Regular emp2 = new Regular("김도훈","서울시 당산동","","");
		
		//emp.dispEmpInfo 제정의
		
		
	} // main

} // class
