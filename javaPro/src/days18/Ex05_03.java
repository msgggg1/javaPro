package days18;

import java.util.Arrays;
import java.util.Random;

/**
 * @author msg
 * @date 2025. 2. 26. - 오후 2:09:25
 * @subject 1) try~catch 문 사용해서 예외 처리
 * @content 
 */
public class Ex05_03 {

	public static void main(String[] args) {
		int number = 100;
		int result = 0;
		
		Random rnd = new Random();
		int n = -1;
		
		int [] m = new int [5];
		

		
		for (int i = 0; i < 10; i++) {
			// ArrayIndexOutOfBoundsException
			try {
				n = rnd.nextInt(5);
				result = number / n ; // 예외발생예상되는 코딩블럭 찾기 -> try에 놓기
				m[i] = result; 
				System.out.println(result);
				/*
				try {
				m[i] = result;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("배열크기 부족으로 출력 및 저장");
			} // catch
			*/
			
				
				
			
			} catch (ArithmeticException e) { //  오류 발생 -> 바로 catch로 넘거감/업캐스팅. 예외가 발생했을때만 처리
				i--;
				//System.out.println(e.toString());
			} catch (ArrayIndexOutOfBoundsException e) { //멀티 catch 블럭
				i--;
				m = Arrays.copyOf(m, m.length + 5); // 5늘리는 코딩
//				System.out.println("배열크기 부족으로 출력 및 저장X");
			} catch (Exception e) { // exception에는 걸릴것 // 다중 catch 블럭 사용시에는 자식 exception catch블럭을 먼저 코딩한다.(x->처음부터 걸림, 만나지 못함) 
				//
			}// try
			
			
		} // for i

	} // main

} // class
