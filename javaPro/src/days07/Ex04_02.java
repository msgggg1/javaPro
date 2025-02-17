package days07;

import java.util.Iterator;

/**
 * @author msg
 * @date 2025. 2. 11. - 오후 12:19:51
 * @subject
 * @content
 */
public class Ex04_02 {

	public static void main(String[] args) {
		// [for문] 구구단 가로 출력 -> 세로 출력
		
		for (int d = 1; d <= 9; d++) {
			for (int i = 2; i <= 5; i++) {
				System.out.printf("%d*%d=%2d ",i, d, d*i);
				
				if (i == 6) {
					System.out.println();
					System.out.println();
				}		
			}
				
		    for (int j = 6; j <= 9; j++) {
					System.out.printf("%d*%d=%2d ",j, d, d*j);
				
			} // for i

			System.out.println();
		} // for d


	} // main

}
// class
