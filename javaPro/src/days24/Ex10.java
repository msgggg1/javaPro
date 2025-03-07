package days24;

/**
 * @author msg
 * @date 2025. 3. 7. - 오후 5:10:04
 * @subject 자바에서 입출력
 * @content			Input Output
 * 					IO
 */
public class Ex10 {

	public static void main(String[] args) {
		/*
		 *  1. 자바의 IO(입출력)
		 *  <컴퓨터 내부에서 프로그램> -- 출력 -->	<외부 장치(프로그램)>
		 * 							송신			모니터
		 * 							output
		 * 
		 * 						 <-- 입력 --     키보드
		 * 							 수신
		 * 							input
		 * 
		 *  2. 자바의 모든 입출력은 스트림(Stream) 이라는 개념으로 이루어진다. =/= 람다스트림

		 *  3. 자바 스트림(Stream)
		 *  	ㄴ 사전적 의미: 흐르는 물 , 예) 빨대 -> 단방향 / 데이터 정렬되어 흘러감/ 모든 입출력 예)빨대를 거쳐야 함/
		 *  	ㄴ 단방향
		 *  		1) 읽기(입력) 스트림
		 *  		2) 쓰기(출력) 스트림
		 *  4. 자바 스트림 2가지 종류
		 *  	1) 문자(텍스트) 스트림
		 *  		Reader 최상위 부모클래스
		 *  		Writer    "
		 *  
		 *  				FileReader, FileWriter
		 *  		1문자 (== char == 유니코드 2바이트)
		 *  				int 로 받음
		 *  		입출력 단위 한 문자, 문자열, 문자 배열 다 가능함
		 *  					BufferedReader/Writer -> 문자 다루는 스트림 . 보조스트림
		 *  		
		 *  		
		 *  	2) 바이트(이진) 스트림 (0,1)
		 *  		InputStream  최상위 부모 클래스
		 *  		OutputStream 최상위 부모 클래스 
		 *  
		 *  				FileInputStream, FileOutputStream
		 *  				BufferedInputStream/     -> 문자 읽으나 바이트값 처리
		 *  		0/1		1비트 단위 처리 X
		 *  		1바이트(8비트)가 기본처리단위	, 바이트 배열, 정수(int)(이진값으로 채워진)
		 *  
		 *  5. 보조스트림 - 어떤 스트림의 입출력을 더 쉽도록 보조역할하는 스트림
		 *  		- 문자 보조스트림 (입/출)
		 *  		- 바이트 보조스트림 (입/출)
		 *  
		 * */

	} // main

} // class
