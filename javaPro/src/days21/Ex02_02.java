package days21;

import java.util.Arrays;

/**
 * @author msg
 * @date 2025. 3. 4. - 오전 10:35:15
 * @subject
 * @content
 */
public class Ex02_02 {

	public static void main(String[] args) {
		String s = "이름:홍길동, 나이:20살, 성별:여자";
		String pattern = "이름:{0}, 나이:{1}살, 성별:{2}";

		String name;
		int age;
		boolean gender;

		//[3]
//		String regex = ",?\\s*[ㄱ-힣]*:";
//
//		String[] info = s.split(regex);
//
//		name = info[1];
//		age = Integer.parseInt(info[2].replace("살",""));
//		gender = info[3].equals("남자")?true:false;
//
//		System.out.println(name);
//		System.out.println(age);
//		System.out.println(gender);


		//[2]
		//		String [] sArr = s.split(",");
		//		System.out.println(Arrays.toString(sArr));
		//		for (int i = 0; i < sArr.length; i++) {
		//			System.out.println(sArr[i].split(":")[1]);
		//		} // for i
		
		//[1]
//		name = s.substring(3,6)
//		System.out.println( name );
//
//		age = Integer.parseInt( s.substring(11, 13) );
//		System.out.println( age  );


		//[나]
//		name = s.substring(s.indexOf("이름:")+3, s.indexOf("이름:")+6);
//		System.out.println(name);
//		age = Integer.parseInt(s.substring(s.indexOf("나이:")+3, s.indexOf("나이:")+5));
//		System.out.println(age);
//		gender = s.substring(s.indexOf("성별:")+3, s.indexOf("성별:")+5).equals("남자")? true:false;
//		System.out.println(gender);
		

	} // main

} // class
