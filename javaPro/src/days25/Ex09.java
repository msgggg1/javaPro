package days25;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author msg
 * @date 2025. 3. 10. - 오후 2:10:35
 * @subject PipedReader/PipedWriter
 * @content	 ㄴ 스레드 간의 데이터를 주고 받을 때 사용하는 스트림
 * 			RandomAccessFile 
 * 			 ㄴ 파일의 어느 위치에서나 읽기/쓰기가 가능한 장점이 있는 스트림 
 * 			 ㄴ 내부적으로 DataOutput, DataInput 인터페이스를 구현
 * 			
 */
public class Ex09 {

	public static void main(String[] args) throws IOException {
		String s = "I Love normal Java";
		String q = "javabook";

		String name = "random.txt";
		String mode = "rw";

		try (RandomAccessFile raf = new RandomAccessFile(name, mode)){
			raf.seek(2);
			long cp = raf.getFilePointer();
			raf.writeBytes(s);


		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}  catch (Exception e) {
			e.printStackTrace();
		}

		// 일시정지 + 엔터 계속
		System.out.println(">엔터 진행");
		System.in.read();
		System.in.skip(System.in.available());

		try (RandomAccessFile raf = new RandomAccessFile(name, mode)){
			raf.seek(2);
			long cp = raf.getFilePointer();
			raf.writeBytes(q);


		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}  catch (Exception e) {
			e.printStackTrace();
		}

		// 일시정지 + 엔터 계속
		System.out.println(">엔터 진행");
		System.in.read();
		System.in.skip(System.in.available());
		
		try (RandomAccessFile raf = new RandomAccessFile(name, mode)){
			raf.seek(2);
			String line = raf.readLine();
			System.out.println(line);


		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}  catch (Exception e) {
			e.printStackTrace();
		}

		// 일시정지 + 엔터 계속
		System.out.println(">엔터 진행");
		System.in.read();
		System.in.skip(System.in.available());


		//[1] 테스트
		/*
		String name = "test.txt";
		String mode = "rw";
		try (RandomAccessFile raf = new RandomAccessFile(name, mode)){
			//파일포인터 위치
			// [][][][]
			// 0
			// 
			System.out.println(">파일 포인터의 위치 :" + raf.getFilePointer()); //0
			raf.writeInt(100); // 4바이트 int
			System.out.println(">파일 포인터의 위치 :" + raf.getFilePointer()); //4
			raf.writeLong(200L);
			System.out.println(">파일 포인터의 위치 :" + raf.getFilePointer());
			raf.seek(4);
			System.out.println(">파일 포인터의 위치 :" + raf.getFilePointer());

		} catch (Exception e) {
			// TODO: handle exception
		}
		 */

	} // main

} // class
