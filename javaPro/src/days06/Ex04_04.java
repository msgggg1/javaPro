package days06;

import java.util.Scanner;

public class Ex04_04 {

	public static void main(String[] args) {
		  
		  int n, m ;
	      Scanner scanner = new Scanner(System.in);
	      System.out.print("> 양의 정수( n m ) 입력 ? ");
	      n = scanner.nextInt();
	      m = scanner.nextInt();   
	      
	      int sum = 0;
	      

			
	      int min = n > m ? m : n ; // Math.min(n,m);
	      int max = Math.max(n, m);
	      int i = min ;
	      
 //         [2]
//	      while( min <= max) {
//	         System.out.printf("%d+", min);
//	         sum += min;
//	         min++;
//	      } //   
	      
	      // [1] 
	      while (i<= max) {
	    	  System.out.printf("%d+", i);
	    	  sum += i;
	    	  i++;
		} //  while
	      
	      System.out.printf("\b=%d", sum);
//	      for (int i = min; i <= max ; i++) {
//	         System.out.printf("%d+", i);
//	         sum += i;
	      } // for i


	}


