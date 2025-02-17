package days04;

import java.util.Scanner;

/**
 * @author msg
 * @date 2025. 2. 6. - 오후 12:33:27
 * @subject
 * @content
 */
public class Ex04_02 {

	public static void main(String[] args) {
		
		String input = "1 fish 2 fish red fish blue fish";
	    //Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
		Scanner s = new Scanner(input);
		s.useDelimiter("\\s*fish\\s*"); // string. 정규표현식(regular expression) -> (rehex(p)) : 토큰 구분하는 구분자로 쓰겠다.
		//              \s  : 공백  -> (\\ -> \ 출력)
		//              *   : 반복횟수 0~여러번
	     System.out.println(s.nextInt());
	     System.out.println(s.nextInt());
	     System.out.println(s.next());
	     System.out.println(s.next());
	     s.close();

	} // main

} // class
