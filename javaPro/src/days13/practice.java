package days13;

import java.util.Arrays;
import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		
		// 30개      0~20 정수
				int [] m = { 0, 2, 12, 16, 7, 9, 2, 9, 0, 13, 7, 13, 3, 14, 10
			            , 15, 11, 6, 19, 5, 2, 0, 16, 18, 15, 18, 0, 9, 13, 16 };

				Scanner scanner = new Scanner(System.in);
				System.out.print("> 배열에서 찾을 정수 입력?");
				int n = scanner.nextInt();
				
				
				// 찾는 값이 배열 속에 없다면 -1 반환
//				int index = sequenceSearch(m,n);
				
				int [] indexArr = sequenceSearch(m, n);
				System.out.println(Arrays.toString(indexArr));
				
				// 만약에 찾는 값이 배열 속에 없다면   -1 반환
			      // int index = sequenceSearch(m, n);
				
				if (indexArr.length != 0) {
					for (int i = 0; i < indexArr.length; i++) {
						System.out.printf("찾는 정수 %d는 %d 위치에 있다.\n", n, indexArr[i]);
					} else {
						System.out.println("찾는 정수는 없다.");
				} // if
			    
			      
			      /*
			      int i = 0;
			      int index;
			      while(   (index = indexArr[i++]) != -1  ) {  
			         System.out.printf("찾는 정수 %d는 %d 위치에 있다.\n", n, index);
			      } // while
			      */
//			        [1]
//			      while(true) {
//			         int index = indexArr[i++];
//			         if(  index == -1 ) break;
//			         System.out.printf("찾는 정수 %d는 %d 위치에 있다.\n", n, index);
//			      } // while
			        
			      /*
			      if (index != -1 ) {
			         System.out.printf("찾는 정수 %d는 %d 위치에 있다.", n, index);
			      } else {  // X
			         System.out.println("찾는 정수는 없다.");
			      } // if
			      */

			   } // main

	private static int[] sequenceSearch(int[] m, int n) {
		int [] temp = new int [m.length];
		Arrays.fill(temp, -1);
		
		int index = 0;
		for (int i = 0; i < m.length; i++) {
			if (m[i] == n) temp[index++] =  i;
		} // for i
		
		return Arrays.copyOf(temp, index);
	}
			      
			   

			   

		
	

} // class
