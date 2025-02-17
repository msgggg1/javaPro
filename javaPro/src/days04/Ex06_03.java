package days04;

import java.util.Scanner;

/**
 * @author msg
 * @date 2025. 2. 6. - 오후 3:33:58
 * @subject
 * @content
 */
public class Ex06_03 {

	public static void main(String[] args) {
		// [문제] if 문 사용, if ~else문
		// 국어 점수를 입력받아서
		// 수/우/미/양/가
		// 출력
		// 수  90 이상   100 이하
		// 우  80 이상   90 미만
		// 미  70 이상   80 미만
		// 양  60 이상   70 미만
		// 가  0 이상    60 미만

		/*int kor;
		Scanner scanner = new Scanner(System.in);
		System.out.println("국어 점수?"); //0<=  <=100
		kor = scanner.nextInt();
		
		if(0 <= kor && kor <= 100)
		
		
		if (90 <= kor && kor <= 100) {
			System.out.println("수");
			} // if
		if (80 <= kor && kor < 90) {
			System.out.println("우");
		} // if
		if (70 <= kor && kor < 80) {
			System.out.println("미");
		} // if
		if (60 <= kor && kor <= 70) {
			System.out.println("양");
		} // if
		if (0 <= kor && kor <= 60) {
			System.out.println("가");
		} // if 
		*/
		
		
		int kor;
		Scanner scanner = new Scanner(System.in);
		System.out.println("국어 점수?");
		kor = scanner.nextInt();
		
		if (90 <= kor && kor <= 100) {
			System.out.println("수");	
		} else { 
			if (80 <= kor && kor < 90) {
				System.out.println("우");
			} else {
				if (70 <= kor && kor < 80) {
					System.out.println("미");
				} else {
					if (60 <= kor && kor <= 70) {
						System.out.println("양");
					} else {
						System.out.println("가");
					}
					}
					}	
					} //else1

					} // main

				} // class
