package days08;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// 오버로딩(==중복함수)
		
		int x, y, result;
		Scanner sc = new Scanner(System.in);
		System.out.print("> x, y input?");
		x= sc.nextInt();
		y= sc.nextInt();
		
		
//		result = x + y;
		// 두 정수의 합을 반환하는 sum() 메서드 선언 -> 호출
		result = sum(x, y); // 메소드 호출부 / 리턴값이 sum() 위치에 옴.
		
		System.out.printf("%d+%d=%d\n", x, y, result);

	} // main

	// 메소드 선언부
	private static int sum(int x, int y) {
//		int result = x+y
//		return result; // return 수식 가능
		return x + y;
	}

} // class
