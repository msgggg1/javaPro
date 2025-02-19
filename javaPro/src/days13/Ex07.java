package days13;

import java.util.Arrays;

/**
 * @author msg
 * @date 2025. 2. 19. - 오후 3:29:18
 * @subject
 * @content
 */

public class Ex07 {

	public static void main(String[] args) {
		// 정처기 실기
		int [][] m = new int [5][5];

		//fillM01(m);
		//fillM02(m);
//		fillM03(m);
		fillM04(m);
		dispM(m);


	} // main

	private static void fillM04(int[][] m) {
	      /*
	       0열 1열 2열 3열 4열
	   0행 [ 5][10][15][20][25]
	   1행 [ 4][ 9][14][19][24]
	   2행 [ 3][ 8][13][18][23]
	   3행 [ 2][ 7][12][17][22]
	   4행 [ 1][ 6][11][16][21]
	   */
		
//		[1] 값
//		for (int i = 0; i < m.length; i++) {
//			for (int j = 0; j < m[i].length; j++) {
//				m[i][j] = (5-i)+5*j;
//			} // for j
//			System.out.println();
//		} // for i
		
		
//		[2] 방
		/*
		 * 
		 * 00 40
		 * 01 30
		 * 02 20
		 * 03 10
		 * 04 00
		 * 
		 * 
		 * */
		for (int i = 0 ; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[j][4-i] = 5*i+j+1;
			} // for j 00 11
			System.out.println();
		} // for i
		
		
	} // M04

	private static void fillM03(int[][] m) {
		//[1] 값찾기
//		[1][2][3][4][5]
//		[10][9][8][7][6]
//		[11][12][13][14][15]
//		[20][19][18][17][16]
//		[21][22][23][24][25]
		
		/*
		 * 1 0  10
		 * 1 1  9
		 * 1 2  8
		 * 1 3  7 
		 * 1 4  6
		 * 
		 * 3 0 20
		 * 3 1 19
		 * 3 2 18
		 * 3 3 17
		 * 3 4 16
		 * 
		 * */
				
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = 5*(5-i)-j;
			} // for j
			System.out.println();
		} // for i
				

		// [2] 방찾기
		/* 0 0  4 4
		 * 0 1  4 3
		 * 0 2  4 2
		 * 0 3  4 1
		 * 0 4  4 0
		 * 
		 * 1 0  3 4
		 * 1 1  3 3
		 * 1 2  3 2
		 * 1 3  3 1
		 * 1 4  3 0 
		 * */ 
		for (int i = 0, int v = 0; i < m.length; i++, v++) {           // 행크기          
			for (int j = 0; j < m[i].length; j++) {    // 열크기
				m[4-i][4-j] = v++;
			} // for j
		} // for i
	}


private static void fillM02(int[][] m) {
	for (int i = 0; i < m.length; i++) {
		System.out.printf("[%d행]", i);
		for (int j = 0; j < m[i].length; j++) {
			m[i][j] = 5*(5-i)-j;
			System.out.printf("[%2d]", m[i][j]);
		} // for j
		System.out.println();
	} // for i
	//				 * 00 25
	//				 * 01 24
	//				 * 02 23
	//				 * 03 22
	//				 * 04 21
	//				 
	//				 * 
	//				 * 1 0 20
	//				 * 1 1 18
	//				 * 
	//				 * 
	//				 * 20 14
	//				 * */
} // for j



private static void fillM01(int[][] m) {

	// v 변수 x, i,j 변수 사용
	for (int i = 0; i < m.length; i++) {
		for (int j = 0; j < m[i].length; j++) {
			m[i][j] = 5*(5-i)-j;
		} // for j
		System.out.println();
	} // for i

	/* v선언
		for (int i = 0, v=1; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++, v++) {
				m[i][j] = v;
			} // for j
		} // for i
	 */

} // fillM01

private static void dispM(int [][] m) {
	System.out.println("      0열  1열  2열  3열  4열");

	for (int i = 0; i < m.length; i++) {
		System.out.printf("[%d행]", i);
		for (int j = 0; j < m[i].length; j++) {
			System.out.printf("[%2d]", m[i][j]);
		} // for j
		System.out.println();
	} // for i

}

} // class
