package days26;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

/**
 * @author msg
 * @date 2025. 3. 11. - 오전 11:39:29
 * @subject days25/Ex08/java 참고
 * @content days25.Ex02_02.java
 */
public class Ex04_02 {

	public static void main(String[] args) throws IOException {
		 Vector<FileInputStream> v = new Vector<>();
		 for (int i = 1; i <= 10; i++) {
			v.add(new FileInputStream(".\\src\\days26\\시간표-"+i+".pdf"));
		 } // for i
			
			Enumeration<FileInputStream> en = v.elements();
			 SequenceInputStream sis = new SequenceInputStream(en);

			 String name = ".\\src\\days26\\시간표.pdf";
			 FileOutputStream fos = new FileOutputStream(name);
			 int b ;
			 while ((b = sis.read())!=-1) {
				fos.write(b);
			} //  while
			 fos.close();
			 
			 System.out.println("end");

			 /*
			  * try (FileInputStream reader = new FileInputStream(source); => 얘만 바꾸기. Ex02_02
			FileOutputStream writer = new FileOutputStream(target);
			BufferedInputStream bis = new BufferedInputStream(reader, BUFFER_SIZE);
			BufferedOutputStream bos = new BufferedOutputStream(writer, BUFFER_SIZE)){*/
			 
			 
			 
		/*
		String pathname = ".\\src\\days26";
		for (int i = 0; i < 10; i++) {
			File f = new File(pathname, String.format("%s-%d%s", "시간표", i+1, ".pdf"));
			
			try {
				 ByteArrayInputStream baisN = new ByteArrayInputStream(f);
			} catch (Exception e) {
				// TODO: handle exception
			}
		} // for i
		*/
		
	} // main
	
	/*

private static void fileCopy_byteStream(String source, String target) {
		
		long start = System.nanoTime();
		
		final int BUFFER_SIZE = 1024;

		int code;
		try (FileInputStream reader = new FileInputStream(source);
			FileOutputStream writer = new FileOutputStream(target);
			BufferedInputStream bis = new BufferedInputStream(reader, BUFFER_SIZE);
			BufferedOutputStream bos = new BufferedOutputStream(writer, BUFFER_SIZE)){

			byte [] b = new byte [BUFFER_SIZE];
			int n= -1; // 읽어온 바이트 수 저장할 변수
			while ((n = bis.read(null))!=-1) {
				bos.write(b,0,n);
			} //  while

			bos.flush();
				
		} catch (Exception e) {
			System.out.println(e.toString());
		}

		long end = System.nanoTime();

		System.out.printf(">처리시간: %d ns\n", end-start);

	}
	*/
	
} // class
