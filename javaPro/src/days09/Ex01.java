package days09;

/**
 * @author msg
 * @date 2025. 2. 13. - 오전 9:47:30
 * @subject
 * @content
 */
public class Ex01 {

	public static void main(String[] args) {
		// 소수(prime number)
		int sum = 0;
		
		for (int i = 1; i <= 100; i++) {
			if (isPrimeNumber(i)) {
				System.out.printf("%d+", i);
				sum += i;
			} // if
		} // for i
		System.out.printf("=%d",sum);
	}

	private static boolean isPrimeNumber(int n) {
		
		if (n==1) return false;
		else if (n==2) return true;
		else {
		for (int i = 2; i < Math.sqrt(n) ; i++) {
			if (n%i == 0) return false;
		} // for i
		}
		return true;

	} 
//	private static boolean isPrimeNumber(int n) {
//		
//		if (n==1) {
//			return false;
//		} // if
//		for (int i = 2; i < n ; i++) {
//			if (n%i == 0) return false;
//		} // for i
//		return true;
//		
//	} 

} //class
