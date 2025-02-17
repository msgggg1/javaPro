package days10;

/**
 * @author msg
 * @date 2025. 2. 14. - 오전 10:31:56
 * @subiect
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
		int money = 125760;
		int share, rest ;
		
		int [] unit = {50000,10000,5000,1000,500,100,50, 10, 5, 1};
		String [] s_unit = { "5만원","1만원","5천원", "1천원", "5백원", "1백원","5십원","1십원","5원","1원" };
		
		for (int i = 0; i < unit.length; i++) {
			share = money / unit[i];
			System.out.printf("%s원: %d개\n", s_unit[i], share);
			rest = money % unit[i];
			money = rest;
		
		} // for i

		
		/*
		5만원 : 2 개
		1만원 : 2 개
		5천원 : 1 개
		1천원 : 0 개
		5백원 : 1 개
		1백원 : 2 개
		5십원 : 1 개
		1십원 : 1 개
		5원 : 0 개
		1원 : 0 개
		*/
		
		
		
//		int share, rest ; 
//		
//		int share5M = money /50000;
//		int rest5M = money % 50000;
//		
//		int share1M = rest5M/10000;
//		int rest1M = rest5M%10000;
//		
//		int share5C = rest1M/5000; 
//		int rest5C = rest1M%5000; 
//		
//		int share5C = rest1M/5000; 
//		int rest5C = rest1M%5000; 
//		
//		int share5C = rest1M/5000; 
//		int rest5C = rest1M%5000; 
//		
//		int share5C = rest1M/5000; 
//		int rest5C = rest1M%5000; 
		
		
//		
			
		
		
		

	} // main

} // class
