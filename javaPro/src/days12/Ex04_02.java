package days12;

import java.util.Arrays;

public class Ex04_02 {

	public static void main(String[] args) {

		/*
		 * [병합 정렬(merge sort)]
		 *  ㄴ 1) 이미 정렬되어져 있는 두 개의 배열을 합쳐서 하나의 배열로 만드는 정렬 방식
		 * 
		 * */
		int [] m = {1,3,6,10,14};
		int [] n = {2,4,7};
		
//		int [] mn = new int[m.length + n.length];
		int [] mn = mergeSort(m,n);
		
		System.out.println(Arrays.toString(mn));

	} // main

	private static int[] mergeSort(int[] m, int[] n) {
		int [] mn = new int[m.length + n.length];
		int mIndex = 0;
		int nIndex = 0;
		int mnIndex = 0;
		
		while (mnIndex < m.length && mnIndex < n.length ) {	
			if (m[mIndex]>n[nIndex]) {
				mn[mnIndex] = n[nIndex]; 
				nIndex ++;
				mnIndex ++;
				
			} else { 
				mn[mnIndex] = m[mIndex] ; 
				mIndex ++;
				mnIndex ++;
			}
			
		} //  while
		
		
		return mn;
	}

} // class
