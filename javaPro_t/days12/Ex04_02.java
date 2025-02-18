package days12;

/**
 * @author kenik
 * @date 2025. 2. 18. - 오후 2:00:32
 * @subject 
 * @content
 */
public class Ex04_02 {

	private static int[] mergeSort(int[] m, int[] n) {
	      int [] mn = new int[m.length + n.length];
	      //                   ↓  i=3
	      // int [] m = {1,3,6,10,14};
	        //                   ↓  j
	      // int [] n = {2,4,7};
	      //                                ↓ k
	      // int [] mn = [1, 0, 0, 0, 0, 0, 0, 0]
	      int i, j, k;
	      i = j = k = 0;
	      
	      /*
	      if (m[i] > n[j]) {
	         mn[k] = n[j];
	      } else {
	         mn[k] = m[i];
	      } // if
	      */ 
	      while ( i < m.length && j < n.length ) {
	         mn[k++] = m[i] > n[j]? n[j++] : m[i++];         
	      } // while
	      
	      if (i == m.length) { // 남은 배열 n
	         System.arraycopy(n, j, mn, k, n.length-j);
	      } else {  // 남은 배열 m
	         System.arraycopy(m, i, mn, k, m.length-i);
	      } // if
	      
	      System.out.println( Arrays.toString(mn));
	      return mn;

	} // main

} // class
