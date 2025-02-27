package days19;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex10_review {

	public static void main(String[] args) {
		String fileName = "C:\\Class\\GitTest\\Home-JavaClass\\javaPro\\src\\days18\\Ex10.java";
	      // 알파벳 대소문자를 구분하지 않고 A(20), B(11)~ Z(3)
	      // 갯수를 파악해서 #으로 막대그래프를 그리기.
	      // A(20) : ####################
	      // B(11) : ###########
	      // :
	      // Z(3)  : ###

		int one;
		int [] counts = new int [26];
		
		try(FileReader reader = new FileReader(fileName);) {
			while ((one =reader.read())  != -1) {
				one = Character.toUpperCase(one);
				
				if (Character.isUpperCase(one)) {
					counts[one-'A']++;
				} // if
			} //while
		} catch (IOException e) {
			e.printStackTrace();
		}
		 //for
	
		for (int i = 0; i < counts.length; i++) {
			System.out.printf("%c(%d): %s\n" ,i+'A', counts[i],"#".repeat(counts[i]));
		}
		
		
	} // main

} // class