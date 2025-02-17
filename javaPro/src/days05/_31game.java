package days05;

import java.util.Scanner;

public class _31game {

	public static void main(String[] args) {
		
		// 선플레이어 1 =컴, 0 = user
		int starter = (int)(Math.random());
		int i = 0;

		int a = 1;
		int b = a ++;
		int c = b ++; 
		
		System.out.println("게임 시작");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println(()(Math.random()));
		
		if (starter == 0) {
				System.out.println("사용자부터 숫자를 입력하세요");
				a = scanner.nextInt();
					
		while (i == 31) {		
			if ((int)(a) == 1) {
				for (int j = (int)(Math.random()*3 + 1); j <= (int)(Math.random()*3 + 1); j++) {
					System.out.printf("[%d]",j);
				} // for j
				int com = a + (int)(Math.random()*3 + 1);
				System.out.printf("컴퓨터:%d", com);
			} // if
			
			
			
						
				
				
			
			
					 
						
					} // while
					
					
					
				} // if
//		return;
//				if (starter = 1) {
					
					
					
//				} // if
		
		
	} // main

} // class
