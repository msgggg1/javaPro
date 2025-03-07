package days24;

import java.util.Enumeration;
import java.util.Properties;

/**
 * @author msg
 * @date 2025. 3. 7. - 오후 12:39:01
 * @subject
 * @content
 */
public class Ex06 {

	public static void main(String[] args) {
		 
		/*
		String dir = System.getProperty("user.dir");
		System.out.println(dir);
		*/
		
		Properties p = System.getProperties();
		// 모든 key -> 열거자로 반환 메서드
		Enumeration<String> en =  (Enumeration<String>) p.propertyNames();
		while (en.hasMoreElements()) {
			String key = (String) en.nextElement(); // (String) 안해도됨 d/t 제네릭
			String value = p.getProperty(key);
			System.out.printf("%s=%s\n", key, value);
		}
	} // main

} // class
