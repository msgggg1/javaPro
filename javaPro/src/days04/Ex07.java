package days04;

import java.util.Scanner;

/**
 * @author msg
 * @date 2025. 2. 6. - 오후 3:09:54
 * @subject 분기문 switch문
 * @content
 */
public class Ex07 {

	public static void main(String[] args) {
		// [문제] switch문 사용
		// 정수를 입력받아서 "홀수"/"짝수"fkrh cnffur
		
		int n ;
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수(n) 입력?");
		n = scanner.nextInt();
		// key : 수식, 변수 상수x(고정된 값)
		// value: 값(byte, short, int, char, String, 열거형(enum)타입), 변수x
		String result = null;
		switch (n % 2) {
		case 0:
			//System.out.println("짝수");
			result = "짝수";
			break;
		case 1:
			//System.out.println("홀수");
			result = "홀수";
			break;

		//default:
		//	System.out.println("홀수");
		//	break;
			
		} // switch
		
		System.out.println(result);
		
	} // main
/*switch (key) {
		case value: // 여러개 와도 상관x. 값O
			break;

		[default:
			break;] //생략가능. 값X, 위 case를 만족하지 않는 모든 경우
		} // switch  */
} // class
