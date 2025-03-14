package days29;

import java.util.Scanner;

public class Test01 {

	enum Direction {  EAST , SOUTH , WEST , NORTH  }
	
	public static void main(String[] args) {
		
		// 현대카드
		// chanik2
		// 
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 방향 입력 ? ");
		String input = scanner.nextLine().toUpperCase(); // 
		
		Direction direction = Direction.valueOf(input); // "EAST"
		
		switch (direction) {
		case EAST:
			System.out.println("방향 따라 처리 코딩.");
			break;
		case SOUTH:
			System.out.println("방향 따라 처리 코딩.");
			break;
		case WEST:
			System.out.println("방향 따라 처리 코딩.");
			break;
		case NORTH:
			System.out.println("방향 따라 처리 코딩.");
			break; 
		} // switch
		
 
		
		 
		
		

	} // main

}
  