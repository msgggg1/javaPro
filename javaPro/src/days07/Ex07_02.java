package days07;

import java.util.Scanner;

public class Ex07_02 {

	public static void main(String[] args) {
		// 가위바위보 입력값에 대한 유효성 검사// 3회 입력 잘못하면 잠김
		//  1~3      1) 알림코딩 추가  2) 3번 입력 잘못하면 프로그램 종료!
		
		  int user ;
	      Scanner scanner = new Scanner(System.in);
	      boolean isFirst = false;
	      int count = 0;
	      
	      
	      do {
	    		  if (count==3) {
	    			  System.out.printf ("[알림] 누적 3회 프로그램 종료");
	    			 return ;
	    	  }// if
	    	  if (isFirst) {
				System.out.printf ("[알림] 1~3 정수를 다시 입력(실패횟수:%d)!!!\n",count);
			} // if
	    	  
	    			  
	    	  isFirst = true;
	    	  
	    	  System.out.print("> user 가위(1)/바위(2)/보(3) 선택 ? ");
		      user= scanner.nextInt();
		      
		      count++;
		      
//		} while (user != 1 && user!= 2 &&user != 3);
		} while (!(user == 1 || user== 2 || user == 3));
	     
			 
		  System.out.printf("> user=%s\n", user); 
			 
			 

	} // main

} // class
