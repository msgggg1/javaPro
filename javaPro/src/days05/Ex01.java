package days05;

import java.util.Arrays;
import java.util.Iterator;

public class Ex01 {

	public static void main(String[] args) {
		// [암기] 배열은 초기화하지 않으면 그 자료형의 기본값으로 초기화되어져 있다.
		// int     -> 0
		// double  -> 0.0
		// String  -> null
		// boolean -> false
		// char    -> 널문자 '\u0000'
		
		
		// *** 배열 선언 + 각 요소 초기화 = 배열 초기화***
//		int [] kors = new int[] {89 , 34, 66};
		int [] kors = {89, 34 , 66};
		
		
		// 배열 선언
//		int [] kors = new int [3];
		
		// 각 요소 초기화
//		kors[0]=89; 
//		kors[1]=34; 
//		kors[2]=66;
		
		//arrays 클래스: 배열다루기 쉽게 여러 기능이 구현된 클래스
		System.out.println(Arrays.toString(kors));
		
		//System.out.println(kors[0]); // 0
		
		// 윗첨자값(upperbound) = 배열크기 -1
//		for (int i = 0; i <= kors.length -1 ; i++) {
//			System.out.println(kors[i]);
		
//		int upperBound = kors.length -1
//			for (int i = 0; i <= upperBound ; i++) {
//			System.out.println(kors[i]);
		
		int upperBound = kors.length - 1 ;
			for (int i = 0; i <= upperBound ; i++) {
			System.out.printf("kors[%d]=%d\n", i, kors[i]);
		} // for i

	}

}
