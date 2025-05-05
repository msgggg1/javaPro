package days28;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Stream;

/**
 * @author msg
 * @date 2025. 3. 16. - 오후 9:18:43
   @subject
   @content
 */
public class Ex04_04_review {

	public static void main(String[] args) throws FileNotFoundException, IOException {
//		Stream<Path> s = Files.list(path);
//		Stream<String> s2 = Files.lines(path);
//		Stream<String> s3 = BufferedReader.lines()
		
		String uri = ".\\src\\days28\\Ex01.java";
		File f = new File(uri);
		FileReader reader = new FileReader(f);
		BufferedReader br = new BufferedReader(reader);
		Stream<String> lines = br.lines();
		lines.forEach(System.out::println);

	}

}
