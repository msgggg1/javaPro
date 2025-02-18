package days12;

import java.util.Arrays;
import java.util.Iterator;

/**
 * @author msg
 * @date 2025. 2. 18. - 오전 10:43:14
 * @subject 정렬(sort) 
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {

		// ASC (a,b) a>b 자리바꿈.
		int [] m = {3,5,2,4,1};

		System.out.println(Arrays.toString(m));

		//		bubbleSort(m);
		//		selectionSort(m);
		//  	selectionSort2(m);
				insertionSort(m);
		
//		Arrays.sort(m);

		System.out.println(Arrays.toString(m));

	} // main

	private static void insertionSort(int [] m) {
		//삽입정렬: 두번째 위치부터 시작해 왼쪽의 값들과 비교해서 
		//		  삽입될 위치를 지정한 후, 뒤로 값을 밀고
		//        삽입될 위치에 값을 삽입해 정렬
		//			작은 값을 찾는 검색 과정이 필요없다.
//		for (int i = 1; i < m.length; i++) {
//			int minIndex = i-1;
//			for (int j = 0; j < i; j++) {
//				
//				if (m[j]>m[i]) {
//					minIndex = j;
//					int temp = m[i];
//					m[i]=m[minIndex];
//					m[minIndex] = temp;
//				}
//			    else minIndex = i;
//				
//				
//			} // for j
//			System.out.println(Arrays.toString(m));
//		} // for i
		
		int key; // 삽입할 값
			for (int i = 1; i < m.length; i++) {
				key = m[i];
				while (j >= 0 && m[j] > key
						
						) {
					
				} //  while
			} // for i
		
		
//		int key; // 삽입할 값
//	      for (int i = 1, j; i < m.length; i++) {
//	         System.out.printf("%d - ", i);
//	         key = m[i];
//	         // while 조건반복문이 더 좋음
//	         for (j = i-1; j >= 0 && m[j] > key; j--) {
//	            m[j+1] = m[j];
//	         } // for j
//	         m[++j] = key;
//	         System.out.println(Arrays.toString(m));
//	      } // for i
		
	} // insertionSort

	private static void selectionSort2(int[] m) {

		for (int i = 0, minIndex; i < m.length - 1; i++) {
			minIndex = i;
			for (int j = i+1; j < m.length; j++) {
				if (m[minIndex]>m[j]) {
					minIndex = j;
				} // if
			} // for j
			if (i != minIndex) {
				int temp = m[i];
				m[i] = m[minIndex];
				m[minIndex] = temp;

			} // if


		} // for i

		System.out.println(Arrays.toString(m));

	} // selectinSort2

	private static void selectionSort(int[] m) {
		for (int i = 0; i < m.length - 1; i++) {// 2 234    3 34
			for (int j = i+1 ; j <= 4; j++) {
				System.out.printf("(%d,%d) ", i, j);
				if ( m[i] > m[j]) {
					System.out.print(" *** ");
					int temp = m[j];
					m[j] = m[i];
					m[i] = temp;
				}
			} // for j
			System.out.println();
		} // for i

	} // selectionSort

	private static void bubbleSort(int[] m) {
		/*      0 1 2 3 4  index
		 *       3 5 2 4 1  value
		 * 
		 * (0,1) (1,2) (2,3) (3,4)   1회전  0    4
		 * (0,1) (1,2) (2,3)         2회전  1    3
		 * (0,1) (1,2)               3회전  2    2
		 * (0,1)                     4회전  3    1
		 */
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4-i; j++) {
				if ( m[j] > m[j+1]) {
					System.out.printf("(%d,%d)", j, j+1);
					System.out.print(" *** ");
					int temp = m[j];
					m[j] = m[j+1];
					m[j+1] = temp;
				} // if
				System.out.println(Arrays.toString(m));
			} // for j
			System.out.println();

		} // for i


	} // bulbbleSort

} // class
