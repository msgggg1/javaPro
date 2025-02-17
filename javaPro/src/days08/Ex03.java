package days08;

import java.util.Scanner;

/**
 * @author msg
 * @date 2025. 2. 12. - 오전 11:32:03
 * @subject
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		// [정처기 실기]
		// 어떤 정수를 입력받아서 양의 약수를 구해서 출력
		// 예) 8의 약수 - 1 2 4 8 

		//		Scanner sc = new Scanner(System.in);
		//		int input = sc.nextInt();
		//		int division = 1;
		//		int d1, d2;
		//		
		//		for (int i = 1; i <= input ; i++) {
		//			input = d1*d2;
		//			d1 =
		//			System.out.printf("%d의 약수 - %d %d %d %d",input,);
		//		} // for i

		Scanner scanner = new Scanner(System.in);
		System.out.print("> 정수(n) 입력 ? ");
		int n = scanner.nextInt();
		System.out.printf("%d의 약수 - 1",n);

		for (int i = 2; i <= n/2; i++) {
			if (n%i==0) {
				System.out.printf(" %d ", i);
			} // if
		} // for i

		System.out.printf(" %d",n);


//				Scanner scanner = new Scanner(System.in);
//			      System.out.print("> 정수(n) 입력 ? ");
//			      int n = scanner.nextInt();  // 8
//			      System.out.printf("%d 의 약수 - 1 ", n);
//			      
//			      for (int i = 2; i <= n/2; i++) {
//			         if ( n % i == 0 ) {
//			            System.out.printf( "%d ", i );
//			         } // if
//			      } // for i
//			      
//			      System.out.printf( "%d ", n );


		//[정처기] 최대공약수, 최소공배수
		//       소수




	} // main

} // class
