package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author msg
 * @date 2025. 2. 5. - 오후 12:20:25
 * @subject
 * @content
 */
public class Ex05_02 {

	public static void main(String[] args) throws IOException {
		// [문제]
		// 국어점수를 키보드로 부터 입력받아서 
		// 변수에 저장하고
		// "국어=90" 이라고 출력하는 코딩을 하자.
		
		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.print("> 국어 입력?");
		String kor = br.readLine();	
		//Type mismatch: cannot convert from String to byte
		System.out.printf("국어=%s\n", kor);*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		// string -> byte 타입(자료형, 형) 변환
		byte kor;	
		System.out.print("> 국어 입력? ");
		//kor = Byte.parseByte(String)
		//Type mismatch: cannot convert from String to byte
		/*
		 * String strKor = br.readLine();  -->90
		 * kor = Byte.parseByte(strKor)
		 * */
		//System.out.printf("국어=%s\n", kor);
		
		
		//String "90" -> byte 90변환하는 코딩.
		kor = Byte.parseByte(br.readLine());
		
		System.out.printf("국어=%d\n", kor);
		


	} // main

} //class
