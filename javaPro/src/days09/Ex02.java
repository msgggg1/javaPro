package days09;

/**
 * @author msg
 * @date 2025. 2. 13. - 오전 10:20:07
 * @subject 재귀 함수
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
		// 팩토리얼(factorial) == 계승
		// n!
		// 0! = 1정의
		
//		int result = factorial(5);
		int result = recursiveFactorial(5);
		System.out.println(result);
		

	} 

	private static int recursiveFactorial(int i) {
		if ( i == 1 || i == 0) return 1;
		else				   return i * recursiveFactorial(i-1);
	}

	private static int factorial(int n) {
		int result = 1 ;
		for (int i = 1; i <= n; i++) {
			System.out.printf("%d*", i);
			result *= i;
		} // for 1
		return result;
	}

} // class
