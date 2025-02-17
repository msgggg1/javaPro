package days08;

import java.util.Scanner;

/**
 * @author msg
 * @date 2025. 2. 12. - 오전 10:18:32
 * @subject
 * @content
 */
public class Ex01 {

	public static void main(String[] args) {
		// [정처기 실기]
		// 1+2+4+7 ---
		// 반복 몇번 모름 -> while
		
		int sum = 0;
		int term = 1;
		int inc = 1;
		
		while ( term < 100) {
			sum += term;
			System.out.printf("%d+",term);
			term += inc;
			inc ++ ;
		} //  while
		
		System.out.printf("=%d",sum);
				
		
//		int sum = 0;
//		int term = 1;
//		int inc = 1;
//		
//		while (term < 100) {
//			sum += term;
//			System.out.printf("%d+",term);
//			term += inc ++;
//		} //  while
//		
//		System.out.printf("\b=%d\n",sum);
		
		
	} // main

} // class
