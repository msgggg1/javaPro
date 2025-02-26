package days18;

import java.util.Random;

/**
 * @author msg
 * @date 2025. 2. 26. - 오후 2:09:25
 * @subject 1) try~catch 문 사용해서 예외 처리
 * @content 
 */
public class Ex05_04 {

	public static void main(String[] args) {
		int number = 100;
		int result = 0;

		Random rnd = new Random();
		int n = -1;

		int [] m = new int [5];



		for (int i = 0; i < 10; i++) {
			// ArrayIndex~~
			try {
				n = rnd.nextInt(5);
				result = number / n ; // 예외발생예상되는 코딩블럭 찾기 -> try에 놓기
				m[i] = result; 
				System.out.println(result);

					//멀티 catch 블럭 - 선언시 or 연산자 사용
			} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) { //  오류 발생 -> 바로 catch로 넘거감/업캐스팅. 예외가 발생했을때만 처리
				i--;
				System.out.println(e.toString());
			} catch (Exception e) { 
				e.printStackTrace(); // 출력까지
				//e.getMessage();// String -> syso(e.getMessage)
			}// try


		} // for i

	} // main

} // class
