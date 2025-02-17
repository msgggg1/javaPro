package days06;

import java.util.Scanner;

/**
 * @author msg
 * @date 2025. 2. 10. - 오후 1:51:56
 * @subject
 * @content
 */

public class Ex04_05 {

	public static void main(String[] args) {
			// Ex04_05.java  세 정수를 입력받아서 세 정수 중의 가장 큰값, 가장 작은 값을 구해서 출력.
		
		  int n, m, l ;
		  
	      Scanner scanner = new Scanner(System.in);
	      System.out.print("> 양의 정수( n m l ) 입력 ? ");
	      n = scanner.nextInt();
	      m = scanner.nextInt();   
	      l = scanner.nextInt(); 
	      
	      // 삼항연산자
	      // int max = n > m ? ( n > o? n: o)...
	      
	      int max = Math.max(Math.max(n, m),l );
	      int min = Math.min(Math.min(n, m), l);
	      
	      System.out.printf("%d,%d",max,min);

	} // main

} //class
