package days24;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {
//		2. days18\\Ex10.java 파일을 읽어서
//		   알파벳 대소문자 단어(word)를 가져와서
//		   아래와 같이 각  알파벳의 갯수를 출력하는 코딩을 하세요. 
//		   
//		 실행결과) 
//		[A로 시작하는 단어 -1개]
//			1. Arrays
//		============================================================
//		[B로 시작하는 단어 -0개]
//		============================================================
//		[C로 시작하는 단어 -3개]
//			1. C
//			2. Chapter
//			3. Class
//		============================================================
//		[D로 시작하는 단어 -0개]
//		============================================================

		String fileName = ".\\src\\days18\\Ex10.java";
		String word = null;
		Map<Character, Integer> hm = new HashMap<Character, Integer>();
		
		try (Scanner scanner = new Scanner(new File(fileName));){
			
			while (scanner.hasNext()) {
				word = scanner.next();
				//채우기
				for (int i = 0; i <'z'; i++) {
					if (Character.isUpperCase((char) i)||Character.isLowerCase((char)i)) {
						hm.put((char) i, 0);
					} // if
				} // for i
				
				for (int i = 0; i < 'z'-'A'; i++) {
					if (i+'A' == word.charAt(0) && hm.containsKey((char)(i+'A'))) {
						int oldValue = hm.get((char)(i+'A'));
						hm.put((char)(i+'A'), oldValue+1);		
					} // if
				} // for i
			} //  while
			
			Set<Entry<Character, Integer>> es = hm.entrySet();
			Iterator<Entry<Character, Integer>> ir = es.iterator();
			while (ir.hasNext()) {
				Entry<Character, Integer> entry = ir.next();
				char key = entry.getKey();
				int value = entry.getValue();
				System.out.printf("[%c로 시작하는 단어 -%d개]\n", key, value);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}


	} // main

} // class
