package days20;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex01 {

	public static void main(String[] args) {
		// 1. days19.Ex10.java 참고 
//		 알파벳 대, 소문자, 숫자의  A(20), B(11)~ Z(3)
//		 갯수를 파악해서 #으로 막대그래프를 그리기.

		String fileName = ".\\src\\days18\\Ex10.java";
		
		int one ;
		int [] upper = new int [26];
		int [] lower = new int [26];
		int [] digit = new int [10];
		
		
		try (FileReader reader = new FileReader(fileName);){
			
			while ((one = reader.read()) != -1) {
				if (Character.isDigit(one)) digit[one-'0']++; 
				else if(Character.isUpperCase(one)) upper[one-'A']++;
				else if(Character.isLowerCase(one))	lower[one-'a']++;
			} // if
			
			for (int i = 0; i < digit.length; i++) {
				System.out.printf("%c(%d)\t: %s\n", i+'0', digit[i], "#".repeat(digit[i]));
			} //for
			for (int i = 0; i < upper.length; i++) {
				System.out.printf("%c(%d)\t: %s\n", i+'A', upper[i], "#".repeat(upper[i]));
			} //for
			for (int i = 0; i < lower.length; i++) {
				System.out.printf("%c(%d)\t: %s\n", i+'a', lower[i], "#".repeat(lower[i]));
			} //for
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		
	
		/* 내 풀이
		int one;
		int [] counts = new int[62];
		
		String fileName = ".\\src\\days18\\Ex10.java";
		
		try (FileReader reader = new FileReader(fileName);){
			
			while ((one = reader.read()) != -1) {
				if (Character.isAlphabetic(one)) {
					if (Character.isUpperCase(one)) counts[one - 'A' + 10]++; //0~9 /10~35/ 36~61
					else if(Character.isLowerCase(one)) counts[one - 'a' + 36 ]++;		// 
				} // if
	
				if (Character.isDigit(one)) {
					counts[one -'0']++;
				} // if
			} //  while
			
			for (int j = 0; j <counts.length; j++) {
				if (j<=9) {
					System.out.printf("%c(%d)\t: %s\n", (char)(j+'0'), counts[j], "#".repeat(counts[j]) );									
				} else if(j<=35){
					System.out.printf("%c(%d)\t: %s\n", (char)(j+'A' - 10), counts[j], "#".repeat(counts[j]) );
				} else {
					System.out.printf("%c(%d)\t: %s\n", (char)(j+'a'-36), counts[j], "#".repeat(counts[j]) );
				}
			} // for j
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
		
		
		

	} // main

} // class
