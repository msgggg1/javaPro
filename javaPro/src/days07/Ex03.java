package days07;

import java.util.Arrays;

/**
 * @author msg
 * @date 2025. 2. 11. - 오전 11:12:01
 * @subject
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {

		String data = "홍길동, 이창익, 서영학, 정창기"; //
		String regex = ",";
		String [] names = data.split(regex);
		
//		System.out.println(Arrays.toString(null));
		
//		int size = names.length;
//		for (int i = 0; i < size; i++) {
//			System.out.printf("names[%d]=\"%s\"\n", i , name[i]);
//		
//		} // for i
		
		//[for each 문] == 확장 for 문
		// for (        :  배열 또는 컬렉션 클래스)  // index로 접근x
		for (String name : names) {
			System.out.println(name);
		} // for
		
		// 문자열 (String) 메서드 [시험] 기능/설명
		// 1.charAt()
		// 2. equals() / equalsignore
		// 3. length
		// 4. valueOf()
		// 5. toUpper/LowerCase
		// 6. format()
		// 7. toCharArray()
		// 8. "-".repeat(50)
		// 9. split
		// 10. trim
		
		

	} // main

} // class
