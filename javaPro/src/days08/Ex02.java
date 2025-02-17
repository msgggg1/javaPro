package days08;

/**
 * @author msg
 * @date 2025. 2. 12. - 오전 10:45:38
 * @subject
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
		// [정처기]피보나치 수열
		//		10항의 합
		// 1+1+2+3+5     =???  
//		n1 = 1 
//		n2 = 1
//		n3 = n1+n2 
//		n4 = n1 + 2*n2 = n3+n2  
//		n5 = 2*n1 + 3n2 = n4+n3
//		n6 = 3*n1 + 5*n2
//		
//		int sum = 0;
//		int term1 = 1;
//		int term2 = 1;
//		int term = 2;
//		int inc1 = 0;
//		int inc2 = 0;
//		
//		
//		for (int i = 1; i <= 10; i++) {
//			term =  i   i+1
//		} // for i

		int [] m = new int [10];
		m[0] = m[1] = 1;
		int sum = 2;
		 System.out.printf("%d+%d+", m[0], m[1]);
		
		for (int i = 2; i < m.length; i++) {
			m[i] = m[i-2] + m[i-1];
			System.out.printf("%d+", m[i]);
			sum += m[i];
		} // for i
		
		 System.out.printf("=%d", sum);

		
		 // [2]
//	      int firstTerm = 1, secondTerm = 1, thirdTerm;
//	      int sum = firstTerm + secondTerm; // 2
//	      System.out.printf("%d+%d+", firstTerm, secondTerm);
//	      int termLength = 2;
//	      
//	      while (  termLength < 10 ) {
//	         thirdTerm = firstTerm + secondTerm;         
//	         System.out.printf("%d+", thirdTerm);
//	         sum += thirdTerm;
//	         
//	         firstTerm = secondTerm; 
//	         secondTerm = thirdTerm;         
//	         termLength++;
//	         
//	      } // while
//	      
//	      System.out.printf("=%d", sum);
//	      
		
		
//		[1] 
//		int[] m = new int[10];
//	      m[0] = m[1] = 1;
//	      int sum = 2;
//	      System.out.printf("%d+%d+", m[0], m[1]);  // 1+1+      
//	      for (int i = 2; i < m.length; i++) {
//	         m[i] = m[i - 2] + m[i - 1]  ;
//	         sum += m[i];
//	         System.out.printf("%d+", m[i]);
//	      } // for
//	      System.out.printf("\b=%d", sum);
	      
	      
				

	} // main

} // class
