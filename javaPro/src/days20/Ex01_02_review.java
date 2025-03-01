package days20;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Ex01_02_review {

	public static void main(String[] args) {
		
		String fileName = ".\\src\\days18\\Ex10.java";

		int [][] counts = new int [3][];
		
		counts[0] = new int [10];
		counts[1] = new int [26];
		counts[2] = new int [26];
		
		int one ;
		
		try(FileReader reader = new FileReader(fileName);) {
			while ((one = reader.read()) != -1) {
			if (Character.isDigit(one)) counts[0][one-'0']++;
			else if (Character.isUpperCase(one)) counts[1][one-'A']++;
			else if (Character.isLowerCase(one)) counts[2][one-'a']++;
		} //while
		
		for (int i = 0; i < counts.length; i++) {
			
//			int totalCount = IntStream.of(counts[i]).sum();
			int totalCount = Arrays.stream(counts[i]).sum();
			System.out.printf("==%s:%d==\n", i==0?"숫자":(i==1?"대문자":"소문자"), totalCount);
			
			for (int j = 0; j < counts[i].length; j++) {
				System.out.printf("%c(%d)\t: %s\n", j+ i==0?'0':(i==1?'A':'a')
													, counts[i][j], "#".repeat(counts[i][j]));
			}
		}
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	} //main

} // class
