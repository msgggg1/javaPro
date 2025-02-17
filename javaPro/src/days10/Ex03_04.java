package days10;

import java.util.Iterator;


/**
 * @author msg
 * @date 2025. 2. 14. - 오후 12:08:04
 * @subject
 * @content
 */

public class Ex03_04 {

	public static void main(String[] args) {
		// [별 찍기 -4]
		// ****
		// _***
		// __**
		// ___*
		
		
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
		for (int i = 1; i <= 4; i++) {
			// 공백 찍기
			System.out.print(" ".repeat(i-1));
			for (int j = 1; j <= 5-i; j++) {
				System.out.print("*");
			} // for j
			
			System.out.println();
		} // for i
		
		
		//[3]
		
		
		

	} // main


} // class


