package days05;

/**
 * @author msg
 * @date 2025. 2. 7. - 오전 10:44:03
 * @subject
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		// [문제] 1~10 의 합 (for문) ******암기********
		
	/*	int sum = 0 ;
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			sum += i; // sum = sum+1
		
		} // for i
		
		System.out.printf("=%d", sum);
		*/
		
		int sum = 0 ;
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d+", i);
			sum += i; // sum = sum+1
			
		} // for i
		
		System.out.printf("=%d", sum);
		
		
		
		/*
		int i;
		for ( i = 1; i <= 10; i++) {
			System.out.println(i);
		} // for i
		// i cannot be resolved to a variable: i변수 인식x, 선언x or 지역안맞아서 // 여기서는 for문에서만 사용 -> 
		System.out.println(">> 빠져나올때의 i = "+ i);
		*/
		

	} // main

} // class
