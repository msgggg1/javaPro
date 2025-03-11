package days26;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author msg
 * @date 2025. 3. 11. - 오전 10:03:38
 * @subject days25 Ex10_04
 * @content 재귀 함수를 사용하는 예제
 * 			검색 재귀 함수 선언
 */
public class Ex02 {

	public static void main(String[] args) {
		//		String pathname = "."; // javaPro 폴더
		String pathname = System.getProperty("user.dir"); // javaPro 폴더

		File parent = new File(pathname);
		String word = "로또";

		quickSearch(parent, word);

		System.out.println("end");

		/*
		File [] list = parent.listFiles();
		File f = null;
		String line = null;
		int lineNumber = 1;
		String word = "HashMap";

		for (int i = 0; i < list.length; i++) {

				f= list[i];
				lineNumber = 1;
				String fileName = f.getName();
			try (FileReader reader = new FileReader(f);
					BufferedReader br = new BufferedReader(reader);
					){	

				while ((line = br.readLine()) != null) {
					if (line.contains(word)) {
						System.out.printf("%s ", fileName);
						line = line.replaceAll(word, "["+word+"]");
						System.out.printf("[ %d ] : %s\n", lineNumber, line);
					} // if
				} //  while
				recursiveSearch(f);

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}



		} // for i
		 */
	} // main

	private static void quickSearch(File parent, String word) {
		File [] list = parent.listFiles();
		File f = null;
		String line = null;
		int lineNumber = 1;
		for (int i = 0; i < list.length; i++) {

			f= list[i];
			
			if (f.isDirectory()) { // 하위폴더
				quickSearch(f, word);
			} else { // 파일
				lineNumber = 1;
				String fileName = f.getName();
				try (FileReader reader = new FileReader(f);
					BufferedReader br = new BufferedReader(reader);
						){	

					while ((line = br.readLine()) != null) {
						if (line.contains(word)) {
							System.out.printf("%s ", f);
							line = line.replaceAll(word, "["+word+"]");
							System.out.printf("[ %d ] : %s\n", lineNumber, line);
						} // if
					} //  while
				}//try
				} // else
			} // for
		
			
		
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

	}// quickSearch

	/*
	private static void recursiveSearch(File f) {
		if (f.isFile()) {
			f= list[i];
			lineNumber = 1;
			String fileName = f.getName();
		try (FileReader reader = new FileReader(f);
				BufferedReader br = new BufferedReader(reader);
				){	

			while ((line = br.readLine()) != null) {
				if (line.contains(word)) {
					System.out.printf("%s ", fileName);
					line = line.replaceAll(word, "["+word+"]");
					System.out.printf("[ %d ] : %s\n", lineNumber, line);
				} // if
			} //  while
		} // if

	}
	 */




} // class
