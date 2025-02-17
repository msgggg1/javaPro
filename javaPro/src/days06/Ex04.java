package days06;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		//1~n 합
		/*
		int sum = 0, n;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("> 양의 정수 n 입력?");
		n= sc.nextInt();
		
		
		for (int i = 1; i <= n; i++) {
			System.out.printf("%d+", i);
			sum += i;
					
		} // for i
		System.out.printf("\b=%d\n", sum);
		*/
		
		// [while ] 1~n 합
		int sum = 0, n;
		int i = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("> 양의 정수 n 입력?");
		n= sc.nextInt();
		
		if ( n < 1) {
			System.out.println("양의 정수!");
			return;
		} // if
		
		while (i <= n) {
			System.out.printf("%d+", i);
			sum+= i;
			i++;	
		} //  while
		
		System.out.printf("\b=%d\n", sum);
	}

}
