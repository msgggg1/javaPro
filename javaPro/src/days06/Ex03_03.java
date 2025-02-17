package days06;

/**
 * @author msg
 * @date 2025. 2. 10. - 오전 11:37:19
 * @subject
 * @content
 */
public class Ex03_03 {

	public static void main(String[] args) {
		
//		int sum = 0;
//		
//		for (int i = 1; i <= 10; i+=2) {
//			// if (i%2 == 0) continue; 
//		
//			System.out.printf("%d+",i);
//			sum += i;
//			
//		} // for i
//		
//		System.out.printf("\b=%d\n",sum);
		
		int sum = 0;
		int i = 1;
		
		while (i <= 10) {
			
			System.out.printf("%d+", i);
			sum += i;
			i+= 2;			
		} //  while
		
		System.out.printf("\b=%d\n",sum);

	} //main

}//class
