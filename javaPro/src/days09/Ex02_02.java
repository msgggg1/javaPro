package days09;

public class Ex02_02 {

	public static void main(String[] args) {
		// 거듭제곱 == 멱
		// 2^3 : 2 밑수(base), 3 지수 (exponent, power)
		
//		double result = power(2,- 3);
//		Math.pow(2, 3)

		double result = recursivePower(2, 3);
//		double result = recursivePower(2,- 3);
		System.out.println(result);

	} // main

	private static double recursivePower(int b, int e) {
		if (e < 0)   return 1/recursivePower(b, -e);
		if ( e == 1) return b;
		else         return b * recursivePower(b, e-1);
			
//	private static double recursivePower(int b, int e) {
//		double result = 1;
//		result *= b;
//		if (i<= e) return recursivePower(b, e-1);
//		else return result;				
	}
	

	private static double power(int b, int e) {
		int result = 1;
		int e2 = Math.abs(e);
		for (int i = 1; i <= e2; i++) {
			result *= b ; 
		    } // for i
		return e<0 ? (double)1/result : result;
	}

} // class
