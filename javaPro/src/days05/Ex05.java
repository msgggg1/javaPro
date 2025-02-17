package days05;

public class Ex05 {

	public static void main(String[] args) {
		
		// [for] 1~10 = 55
		
//		int sum = 0;
//		
//		for (int i = 1; i <= 10; i++) {
			
			/*
			if (i != 10) {
				System.out.printf("%d+", i);
				sum += i;
			} else {
				System.out.printf("%d", i);
			}*/
			
	/*		System.out.printf(i==10?"%d":"+%d", i);
			
			sum += i;  */
			
			// for (초기식 ; 조건식 ; 증감식) 
			int sum = 0;
			/*
			for (int i = 1, j = 0; i <= 10; i++) { // for 문안에서 사용할 변수 선언 초기식에서 가능
				System.out.printf("%d+", i);
				sum += i;
			*/	
			int i = 10;
			for (      ;     ;     ) { // for 문안에서 사용할 변수 선언 초기식에서 가능 / 조건식 비우면 무한루프
				if( i==0 ) break;
				System.out.printf("%d+", i);
				sum += i;
				//if(i==1) break;
				i--;
			}
//		} // for i
				
		System.out.printf("=%d\n", sum); // \b=%d\n // Unreachable code
		
		

	} // main

} // class
