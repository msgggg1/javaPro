package days25;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author msg
 * @date 2025. 3. 10. - 오후 5:04:20
 * @subject
 * @content // 재귀함수 추가
 */
public class Ex10_04 {

	public static void main(String[] args) {
		// days24 폴더 안의 모든 파일을 검색해서 HashMap
		// 이라는 문자열을 갖고 있는
		// 파일명과 라인번호를 출력.
		String pathname = ".\\src\\days24";
		File parent = new File(pathname);
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
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		} // for i

	} // main

} // class
