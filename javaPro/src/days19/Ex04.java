package days19;

/**
 * @author msg
 * @date 2025. 2. 27. - 오전 10:25:33
 * @subject [ 문자열 다루는 클래스 ]
 * @content 1. String 클래스
 * 			2. StringBuffer 클래스
 * 			3. StringBuilder 클래스
 * 			4. StringTokenizer 클래스 == String.split()
 * 			5. StringJoiner 클래스 == String.join()
 */
public class Ex04 {

	public static void main(String[] args) {
		// [1. String 클래스]
		//		ㄴ 문자열 자료형
		// 			ㄴ 문자열 나열  (다른 곳에서는 char[]로 나타냄)
		// 		ㄴ(암기) "변경 불가능한(immutable) 클래스이다"
		// String : 클래스다
		//String name = new String("이"); // 이렇게 안 쓰는 이유
		String name = "이"; // 힙영역 주소값이 "이"이다.
		String name2 = "이"; // 힙영역 주소값이 "이"이다.
		System.out.println(name == name2); // 문자열 비교x. 같은 주소값 갖는지 비교
		
		String name3 = new String("이");
		String name4 = new String("이");
		System.out.println(name3 == name4);
	} // main

} // class




