package days03;

/**
 * @author msg
 * @date 2025. 2. 5. - 오후 4:43:29
 * @subject
 * @content
 */
public class Ex07_06 {

	public static void main(String[] args) {
		// ?:  : 삼항연산자 또는 조건연산자
		int x = 30, y;
		//y = x > 10 ? 1 : 2; // 삼항연산자(x>10, ?1, 2; -> 항 3개) , 첫 항 참거짓 판단 -> 참 2항/거짓 3항
		y = ( x > 5 ? ( x < 10 ? 1 : 2) : 200 ); // 삼항연산자 안에 삼항연산자
		System.out.println(y);
		
	} //main

} //class
