package days21;

import java.text.MessageFormat;
import java.text.ParseException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author msg
 * @date 2025. 3. 4. - 오전 10:35:15
 * @subject
 * @content days20.Ex05_02 messageFormat
 */
public class Ex02_04 {

	public static void main(String[] args) {
		String s = "이름:홍길동, 나이:20살, 성별:여자";

		String name = null;
		int age = 0;
		boolean gender = false;
		
		String pattern = "이름:{0}, 나이:{1}살, 성별:{2}";
		MessageFormat mf = new MessageFormat(pattern);
		
		try {
			Object [] objArr = mf.parse(s); // object 배열로 넘겨줌
//			for (Object obj : objArr) {
//				System.out.println(obj);
//			}
			name = (String) objArr[0];
			age = Integer.parseInt((String)objArr[1]);
			gender =( (String)objArr[2]).equals("남자")?true:false;
			
			System.out.println(name);
			System.out.println(age);
			System.out.println(gender);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		

	} // main

} // class
