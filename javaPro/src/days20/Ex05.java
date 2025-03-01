package days20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author msg
 * @date 2025. 2. 28. - 오전 11:26:57
 * @subject
 * @content
 */
public class Ex05 {

	public static void main(String[] args) {
		/*
		 * [정규(표현)식(Regular Expression)] regex(p)
		 *  ㄴ 문자열 속에 원하는 패턴(pattern)과 일치하는 문자열을 찾기 위해서 사용하는 식
		 *  ㄴ 미리 정의된 기호와 문자로 정규표현식 사용
		 *  ㄴ java.util.regex 패키지 안에 관련 클래스
		 *  	ㄴ pattern 클래스 - 정규식을 정의
		 *  	ㄴ Matcher 클래스 - 데이터와 정규식(pattern객체)을 비교
		 *  
		 *  // 여태까지는 string 클래스 내 함수 사용	String.matches(String regex)
		 * */

		String[] data = { "bat", "baby", "bonus", "cA", "ca", "co", "c.", "c0"
				, "car", "combat", "count", "date",
				"disc", "fx" };
		String regex = "c[a-z]*"; // c문자 시작해서 소문자 0~여러개 패턴
		// String regex = "c[a-z]";  // c문자 + 소문자 1개
		// String regex = "c[a-zA-Z]"; // c문자 + 알파벳 1개

		// String regex = "c[a-zA-Z0-9]";
		// String regex = "c\\w"; //w => a-zA-Z_0-9
		// String regex = ".*"; // 진짜. ->\.
		// String regex = "c.";
		// String regex = "c\\."; c.
		// String regex = "c[0-9]";
		// String regex = "c.*t";
		// String regex = "[b|c]"; b or \ or c
		// String regex = "[bc]";
		// String regex = "[b-c].*";
		// String regex = "[^bc].*";

		// String regex = ".*a.*";

		// String regex = "[^bcd].*";

		// String regex = "[a-zA-Z].*";
		// String regex = "[ae-zA-Z].*";

		// String regex = "[a-zA-Z&&[^b-d]].*";

		//String regex = "(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[!@#$%^&*_])[A-Za-z\\d!@#$%^&*_]{8,15}"; //?= => 하나는 있어야된다.

		//[2]
		Pattern pattern = Pattern.compile(regex);
		for (int j = 0; j < data.length; j++) {
			Matcher matcher = pattern.matcher(data[j]);
			if (matcher.matches()) {
				System.out.println(data[j]);
			} // if
			
		} //for
		

		//[1]
//		Pattern pattern = Pattern.compile(regex);
//		for (int i = 0; i < data.length; i++) {
//			Matcher matcher = pattern.matcher(data[i]);
//			System.out.printf("%s = %s패턴 : %b\n", data[i], regex, pattern.matcher(data[i]));
//		} //for
		
	} // main

} // class
