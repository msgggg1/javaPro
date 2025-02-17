package days08;

public class Ex11_02 {

	public static void main(String[] args) {
		// 재귀함수 : 성능안좋아짐, 트리구조(파일속파일 삭제할때)에만 사용
        // 1~10=55
		// int result = sum(10);
		
		// 1~10 재귀함수
		int result = recursiveSum(10);
		System.out.println( result );

	} // main

	private static int recursiveSum(int n) {
		if( n == 1) return 1;
		else        return n + recursiveSum(n-1);
	}

	private static int sum(int n) {
		int result = 0 ;
		for (int i = 1; i <= n; i++) {
			result += i;
		} // for i
		return result;
	}



}// class
