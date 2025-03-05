package days21;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author kenik
 * @date 2025. 3. 4. - 오전 10:35:18
 * @subject 
 * @content
 */
public class Ex02_02 {

	public static void main(String[] args) {		
		String s = "이름:홍길동, 나이:20살, 성별:여자";

		String name;
		int age;
		boolean gender;
		
		String [] sArr = s.split(",");
		System.out.println(Arrays.toString(sArr));
		for (int i = 0; i < sArr.length; i++) {
			System.out.println(sArr[i].split(":")[1]);
		} // for i
		
		
//		String regex = ",?\\s*.{2}:";
//		String [] sArr = s.split(regex);
//		System.out.println(Arrays.toString(sArr));
//		
//		name = sArr[1];
//		age = Integer.parseInt(sArr[2].replace("살", ""));
//		gender = sArr[3].equals("남자")? true : false ; 
//		
//		System.out.println(name);
//		System.out.println(age);
//		System.out.println(gender);
		
		
		


		/* [2]
		String [] sArr = s.split(", ");
		for (int i = 0; i < sArr.length; i++) {
			System.out.println( sArr[i].split(":")[1] ); 
		} // for i
		 */

		/* [1]
		name =  s.substring(3, 6);
		System.out.println( name );

		age = Integer.parseInt( s.substring(11, 13) );
		System.out.println( age  );
		 */



	} // main

} // class








