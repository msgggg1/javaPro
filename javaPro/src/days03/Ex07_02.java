package days03;

/**
 * @author msg
 * @date 2025. 2. 5. - 오후 3:34:23
 * @subject	  산술연산자	+  -  *  /  %
 * @content
 */
public class Ex07_02 {

	public static void main(String[] args) {
		int i =10, j=3;
		System.out.println(i+j);
		System.out.println(i-j);
		System.out.println(i*j);
		System.out.println(i/j); // 3   몫연산자
	//	System.out.println((double)i/j); // 3.3333  
		
		System.out.println(i%j); // 1 나머지 연산자  
		
		// [주의할 점] /  %  0으로 할 때 
	//	System.out.println( 10/0 ); // by zero ArithmeticException (산줄적 오류)
	//	System.out.println( 10%0 ); // ArithmeticException: / by zero
		
		System.out.println( 10.0%0 ); // NaN     Not a number : 리터럴값
		System.out.println( 10.0/0 ); // Infinity        무한대 : 리터럴값( like true/false)
		
	} //main

}// class
