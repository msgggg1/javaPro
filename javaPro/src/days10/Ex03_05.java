package days10;

import java.util.Iterator;

/**
 * @author msg
 * @date 2025. 2. 14. - 오후 12:28:01
 * @subject
 * @content
 */
public class Ex03_05 {

	public static void main(String[] args) {
		// [별 찍기 -5]
		// ___*
		// __**
		// _***
		// ****

		//[3]
		for (int i = 1; i <= 3; i++) {
	         for (int j = 1; j <= 5; j++) {
	            //System.out.print( i+j==4 || i==3|| j-i==2?"*":" ");
	            //System.out.print( i+j>=4   ?"*":" ");
	            //System.out.print( j-i<=2 ?"*":" ");
	            System.out.print( i+j>=4 && j-i<=2  ?"*":" ");
	         } // for j
	         System.out.println();
	      } // for i 
		
//		for (int i = 1; i <= 4; i++) {
//			for (int j = 1; j <= 4-i; j++) {
//				System.out.print("_");
//			} // for j
//			for (int j = 1; j <= i ; j++) {
//				System.out.print("*");
//			} // for k
//			System.out.println();
//		} // for i
		
		//[1]
//		for (int i = 1; i <= 4; i++) {
//			for (int j = 1; j <= i-1; j++) {
//				System.out.print("_");
//			} // for j		
//			for (int j = 1; j <= 5-i; j++) {
//				System.out.print("*");
//			} // for j
//			
//			System.out.println();
//		} // for i
		
		//[2]
//		for (int i = 1; i <= 4; i++) {
//			// 공백 찍기
//			System.out.print(" ".repeat(i-1));
//			for (int j = 1; j <= 5-i; j++) {
//				System.out.print("*");
//			} // for j
//			
//			System.out.println();
		} // for i
		
		
		//[3]
		
		
		

	} // class





