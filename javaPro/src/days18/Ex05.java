package days18;

/**
 * @author msg
 * @date 2025. 2. 26. - 오후 12:25:30
 * @subject Chapter 11 예외처리 p.466
 * @content
 */
public class Ex05 {

	public static void main(String[] args) {
		/*
		 * [예외처리(Exception Handling)]
		 * 1. 오류(에러) : 프로그램 실행 중에 오작동 또는 비정상 종료되는 원인
		 * 2. 오류 발생 시점에 따라 
		 * 	1) 컴파일 오류 -> 문법에 맞게
		 * 		int a ;x -> 문법 에러(syntax)
		 * 	2) 실행 오류 == 런타임(Runtime) 오류
		 * 		int [] m = null;
		 * 		m[0] = 100;      -> m = new int [10] : 예외처리
		 * 		(1) 에러(Error): 복구할 수 없는 심각한 오류
		 * 						메모리 부족, 스택 오버플로우 등 (시스템적 문제)
		 * 			Error 부모클래스
		 * 				ㄴ Error 자식클래스..
		 * 		(2) 예외(Exception): 에러보다 덜 심각한 비교적 수습될 수 있는 실행 오류
		 * 			Exception 부모클래스
		 *  			ㄴ Exception 자식 클래스
		 *  3) 논리적 오류( 가장 어려운 오류 )
		 *  	int i = Integer.MAX_VALUEl;
		 *  	int j = i+100;
		 *  	syso(j) // i 크기에 따라 났다 안났다.. 
		 * 빌드오류: 컴파일+실행오류
		 * */ 
		
		/*
		 * java.lang.NullPoint~ 예외
		 * JVM 안에 "예외처리기"가 발생한 예외를 예외객체(NullPointer~) 생성해서 
		 * 개발자에게 예외 처리하도록 알려줌 -> 예외 처리(고침)
		 * 
		 * [예외 처리]
		 * - 프로그램 실행 시 발생할 수 있는 예기치 못한 예외의 발생에 대비한 코드를 작성하는 것. 
		 * 
		 * 							Object
		 * 								↑
		 * 							throwable
		 * 								↑
		 * 				Exception				Error
		 * 					↑
		 * 				RuntimeException IOException..
		 * 					ㄴ NullpointerException
		 * 					ㄴ ArithmeticException
		 * 					등
		 * 
		 * ***[예외처리 방법]***
		 * 	1. try~catch 문 사용
		 * 	2. throws 문 사용
		 * */ 

	} // main

} // class
