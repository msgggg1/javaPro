package days12;

import java.util.Iterator;

/**
 * @author msg
 * @date 2025. 2. 18. - 오후 5:11:16
 * @subject
 * @content
 */
public class Ex08 {

	public static void main(String[] args) {
		
//		// 1차원 배열
//		int [] m = new int [10];
//		// 1차원 배열의 크기 = 배열명.length
//		System.out.println(m.length);
//		dispM(m);

		// 2차원 배열
		int [][] m = new int [3][4];
		System.out.println(m.length); // 행크기
		System.out.println(m[1].length); // 열크기
		
//		 m[0]        m[1]    m[2] m[3]
//	    [0x200][0x300][][]                                   [0x100주소]
//		 0x100                                                   m 
//			 
//	    [4바이트][4바이트][4바이트]
//		 0x200 
//			      
//		[4바이트][4바이트][4바이트]
//		 0x300
//		
		dispM(m);
		
		
	} // main



	private static void dispM(int[][] m) {
		for (int i = 0; i < m.length; i++) { // 행
			for (int j = 0; j < m[i].length; j++) { // 열
				System.out.printf("m[%d][%d]=%d", i, j, m[i][j]);
			} // for j
			System.out.println();
		} // for i
		
	}



	private static void dispM(int[] m) {
		for (int i = 0; i < m.length; i++) {
			System.out.printf("m[%d]=%d", i, m[i]);
			
		} // for i
		System.out.println();
	} // dispM

} // class
