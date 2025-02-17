package days10;

import java.util.Iterator;


/**
 * @author msg
 * @date 2025. 2. 14. - 오후 12:08:04
 * @subject
 * @content
 */

public class Ex03_03 {

	public static void main(String[] args) {
		// [별 찍기 -2]
		// *
		// **
		// ***
		// ****

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 5-i; j++) {
				System.out.print("*");
			} // for j
			System.out.println();
		} // for i
		
		
		

	} // main


} // class


