package days02;

/**
 * @author msg
 * @date 2025. 2. 4. - 오전 11:03:34
 * @subject
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		// 1) 문자열 자료형 String
		// 2) 실수 자료형  double
		String name = "김민선";
		double avg = 98.87;
		// 3) 정수 자료형  int
		//   > 나이 저장 변수 선언
				int age = 26 + 1;
				// 연산자 우선순위: * > +
				// 우선순위: 덧셈 연산자>대입연산자
				// + 덧셈연산자
				// = 연산자 : 대입(할당)연산자 : 우측항의 값을 좌측 기억공간에 대입(할당)
		System.out.println(age);
		System.out.println(age+1);
		
		// [출력형식] 나이는 26살입니다.
		// 연산자 처리 방향 (왼 -> 오)
		System.out.println("나이는" + age+"살입니다.");
	}

}
