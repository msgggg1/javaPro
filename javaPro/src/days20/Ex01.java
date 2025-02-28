package days20;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex01 {

	public static void main(String[] args) {
		// 1. days19.Ex10.java 참고 
//		 알파벳 대, 소문자, 숫자의  A(20), B(11)~ Z(3)
//		 갯수를 파악해서 #으로 막대그래프를 그리기.
//		  실행결과)
//			 A(20) : ####################
//			 B(11) : ###########
//			 :
//			 Z(3)  : ###	  
//			 a(20) : ####################
//			 b(11) : ###########
//			 :
//			 z(3)  : ###
//			 0(20) : ####################
//			 1(11) : ###########
//			 :
//			 9(3)  : ### 	
		
		//// 0 9  A 	Z(90)  a(97)
		//// 0 9 10		35     36
		
		String fileName = ".\\src\\days18\\Ex10.java";
			
		char one = '\u0000';
		int code = -1;
		int [] countsUpper = new int[26];
		int [] countsLower = new int[26]; //소문자
		int [] countsDigit = new int[10]; // 숫자
		
		try (FileReader reader = new FileReader(fileName);){
			
			while ( (code = reader.read()) != -1 ) {
				
				if ( Character.isUpperCase(code) ) {
					int index = code -'A';
					countsUpper[index]++;
				} else if (Character.isLowerCase(code)) {
					int index = code -'a';
				} else if (Character.isDigit(code)) {
					int index = code -'0';
				} // if
			} // while
			
			// 막대그래프 그리기
			for (int i = 0, count; i < counts.length; i++) {
				count  = counts[i];
				System.out.printf("%c(%d) %s\n", 
						i+'A', count, "#".repeat(count));
			} // for i
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		
		/*
		int one;
		int [] counts = new int[63];
		
		String fileName = ".\\src\\days18\\Ex10.java";
		
		try (FileReader reader = new FileReader(fileName);){
			
			while ((one = reader.read()) != -1) {
				if (Character.isAlphabetic(one)) {
					if (Character.isUpperCase(one)) counts[one - 55]++;
					else counts[one - 61]++;		
				} // if
	
				if (Character.isDigit(one)) {
					counts[one]++;
				} // if
			} //  while
			
			for (int j = 0; j <counts.length; j++) {
				if (j<=9) {
					System.out.printf("%c(%d)\t: %s", (char)j, counts[j], "#".repeat(counts[j]) );									
				} else if(j<=35){
					System.out.printf("%c(%d)\t: %s", (char)(j+55), counts[j], "#".repeat(counts[j]) );
				} else {
					System.out.printf("%c(%d)\t: %s", (char)(j+61), counts[j], "#".repeat(counts[j]) );
				}
			} // for j
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
		
		

	} // main

} // class
