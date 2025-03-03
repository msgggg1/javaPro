package days20;

import java.text.ChoiceFormat;
import java.text.DecimalFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author kenik
 * @date 2025. 2. 28. - 오후 5:19:37
 * @subject  3. ChoiceFormat 클래스
 * @content        ㄴ 특정 범위에 속하는 값을 문자열로 반환해 주는 클래스
 *            예) 국어점수 -> 수/우/미/양/가 출력.
 *                          90~100        0~59
 *            
 */
public class Ex12 {

	public static void main(String[] args) {

		
		String source = "Java is fun and Java is powerful!";
		String pattern = "Java";

		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(source);
		StringBuffer sb = new StringBuffer();

		while (m.find()) {
		    m.appendReplacement(sb, "Python");
		    m.appendTail(sb); 
		}

		System.out.println(sb.toString());

	} // main

} // class
  