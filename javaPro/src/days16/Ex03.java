package days16;

/**
 * @author msg
 * @date 2025. 2. 24. - 오전 10:21:18
 * @subject [가변인자]
 * @content  JDK 1.5 메서드의 매개변수의 갯수가 고정 -> 동적 지정할 수 있다. 
 */

public class Ex03 {

	public static void main(String[] args) {
			
		System.out.println(sum(1,2));
		System.out.println(sum(1,2,3));

	} // main

	// [오버로딩]
	// 두 정수의 합을 구해서 반환하는 메서드
	public static int sum(int a, int b) {
		return a+b;
	}
	// 세 정수의 합을 구해서 반환하는 메서드
	public static int sum(int a, int b, int c) {
		return a + b + c ;
	}

	public static int sum(int [] args) {
		int result = 0;
		for (int i : args) {
			result += i;
		}
		return result ;
	}
	
} // class
