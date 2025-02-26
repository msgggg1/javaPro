package days18;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author msg
 * @date 2025. 2. 26. - 오후 2:48:47
 * @subject 예외처리 2번째 방법 		: throw[s]문 설명
 * @content	예외를 강제로 발생시키는 문 : throw문 설명
 */
public class Ex08 {

	public static void main(String[] args) /*throws IOException*/ {//main함수에게 떠넘김 예외처리 안하겠다
		
		//System.in.read(); 이해

		// 국어점수를 입력받아서 수~가 출력.
		int kor = 0;
		try { // 일 하는 사람에게 물어봐라
			kor = getScore();
		System.out.println("kor="+kor);
		} catch (IOException e) {
			System.out.println("점수범위 0~100");	// 스레드 따로써서 아무때나 나옴
		}
		
		
		System.out.println("end");
		
	} // main

	private static int getScore() throws IOException/*, 예외나열*/ { // 일 시킨 사람에게 물어봐라. 예외처리 여기서 x
		Scanner scanner = new Scanner(System.in);
		int score = 0;
		
		System.out.print("> 점수입력?");
		String input = scanner.next();// "90"
		
		//0~100유효성 검사
		String regex = "^(100|[1-9]?\\d)$";
		
		if (input.matches(regex)) {
			score = Integer.parseInt(input);
		} else {
			// 강제 예외 발생시키겠다. : throw문 사용
			//throw 발생시키고자하는 예외객체 
			throw new IOException("점수범위 0~100");		  // 오류O checked
//			throw new ArithmeticException("점수범위 0~100"); // 오류x unchecked
		}
		
		return score;
	}

} // class
