package days06;

import java.util.Scanner;

/**
 * @author msg
 * @date 2025. 2. 10. - 오후 2:47:31
 * @subject
 * @content
 */
public class Ex07_02 {

	public static void main(String[] args) {
		// [문제] 한 라인에 10개의 ASCII 문자를 출력
		// 윈도우 개행 : Carriage Return(CR) + Line Feed(LF) // 커서 제일 앞으로 이동
		//                  '\r'  13             '\n' 10
		
//		int no = 0; // 0~9 : 1  10~19:2  20~29: 3
//		
//		for (int i = 0, lineNumber = 1; i < 256; i++) {
//			no = i/10 + 1 ;
//			System.out.printf(i%10 ==0 ? "%d:[%c]":"[%c]",no, (char)i);  
//			if (i%10==9) System.out.println();

		Scanner scanner = new Scanner(System.in);
		
		 for (int i = 0, lineNumber = 1; i < 256; i++) {
	         // if(i%10==0) System.out.printf("%d :", i/10+1);
	         if(i%10==0) System.out.printf("%d :", lineNumber);
	         System.out.printf("[%c]", (char)i);
	         if(i%10==9) {
	        	 System.out.println();
	        	 if(lineNumber++ % 5 == 0) {
	        		 System.out.println("\t 계속하려면 엔터");
	        		 scanner.nextLine();
	        	 }
	         }// if
//	         lineNumber++;
		} // for i
		
		 

	} // main

} //class
