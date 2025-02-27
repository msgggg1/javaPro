package days19;

/**
 * @author msg
 * @date 2025. 2. 27. - 오후 4:08:03
 * @subject
 * @content
 */
public class Ex07 {

	public static void main(String[] args) {
		
		// [Wrapper Class] 래퍼클래스
		// - 제네릭을 사용할 때의 Type은 기본형X, 래퍼클래스를 사용한다. (기억)
		
		// [Auto Boxing] [Auto UnBoxing] 용어 이해.
		
		//[2]
		int i = 100;
		Integer j = i; // Auto boxing(기본형 -> 래퍼클래스 변환)
		
		int k = j ; // Auto Unboxing (래퍼클래스 -> 기본형 변환) 
		
		//[1]
		/*int i = 100;
		System.out.println(i);
		Integer j = new Integer(100);
		//int k = j.intValue();
		j = Integer.valueOf(100);
		*/
		
//		int i = 100;
		disp(k);
//		System.out.printf("출력형식", [Object...)]);
		
		// 래퍼클래스의 상속계층도 (기억)
	} // main

	public static void disp(Object obj) { // int -> integer -> Object / 매개변수 object -> 모든 타입 다 받는다
		System.out.println(obj);
	}
	
} // class
