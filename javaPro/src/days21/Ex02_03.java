package days21;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author msg
 * @date 2025. 3. 4. - 오전 10:35:15
 * @subject
 * @content days20.Ex05_02
 */
public class Ex02_03 {

	public static void main(String[] args) {
		String s = "이름:홍길동, 나이:20살, 성별:여자";

		String name = null;
		int age = 0;
		boolean gender = false;

		String pattern = "이름:([가-힣]{2,}), 나이:(\\d+)살, 성별:([가-힣]{2})"; // grouping


		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(s);

		//m.matches() -> t/f
		// m.find() -> t/f
		if ( m.find() ) {
			name =  m.group(1);
			age = Integer.parseInt(m.group(2)); 
			gender = m.group(3).equals("남자")?true:false;
		} // while
		System.out.println(name);
		System.out.println(age);
		System.out.println(gender);



	} // main

} // class
