package days05;

import java.util.Scanner;

public class Ex07_02 {

	public static void main(String[] args) {
		
		

		System.out.println("> user 가위(1)/바위(2)/보(3) 선택?");
		Scanner scanner = new Scanner(System.in);
		
		if (!scanner.hasNextInt()) {
		    System.out.println("다시 입력하세요");
		        return ;
		      } // if
		
		int com = (int)(Math.random()*3 + 1);
		int user = scanner.nextInt();  
	
		
		if (user >= 4) {
			System.out.println("다시 입력하세요");
			return;
		}
		if (user <= 0) {
			System.out.println("다시 입력하세요");
			return;
		}
		
	    System.out.printf("> com: %d, user: %d\n", com, user);
			
			
		if (com == user) {
			System.out.println("무승부");	
		} else {
			if (com == 1) {
				System.out.println("사용자승리");
			} // if
			if (com == 2) {
				System.out.println("사용자승리");
			} // if
			if (com == 3) {
				System.out.println("사용자승리");
			} // if
	  return ;		
		}
		
		if (com == user) {
			System.out.println();	
			return;
		} else {
			if (user == 1) {
				System.out.println("컴퓨터승리");
			} // if 
			if (user == 2) {
				System.out.println("컴퓨터승리");
			} // if
			if (user == 3) {
				System.out.println("컴퓨터승리");
			} // if
		}
		
	} // main

} //class
