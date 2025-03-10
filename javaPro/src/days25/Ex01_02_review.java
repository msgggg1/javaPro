package days25;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex01_02_review {

	public static void main(String[] args) {

		String fileName = ".\\src\\days25\\Ex10.java";
		String copyFileName = ".\\src\\days25\\CopyEx10.java";

		//16065700
		//4267400
		//2497400
		fileCopy_textStream(fileName, copyFileName);
		클래스명변경(copyFileName);

	} // main

	private static void 클래스명변경(String fileName) {
		StringBuilder sb = new StringBuilder();
		
		int code;
		try (FileReader reader = new FileReader(fileName)){
			while ((code = reader.read()) != -1) {
				sb.append((char)code);
			} //while
			System.out.println( sb.toString() );
			
			Pattern p = Pattern.compile("Ex10");
			Matcher m = p.matcher(sb.toString());
			
			if (m.find()) {
				System.out.println(m.group());
				System.out.printf("start:%d ~ end:%d\n", m.start(), m.end());
				m.appendReplacement(sb, "CopyEx10");
			} // if
			m.appendTail(sb);
			
			//파일 저장
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private static void fileCopy_textStream(String source, String target) {
		long start = System.nanoTime();

		try (FileReader reader = new FileReader(source);
			FileWriter writer = new FileWriter(target);
			BufferedReader br = new BufferedReader(reader, 1024);
			BufferedWriter bw = new BufferedWriter(writer, 1024);
				){

			String line ;
			int n ;
			char [] cbuf = new char [1024];
			while ((n = br.read(cbuf)) != -1) {
				bw.write(cbuf, 0, n);
			} //while
			bw.flush();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
			/*
			while ((line = br.readLine())!= null) {
				bw.write(line+"\r\n");
			} //while
			writer.flush();
			*/

		long end = System.nanoTime();

		System.out.println(-1*(start-end));

	}



	/*
	private static void fileCopy_textStream(String source, String target) {

		long start = System.nanoTime();

		try (FileReader reader = new FileReader(source);
			FileWriter writer = new FileWriter(target);
				){

			int code ;
			while ((code=reader.read())!= -1) {
				writer.write(code);
			} //while
			writer.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}

		long end = System.nanoTime();

		System.out.println(-1*(start-end));
	}
	 */

} // class
