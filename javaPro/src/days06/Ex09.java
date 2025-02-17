package days06;

import java.util.Scanner;

/**
 * @author msg
 * @date 2025. 2. 10. - 오후 4:36:57
 * @subject
 * @content
 */
public class Ex09 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		char one = '\u0000';
		System.out.print("> 한 문자 입력?");
		
		// scanner.nextChar 없음 -> String -> 첫번째문자 읽기
		
//		String input = scanner.next();
//		one = input.charAt(0)
		
		//"A" = 'A' + '\0'(문자열 끝을 나타내는 널 문자)
		//'A'
		
		
		one = scanner.next().charAt(0);
				
		System.out.printf("%c\n", one);

	} // main

} // class
