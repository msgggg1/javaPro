package days13;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author msg
 * @date 2025. 2. 19. - 오후 12:15:59
 * @subject 검색 search
 * @content ㄴ 항목의 집합 중에 특정 항목을 찾아내는 것.
 * 			1) 순차 검색( Sequence Search )
 * 			2) 이진 검색( Binary Search )
 * 
 * 			문제) 찾고자하는 정수의 모든 위치값 출력되도록
 */

public class Ex05_04 {

	public static void main(String[] args) {
	      // 30개      0~20 정수
	      int [] m = { 0, 2, 12, 16, 7, 9, 2, 9, 0, 13, 7, 13, 3, 14, 10
	            , 15, 11, 6, 19, 5, 2, 0, 16, 18, 15, 18, 0, 9, 13, 16 };
	      
	      Scanner scanner = new Scanner(System.in);
	      System.out.print("> 배열에서 찾을 정수 입력 ? ");
	      int n = scanner.nextInt(); // 12
	       
	      int fromIndex = 0 ;
	      int index = -1;
	      while (  ( index = sequenceSearch(m, n, fromIndex) ) != -1     ) {
	          System.out.println(index);
	          fromIndex = index + 1;
	      } // while


	   } // main
	   
	   private static int sequenceSearch(int[] m, int n, int fromIndex) {
		      int index = -1; 
		      for (int i = fromIndex; i < m.length; i++) {
		         if( m[i] == n ) return i;         
		      } // for i      
		      return  index;
		   } 

	    

	} // class
