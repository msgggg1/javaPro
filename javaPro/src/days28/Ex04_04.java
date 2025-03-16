package days28;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * @author msg
 * @date 2025. 3. 13. - 오전 11:20:36
 * @subject
 * @content
 */
public class Ex04_04 {

	public static void main(String[] args) throws IOException {
		// [ 파일 ]
		// Stream<Path> Files.list(Path dir)	// 디렉토리 Path객체를 Stream으로 반환
		// Stream<String> Files.lines(Path) 	// path는 파일이여야 하며 한줄씩 읽어옴
		// Stream<String> BufferedReader.lines()// 한줄씩 읽어옴
		
		String uri = ".\\src\\days28\\Ex01.java";
		// 라인단위로 읽어와서 출력(처리)
		// FileReader, BufferedReader 보조스트림, String line, while (line != null){}
		//Path path =Path.of(URI uri);
		//Path path =Paths.get(uri);
		Path path =Path.of(uri);
		Stream<String> lines = Files.lines(path);
		lines.forEach(System.out::println);
		

	} // main

} // class
