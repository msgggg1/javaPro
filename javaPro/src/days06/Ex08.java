package days06;

import java.util.Scanner;

/**
 * @author msg
 * @date 2025. 2. 10. - 오후 4:09:46
 * @subject
 * @content
 */
public class Ex08 {

	public static void main(String[] args) {
		String name = null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("> 이름을 입력하라");
		name = scanner.nextLine(); // enter치기 전까지 값 다 읽어옴/ next(); 엔터쳐도 안 읽어감.
		
		System.out.println(name);
	
		System.out.println("end");
	} // main

} // class
