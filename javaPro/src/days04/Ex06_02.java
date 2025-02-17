package days04;

import java.util.Scanner;

/**
 * @author msg
 * @date 2025. 2. 6. - 오후 2:16:08
 * @subject 조건문 : if 문
 * @content
 */
public class Ex06_02 {

	public static void main(String[] args) {
		// [문제]
		// 정수를 입력받아서 "홀수"/"짝수" 라고 출력
		
		int n ;
		//Resource leak: 'scanner' is never closed // scanner.close(); // 사용하고나면 닫아야함. 
		@SuppressWarnings("resource") // @어노테이션(annotation) : 알고있다
		Scanner scanner = new Scanner(System.in);
		System.out.println("> 정수(n) 입력?");   // 중단점(breakpoint, 디버깅위해서)
		n = scanner.nextInt();
		
		/*if ( n % 2 == 0) {
			System.out.println("짝수");
			
		} // if
		if ( n % 2 != 0) {
			System.out.println("홀수");
			
		} // if
		*/
		
		if (n % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		} // if
		
		
		
		
	
		System.out.println("end");
		
		
		
		
		
	} // main

} // class
