package days06;

import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {
		//로또 중복없이 6개
		
	 /*   for (int i = 1; i <= 6; i++) {
	    	int n = (int)Math.random()*45 + 1;
			System.out.println( n );
		} // for i */
		
/*	      int lotto1, lotto2, lotto3, lotto4, lotto5, lotto6;
	      int n ;// 
	      n =  (int)( Math.random()*45)+1;
	      // 1
	      lotto1 = n;
	      // 2
	      n =  (int)( Math.random()*45)+1;
	      if( lotto1 == n ) {
	         n =  (int)( Math.random()*45)+1;
	         if (lotto1 == n) {
	            n =  (int)( Math.random()*45)+1;
	            if (lotto1 == n) {
	               n =  (int)( Math.random()*45)+1;
	               if (lotto1 == n) {
	                  n =  (int)( Math.random()*45)+1;
	                  if (lotto1 == n) {
	                     
	                  } else {
	                     lotto2 = n;
	                  } // if
	               } else {
	                  lotto2 = n;
	               } // if
	            } else {
	               lotto2 = n;
	            } // if
	         } else {
	            lotto2 = n;
	         } // if
	      }else {
	         lotto2 = n;
	      }
	      */
	    
	    // 배열 선언
	    
	    //[0][0][0][0][0][0] 초기화
		
	    int index = 0, n; //위치값 저장 변수
	    int [] lotto = new int [6];
	    
	    lotto[index++] = (int)(Math.random()*45) + 1;
	    
	    
	    while (index <= 5) {
	    	
	    	n = (int)(Math.random()*45) + 1;
	    	
	    	//중복거르기
	    	int flag = 0; // boolean flag = false;
	    	for (int i = 0; i < index ; i++) {
				if (lotto[i] == n) {
					System.out.println("*");
					flag = 1; //flag = true;
					break ; 
				} // if	 
	    
		} //  for
	    		if ( flag == 0 ) lotto[index++] = n;  //if(!flag)
	    }
	    
	    System.out.println(Arrays.toString(lotto));
	    
	    
	} // main

} // class
