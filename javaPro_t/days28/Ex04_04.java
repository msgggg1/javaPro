package days28;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class Ex04_04 {

	public static void main(String[] args) throws IOException {
		// [ 파일 ]
		// Stream<Path> Files.list(Path dir)
		// Stream<String> Files.lines(Path )
		// Stream<String> BufferedReader.lines()
		
		String uri = ".\\src\\days28\\Ex01.java"; 
		// 라인단위로 읽어와서 출력(처리)
		// FileReader , BufferedReader,   String line, while(line != null){ }
		
		// Path path = Path.of(URI uri);
		// Path path = Paths.get(uri);
		Path path = Path.of(uri );
		Stream<String> lines = Files.lines(path );
	lines.forEach(System.out::println);	
		

	} // main

}
  