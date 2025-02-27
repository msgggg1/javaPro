package days19;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author msg
 * @date 2025. 2. 27. - 오전 10:38:26
 * @subject
 * @content
 */
public class Ex04_02 {

	public static void main(String[] args) {
		 String s = "public static void main(String[] args) {";
		 // 1. 문자열 길이 반환하는 메서드
		 //System.out.println(s.length());
		 
		 /*
		 // 2. 문자열 속에서 특정 위치의 한 문자를 반환하는 메서드
		 //System.out.println(s.charAt(0));
		 for (int i = 0; i < s.length(); i++) {
			System.out.printf("'%c'", s.charAt(i));
		} // for i
		*/
		 
		 /*
		 // 3. 대문자변환, 소문자변환
		 System.out.println(s.toUpperCase()); 
		 System.out.println(s.toLowerCase());
		 System.out.println(s); // 새로운 문자열을 반환한거지 s 문자열이 바뀐게 아님. "s 문자열 불변"
		 */
		 
		 //4. String [] sArr = s.split(regex);
		 
		 
		 //5. String -> char [].0
//		 char [] sArr = s.toCharArray();
//		 System.out.println(Arrays.toString(sArr));
		 
		
		
		 // 6. char[] -> String
//		 String s2 = new String(sArr);
//		 System.out.println(String.valueOf(sArr));
//		 System.out.println(s2);
		 
		 
		 /*
		 //7. trim() 문자열 앞 뒤의 공백 제거해서 문자열 반환하는 메서드
		 System.out.printf("[%s]","   홍  ".trim());
		 */
		 
		 //[문제] s 문자열 속에 main 문자열 찾아서 MAIN으로 변경 코딩.
//		 String s = "public static void main(String[] args) {";
		 String searchWord = "main"; //검색어
		 
		 //[3]
//		 s.replace(searchWord, searchWord.toUpperCase());
//		 s.replaceAll(searchWord, searchWord.toUpperCase()); 	// 정규표현식
//		 s.replaceFirst(searchWord, searchWord.toUpperCase());  // 정규표현식
		 
		 /*
		 //[2]
		 String [] sArr = s.split(searchWord);
		 System.out.println(String.join(searchWord.toUpperCase(), sArr));
		 */
		 /*[1]
		 String searchWord = "main"; //검색어
		 if (s.contains(searchWord)) { // true/false
			 int index = s.indexOf(searchWord);
			 System.out.println(s.substring(0, index)
					 +searchWord.toUpperCase()
					 +s.substring(index, index+searchWord.length()));
			 
		} // if
		 */
		 
		 //indexOf()
		 //contains()
		 //substring()
		 //join()
		 //split()
		 //replace()
		 
//		 System.out.println(s.indexOf("in")); 	  // 앞에서 부터
//		 System.out.println(s.lastIndexOf("in")); // 뒤에서 부터 찾음
		 
		 /*
		 //문자열 연결
		 String s2 = "aaa"+"bbb"+"ccc"; // 문자열 연결 연산자 +
		 String s3 = "aaa".concat("bbb").concat("ccc");
		 
		 // 문자열
		 s2.equals(s3);
		 s2.equalsIgnoreCase(s3);
		 */
		 
		 // 문자열 뒤집기
		 
//		 String s2 = reverse(s);
//		 System.out.println(s2);
		 
		 /*
		 char[] str = s.toCharArray();
		 Arrays.sort(str, Collections.reverseOrder());
		 System.out.println(String.valueOf(str));
		 */
		 
		 // s 문자열 속에 한글을 제외한 모든 문자 제거
//		 String s = "public static void 메인(String[] args) {";
		 System.out.println(s.replaceAll("[a-zA-Z() {}\\[\\]]", ""));
		 // . 한글 제외 정규표현식
		 
		 // [과제] 비밀번호 정규표현식
		 // 	알파벳 대문자 1개, 소문자 1개, 숫자 1개, 특수문자 1개
		 //		문자열 길이 8~15 사이  
		 // String regex = "";
	} // main

	private static String reverse(String s) {
		//s.toCharArray()
		
		String result = "";
		for (int i = 0; i < s.length(); i++) {
			result = s.charAt(i)+result;
	
		} // for i
		return null;
	}

} // class








