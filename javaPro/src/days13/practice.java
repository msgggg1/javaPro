package days13;

import java.util.Arrays;
import java.util.Scanner;

public class practice {

	public static void main(String[] args) {

				// 정보처리 기사 실기
				int [][] m = new int[5][5];

//				 fillM01(m);
//				 fillM02(m);
//				fillM03(m);
				fillM04(m);
				

				dispM(m);
			} // main

			private static void dispM(int[][] m) {
				System.out.println("    [0열][1열][2열][3열][4열]");
				for (int i = 0; i < m.length; i++) {
					System.out.printf("[%d]행", i);
					for (int j = 0; j < m[i].length; j++) {
						System.out.printf("[%2d]",m[i][j]);
					} //for
					System.out.println();
				} //for
		
	} //dispM

			/*
		    0열 1열 2열 3열 4열
		0행 [ 5][10][15][20][25]
		1행 [ 4][ 9][14][19][24]
		2행 [ 3][ 8][13][18][23]
		3행 [ 2][ 7][12][17][22]
		4행 [ 1][ 6][11][16][21]
		*/
			private static void fillM04(int[][] m) {
				// [1] 값
				/*
				for (int i = 0; i < m.length; i++) {           // 행크기			 
					for (int j = 0; j < m[i].length; j++) {    // 열크기
						   m[i][j] = 5-i + j*5;				   
					} // for j
				} // for i
				*/
				
				// [2] 방(요소) 
				/* 00  40
				 * 01  30
				 * 02  20
				 * 03  10
				 * 04  00
				 * 
				 * 10  41
				 * 11  31
				 * 12  21
				 * 13  11
				 * 14  01
				 *  
				 * */
				for (int i = 0; i < m.length; i++) {           // 행크기			 
					for (int j = 0; j < m[i].length; j++) {    // 열크기
						 m[4-j][i] = 5*i+j+1;
					} // for j
				} // for i
			 

			}

			/*
		    0열 1열 2열 3열 4열
		0행 [ 1][ 2][ 3][ 4][ 5]
		1행 [10][ 9][ 8][ 7][ 6]
		2행 [11][12][13][14][15]
		3행 [20][19][18][17][16]
		4행 [21][22][23][24][25]
			 */		
			private static void fillM03(int[][] m) {
				
//				for (int i = 0; i < m.length; i++) {
//					for (int j = 0; j < m[i].length; j++) {
//						m[i][j] = (i%2 == 0) ? 5*i+j+1 :5*i+5-j  ;
//					} //for
//				} //for
//			}
				
				for (int i = 0; i < m.length; i++) {
					for (int j = 0; j < m[i].length; j++) {
						m[i][i%2==0?j:4-j] = 5*i+j+1;
					} //for
				} //for
			}
				




			private static void fillM02(int[][] m) {
				/*
				 * i=0 j=01234
				 * i=1 j=01234
				 * i=2 j=01234
				 * i=3 j=01234
				 * i=4 j=01234
				 */
				for (int i = 0, v = 1; i < m.length; i++) {
					for (int j = 0; j < m[i].length; j++, v++) {
						m[i][j] = 5*(5-i)-j;
					} //for
				} //for
			} //m02
			

			private static void fillM01(int[][] m) {
				for (int i = 0; i < m.length; i++) {
					for (int j = 0, v = 1; j < m[i].length; j++, v++) {
						m[i][j] = v;
					} //for
				} //for
			}





} // class
