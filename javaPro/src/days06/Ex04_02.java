package days06;

import java.util.Scanner;

public class Ex04_02 {

	public static void main(String[] args) {
		// 두 정수 (n, m)을 입력받아서 두 정수 사이의 합을 출력.
		// 1) for
		// 2) while

//		[1]
		int n, m;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 n,m을 입력하세요");
		
		int sum = 0;
		n = sc.nextInt();
		m = sc.nextInt();
		
		if (n > m) {
			for (int i = m;  i <= n; i++) {
				System.out.printf("%d+", i);
				sum += i;
			}
		} else {
			for (int i = n;  i <= m; i++) {
				System.out.printf("%d+", i);
				sum += i;
		} 
		}//else
		
		System.out.printf("\b=%d\n", sum);
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수 n,m을 입력하세요");
//		
//		int n, m;
//		int sum = 0;
//		
//		n = sc.nextInt();
//		m = sc.nextInt();
//		
//		for (int i = n;  i <= m; i++) {
//				System.out.printf("%d+", i);
//				sum += i;
//						
//		} // for i
//		System.out.printf("\b=%d\n", sum);
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수 n,m을 입력하세요");
//		
//		int n, m;
//		int sum = 0;
//		
//		n = sc.nextInt();
//		m = sc.nextInt();
//		
//		int i = n;
//		
//		while (n <= i && i <= m) {
//			System.out.printf("%d+", i);
//			sum += i;
//			i++ ;
//		} //  while
//		System.out.printf("\b=%d\n", sum);
		
		

		}
		
} // class
