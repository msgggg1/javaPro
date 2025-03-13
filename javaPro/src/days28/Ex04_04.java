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
		// Stream<Path> Files.list(Path dir)
		// Stream<String> Files.lines(Path)
		// Stream<String> BufferedReader.lines()
		
		String uri = ".\\src\\days28\\Ex01.java";
		// 라인단위로 읽어와서 출력(처리)
		// FileReader, BufferedReader 보조스트림, String line, while (line != null){}
		//Path path =Path.of(null);
		//Path path =Paths.get(null);
		Path path =Path.of(uri);
		Stream<String> lines = Files.lines(path);
		lines.forEach(System.out::println);
		

	} // main

} // class
