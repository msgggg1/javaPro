package days04;

import java.util.Scanner;

public class Ex07_02 {

	public static void main(String[] args) {
		 int kor = -1 ;       
	      Scanner scanner = new Scanner(System.in);
	      System.out.print("> 국어 점수 입력 ? ");  
	       
	      if (!scanner.hasNextInt()) {
	         System.out.println("[알림] 국어 점수 0~100 !!!");
	         return ;
	      } // if
	    
	      kor = scanner.nextInt();   
	      
	      ///////int 정수 입력받음, 0~100 체크x
	      
	      char grade = '수'; 
	      
	      // 수/우/미/양/가 출력        switch문 사용
	      int key = 0 <= kor&& kor <= 100 ? 1 :0;
	      //string key = 0 <= kor&& kor <= 100 ? "o" :"x";
	      switch (key) { //boolean형 value값 사용 못함.
		case 1:     // 
	      switch (kor/10) {
		case 10:   // case 10: case 9 // jdk17부터 case 10, 9
			//grade = '수';
			//break; // 없으면 다음 케이스로 넘어감 // 제어문을 빠져나갈대 쓰는 문장 // 메서드 빠져나갈때 리턴문
 		case 9:
			grade = '수';
			break;
		case 8:
			grade = '우';
			break;
		case 7:
			grade = '미';
			break;
		case 6:
			grade = '양';
			break;

		default: //0~5
			grade = '가';
			//break;
		
			break;
	      }
			
	      System.out.printf("%d => %c\n", kor, grade);
	      
		default: //false   
			System.out.println("다시");
			break;
		} // switch
	      
	      
	      
	      
	      
	      
	 
	   
	} // main

} //class
