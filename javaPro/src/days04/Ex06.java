package days04;

import java.util.Scanner;

/**
 * @author msg
 * @date 2025. 2. 6. - 오후 2:16:08
 * @subject 조건문 : if 문
 * @content
 */
public class Ex06 {

	public static void main(String[] args) {
		// 입력받은 정수(n)이 10보다 크다면 출력O, 출력X
		// 수식 : n > 10
		int n ;
		Scanner scanner = new Scanner(System.in);
		System.out.println("> 정수(n) 입력?");
		n = scanner.nextInt();
		// condition 참/거짓 조건식
		// if문의 {}블럭은 조건식이 참일 때만 실행
		if ( n > 10) {
			System.out.println("출력O");
		} // if
		
		System.out.println("end");
		
		
		
	} // main

} // class
