package days25;

import java.io.BufferedReader;
import java.io.StringReader;

/**
 * @author msg
 * @date 2025. 3. 10. - 오전 11:05:56
 * @subject 메모리 스트림 - StringReader/Stringwriter 활용도***
 * @content
 */
public class Ex03_02 {

	public static void main(String[] args) {
		
		String source = "package days25;\r\n"
				+ "\r\n"
				+ "import java.io.File;\r\n"
				+ "import java.io.FileReader;\r\n"
				+ "import java.io.FileWriter;\r\n"
				+ "import java.util.Date;\r\n"
				+ "\r\n"
				+ "/**\r\n"
				+ " * @author msg\r\n"
				+ " * @date 2025. 3. 10. - 오전 9:01:21\r\n"
				+ " * @subject\r\n"
				+ " * @content\r\n"
				+ " */\r\n"
				+ "public class Ex01_02 {\r\n"
				+ "\r\n"
				+ "	public static void main(String[] args) {\r\n"
				+ "		\r\n"
				+ "		String fileName = \".\\\\src\\\\days24\\\\Ex01.java\"; // 복사할 원본 파일\r\n"
				+ "		String copyFileName = \".\\\\src\\\\days24\\\\CopyEx01.java\"; // 복사할 곳의 파일명\r\n"
				+ "		\r\n"
				+ "		// >처리시간: 7112600 ns(10^-9)\r\n"
				+ "		fileCopy_textStream(fileName, copyFileName); // 파일 복사 메서드\r\n"
				+ "		\r\n"
				+ "		System.out.println(\"end\");\r\n"
				+ "		\r\n"
				+ "		\r\n"
				+ "	} // main\r\n"
				+ "\r\n"
				+ "	private static void fileCopy_textStream(String source, String target) {\r\n"
				+ "		long start = System.nanoTime();\r\n"
				+ "		\r\n"
				+ "		\r\n"
				+ "		int code;\r\n"
				+ "		try (FileReader reader = new FileReader(source);\r\n"
				+ "			FileWriter writer = new FileWriter(target);){\r\n"
				+ "			\r\n"
				+ "			while ((code = reader.read()) != -1) {\r\n"
				+ "				System.out.print((char)code);\r\n"
				+ "				writer.write(code);// 디스크에 쓰기 x /스트림에 쓰기작업. 다 차면 자동 flush-> 수동 flush (작업끝내기), 남은거 밀어냄 / \r\n"
				+ "			} //  while\r\n"
				+ "			writer.flush(); \r\n"
				+ "			\r\n"
				+ "		} catch (Exception e) {\r\n"
				+ "			System.out.println(e.toString());\r\n"
				+ "		}\r\n"
				+ "		\r\n"
				+ "		long end = System.nanoTime();\r\n"
				+ "		\r\n"
				+ "		System.out.printf(\">처리시간: %d ns\\n\", end-start);\r\n"
				+ "		\r\n"
				+ "	}\r\n"
				+ "\r\n"
				+ "} // class\r\n"
				+ "";
		
//		System.out.println(source);
		
		// [문제] source 문자열에서
		// 		20번째 라인의 문자열을 찾아서 출력
		/*
		//[1]
		String [] sArr = source.split("\r\n");
		System.out.println(sArr[19]);
		*/
		
		//[2] 메모리 스트림
		// 문자열 -> [문자스트림] => BufferedReader 보조스트림 / 한줄씩 처리하게 해주는 보조 스트림
		try (
				StringReader sr = new StringReader(source);
				BufferedReader br = new BufferedReader(sr);
				){
			
			int i = 1;
			while (i++ <= 19) br.readLine();
			String line20 = br.readLine();
			System.out.println(line20);
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		

	} // main

} // class
