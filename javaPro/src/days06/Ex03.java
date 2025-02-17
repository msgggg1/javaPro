package days06;

/**
 * @author msg
 * @date 2025. 2. 10. - 오전 11:10:30
 * @subject
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		// [for] 1~10=55 // 홀수의 합
		/*
		int sum = 0;
		
		for (int i = 1; i <= 10; i++) {
			if (i%2 == 1) {
				
			System.out.printf("%d+",i);
			sum += i;
			
				} // if
		} // for i
		
		System.out.printf("\b=%d\n",sum);
		*/
		
		// [continue 문]
		
		/*int sum = 0;
		
		for (int i = 1; i <= 10; i++) {
			if (i%2 == 0) continue; // for문 증감식으로 돌아감
			
				 // if
			
			System.out.printf("%d+",i);
			sum += i;
			
		} // for i
		
		System.out.printf("\b=%d\n",sum);
		*/
		
		//[while] 1~10 -> 홀수의 합 (while 문 continue -> 조건식)
		
		int sum = 0;
		int i = 1;
		
		while (i <= 10) {
			if (i%2 == 0) {
				i++;
				continue;
				}//if
			System.out.printf("%d+", i);
			sum += i;
			i ++;			
		} //  while
		
		System.out.printf("\b=%d\n",sum);
		
	}// main

} //class
