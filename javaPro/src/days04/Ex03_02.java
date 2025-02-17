package days04;

/**
 * @author msg
 * @date 2025. 2. 6. - 오후 12:06:51
 * @subject
 * @content
 */
public class Ex03_02 {

	public static void main(String[] args) {
		// 학생의 이름을 여러명 저장 -> 배열 선언
		String [] names = null; // (지역)변수, 참조변수, 배열명
		
		names = new String[10];
		
		names[0] = "홍길동";
		names[1] = "이창익";
       //The [local variable] names may not have been initialized
		
		System.out.println(names[0]);
		// NullPointerException -> new 안하면 뜨는 값
		
		//System.out.println(names[10]);
		//ArrayIndexOutOfBoundsException  0~9
		// 배열 첨자값 범위 벗어났다. 
		
		System.out.println(names[9]);
		

		
	} // main

} // class
