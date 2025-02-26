package days18;

import java.util.Random;

/**
 * @author msg
 * @date 2025. 2. 26. - 오후 12:46:44
 * @subject
 * @content
 */
public class Ex05_02 {

	public static void main(String[] args) {
		int number = 100;
		int result = 0;
		
		Random rnd = new Random();
		int n = -1;
		for (int i = 0; i < 10; i++) {
			n = rnd.nextInt(5);
			// 예외처리 X - 예외발생안해도 if문 계속 체크함. 예외가 발생했을때 처리하는 것 = 예외처리
			if (n ==0) {
				i--;
				continue;
			} // if
			result = number / n ;
			System.out.println(result);
		} // for i

	} // main

} // class
