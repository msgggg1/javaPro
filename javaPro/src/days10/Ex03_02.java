package days10;

import java.util.Iterator;

/**
 * @author msg
 * @date 2025. 2. 14. - 오전 11:46:49
 * @subject
 * @content
 */
public class Ex03_02 {

	public static void main(String[] args) {
		// [별 찍기 -2]
		// *
		// **
		// ***
		// ****
		
//		[2]
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.print(i>=j?"*":" ");
			} // for j
		} // for i
		
		
		
//		[1]
//		for (int i = 1; i <= 4; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.printf("*");
//			} // for j
//			System.out.println();
//		} // for i
		
		
		
		
		
//		for (int i = 1; i <=4; i++) {
//			for (int j = 1; j <=3; j++) {
//			
//				for (int j2 = 1; j2 <= 2; j2++) {
//					for (int k = 1; k <= 1; k++) {
//						System.out.print("*");
//						System.out.println();
//					} // for k
//					System.out.print("*");
//				} // for j2
//				System.out.print("*");
//			} // for j2
//			System.out.print("*");
//		} // for j

	} // main


} // class


