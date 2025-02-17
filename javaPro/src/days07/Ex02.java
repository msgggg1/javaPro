package days07;

import java.io.IOException;

public class Ex02 {

	public static void main(String[] args) throws IOException {
		// 디버깅해야하는 이유
		char one;      
		System.out.print("> 한 문자 입력 ? ");
		one = (char) System.in.read();
		System.out.printf("%c\n", one); // a 엔터('\r')
		// 엔터 = CR '\r' + LF '\n'
		
//		System.in.read(); // '\r' 읽어서 버림
//		System.in.read(); // '\n' 읽어서 버림
		System.in.skip(2); // 2바이트 버리겠다.
		
//		System.in.skip(System.in.available());
		
		System.out.print("> 한 문자 입력 ? ");
		one = (char) System.in.read();
		System.out.printf("%c\n", one);
		
		System.out.println("end");

	} // main

} // class
