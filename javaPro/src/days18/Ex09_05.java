package days18;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * @author msg
 * @date 2025. 2. 26. - 오후 4:24:25
 * @subject
 * @content
 */
public class Ex09_05 {

	public static void main(String[] args) {
		/*
		// C:\Class\JavaClass\javaPro
		String dir = System.getProperty("user.dir");
		System.out.println(dir);
		*/
		
		//	. 	상대경로 - 현재 디렉토리 (C:\Class\JavaClass\javaPro)
		//	.. 	상대경로 - 상위 디렉토리
		// 하위로 내려올땐 \\
		//String fileName = ".\\.classpath";
//		String fileName = dir + "\\.classpath";
//		String fileName = ".\\src\\days01\\Ex01";
//		String fileName = dir + "\\.classpath";
//		String fileName = dir + "\\.classpath";
//		String fileName = dir + "\\.classpath";
		
		
		String fileName = ".\\src\\days17\\16일차복습_홍길동.txt";
		String line = null;
		int lineNumber = 1;
		
		try ( FileReader reader = new FileReader(fileName);
			  BufferedReader br = new BufferedReader(reader); ) {

			while ((line = br.readLine())!=null) {
				System.out.printf("%d : %s\n", lineNumber++, line);
			} //  while
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			
		}
		
		System.out.println("end");
		
		
	} // main

} // class
