package days18;

/**
 * @author msg
 * @date 2025. 2. 26. - 오전 10:03:49
 * @subject
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		/*
		 * [ 내부(inner) 클래스 ]
		 * 1. 사용빈도가 거의 없다. 개념정도만 이해하고 넘어가기.
		 * 2. 중첩 클래스 (클래스안의 클래스)
		 * 3. AWT, Swing과 같은 GUI애플리케이션(윈도우형 어플리케이션)에서 이벤트 처리할 목적으로 자주 사용.
		 * 		(자바는 윈도우형 어플 안만듬 d/t 생산성 떨어짐)
		 * 4. 내부 클래스의 종류와 특징 - 선언 위치에 따라
		 * 	1)  인스턴스 클래스 - 외부 클래스의 필드 위치 // class 필드, 메서드 바로 접근가능(this로 넘길필요 없음)
		 * 	2)	정적(static) 클래스 - 외부 클래스 필드 위치
		 * 	3)  지역(local) 클래스 - 외부 메서드 안, 초기화 블럭 안 선언
		 * 	4)	익명 == 무명(Anonymous) 클래스
		 * 		ㄴ 클래스의 선언부+ 객체 생성 부 합쳐진 경우=선언과 동시에 객체생성 합쳐진 이름없는 클래스 
		 * 		ㄴ 일회용. 
		 * 
		 * */ 

	} // main

} // class

//1)
class Outer{
	
	//필드
	int iv = 0; // 인스턴스 변수
	static int ic = 0; // 클래스 변수
	class InstanceClass{// 1. 인스턴스 클래스 // 다른 곳 어디에서도 쓰일 일 없는 경우(<->엔진) -> 사용빈도 낮음
		//주로 Outer(외부클래스)의 인스턴스 멤버들과 관련된 작업을 더 용이하게 하기 위한 목적
		
	}
	
	static class StaticClass{ // 2. 정적 클래스
		// 주로 외부클래스의 static 멤버들과 관련된 작업 할 목적
		// static 멤버처럼 사용된다. 다루어진다. 
	}
	
	{
		
		//인스턴스 초기화 블럭
		class LocalClass2{ // 3. 지역(local) 클래스
			
		}
	}
	
	//메서드
	void disp() {
		
		class LocalClass{ // 3. 지역(local) 클래스
			// 지역변수처럼
			// 해당 지역(영역)에서만 사용되는 클래스 
			
		}
		
	}
	// 생성자
	
}