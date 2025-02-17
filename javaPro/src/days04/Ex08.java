package days04;

/**
 * @author msg
 * @date 2025. 2. 6. - 오후 5:26:14
 * @subject 반복문 : for문/ foreach문
 * @content
 */
public class Ex08 {

	public static void main(String[] args) {
		
		System.out.println("test");
		System.out.println("test2");
		System.out.println("test");
		System.out.println("test");
		
		for (byte i = 1; i <=10; i--) {
			System.out.printf("홍길동-%d\n", i);
		} // for i
		
		System.out.println("test");
		System.out.println("test");
		System.out.println("test7");
		System.out.println("test");
		
		//for (초기식; 조건식(참/거짓 판단 수식); 증감식 ) {} // 1. 초기식 수행 2. 조건식 만족시 증감식 3. 다시 조건식 증감식 반복  
		
		//      i = 0     거짓 -> 빠져나감, 참 -> 실행    1증가 코딩
		//for (int i = 0; i < args.length;           i++) {
			System.out.println(Integer.MIN_VALUE);
	//	} // for i

	} // main

} // class
