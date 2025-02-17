package days10;

import java.util.Iterator;

/**
 * @author msg
 * @date 2025. 2. 14. - 오후 2:06:53
 * @subject
 * @content
 */

public class Ex03_07 {

	public static void main(String[] args) {
		  // __*
	      // _***
	      // *****
	      // _***
	      // __*
		
//		[2]
		for (int i = 1; i <= 5; i++) {
	         for (int j = 1; j <= 5; j++) {
	          
	            System.out.print( i+j>=4 && j-i<=2 && i-j<=2 && i+j<=8?"*":" ");
	         } // for j
	         System.out.println();
	      } // for i 

		
		

		
//			for (int i = 1; i <= 3; i++) {
//				for (int j = 1; j <= 3-i; j++) {
//					System.out.print("_");
//				} // for j
//				for (int j = 1; j <= 2*i -1 ; j++) {
//					System.out.print("*");
//				} // for j
//				System.out.println();
//			} // for i
//			for (int i = 1; i <=2; i++) {
//				for (int j = 1; j <= i; j++) {
//					System.out.print("_");
//				} // for j
//				for (int j = 1; j <= 5-2*i ; j++) {
//					System.out.print("*");
//				} // for j
//				System.out.println();
//			} // for i
			
			
	

	} // main

} // class
