package days25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author msg
 * @date 2025. 3. 10. - 오전 11:17:58
 * @subject
 * @content
 */
public class Ex04 {

	public static void main(String[] args) throws IOException {
		// 키보드로부터 한 문자 입력..
		//System.in.read();
		// 표준입력장치(키보드) -> 입력 바이트스트림
		/*
		//[1]
		InputStream is = System.in; // 한글 읽어갈수없음

		System.out.print("한 문자 입력?");
		int b = is.read(); // 1바이트(기본단위 byte인 byteStream) int로 받더라도 byte 정수값..
		System.out.printf("");
		 */
		/*
		//[2]
		String name;
		// Scanner 사용
		// InputStream System.in : 바이트 스트림
		// InputStream[Reader] 클래스 : 문자 스트림
		// Buffered[Reader] 클래스 	: 문자 스트림

		// 키보드 -> System.in 표준 스트림 / 키보드에서 읽어오는 표준 스트림은 byteStream / 1바이트밖에 못읽어감. 
		// 한글 세바이트[][][] -> 한문자
		// 입력된	바이트 -> 문자값 변환 보조 스트림 : InputStreamReader
		// 라인단위로 처리할 보조스트림: bufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("> 이름 입력?");
		name = br.readLine();
		System.out.println(name);
		 */

		//[3]
		InputStream is = System.in;

		System.out.print("한 문자 입력?");
//		int b = is.read(); 
//		System.out.printf("%1$d-%1$c\n", b);
//		한 문자 입력?가
//				234-ê
//		한 문자 입력?각
//				234-ê
// -> 한바이트 읽어옴
		
		// 스캐너, br 사용하지 않고
		// [문제] > 이름 입력 : 홍길동 enter
		byte [] b = new byte [3];
		int n = is.read(b); // 배열에 저장된 개수. 읽어온 개수 
		
		for (byte c : b) {
			System.out.println(c);
		}

		char one = new String(b).charAt(0);
		System.out.println(one);
		
	} // main

} // class
