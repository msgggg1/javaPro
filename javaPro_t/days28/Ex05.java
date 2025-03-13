package days28;

import java.util.stream.Stream;

/**
 * @author kenik
 * @date 2025. 3. 13. - 오전 11:27:43
 * @subject 
 * @content
 */
public class Ex05 {

	public static void main(String[] args) {
		// [ 빈 스트림 ]
		/*
		Stream<Object> s =  Stream.empty();
		System.out.println( s.count() );  // 0
		*/
		
		// [두 스트림 연결]  concat()
		/*
		String [] s1 = { "1","2","3" };
		String [] s2 = { "a","b","c" };
		// String[] -> Stream 변환
		Stream<String> ss1 = Stream.of(s1);
		Stream<String> ss2 = Stream.of(s2);
		
		Stream<String> ss3 =  Stream.concat(ss1, ss2);
		*/
		

	} // main

} // class
  