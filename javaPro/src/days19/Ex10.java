package days19;

import java.io.FileReader;

/**
 * @author msg
 * @date 2025. 2. 27. - 오후 5:17:10
 * @subject
 * @content
 */
public class Ex10 {

	public static void main(String[] args) {
		
		String fileName = ".\\src\\days18\\Ex10.java";
	      // 알파벳 대소문자를 구분하지 않고 A(20), B(11)~ Z(3)
	      // 갯수를 파악해서 #으로 막대그래프를 그리기.
	      // A(20) : ####################
	      // B(11) : ###########
	      // :
	      // Z(3)  : ###
		
		char one = '\u0000';
		int code = -1;
		int [] counts = new int [28];
		// 0 -> A65, 1 -> B66, 
		
		try(FileReader reader = new FileReader(fileName);) {
			while ((reader.read()) != -1) {
				code = Character.toUpperCase(code); // 알파벳아닌문자 그냥 돌림
				if (Character.isUpperCase(code)) {
					int index = code - 'A';
					counts[index]++;
				} // if
			} //  while
			
			// 막대그래프 그리기
			for (int i = 0; i < counts.length; i++) {
				
			} // for i
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	} // main

} // class
