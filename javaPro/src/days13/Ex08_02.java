package days13;

import java.util.Arrays;

/**
 * @author msg
 * @date 2025. 2. 19. - 오후 4:05:31
 * @subject
 * @content
 */

public class Ex08_02 {

	public static void main(String[] args) {
		//      4행 3열  2차원 배열 m
		int [][] m = {
				{1,2,3},
				{4,5,6},
				{7,8,9},
				{10,11,12}
		};

		// 1차원 배열 n
		int [] n = new int[m.length * m[0].length];

		// 2차원 배열 m 을  1차원 배열 n으로 변환시켜서 배열 n을 출력.
		/* 0 0,0
		 * 1 0,1
		 * 2 0,2
		 * 
		 * 3 1,0
		 * 4 1,1
		 * 5 1,2
		 * 
		 * 6 2,0
		 * 7 2,1
		 * 8 2,2
		
		 * */
		int leng = m[0].length;
		for (int i = 0; i < n.length; i++) { 
			n[i] = m[i/leng][i%leng];
		} // for i
		
		System.out.println(Arrays.toString(n));
		
    

	} // main

} // class
