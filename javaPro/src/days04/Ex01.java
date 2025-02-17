package days04;

/**
 * @author msg
 * @date 2025. 2. 6. - 오전 10:26:03
 * @subject
 * @content
 */
public class Ex01 {

	public static void main(String[] args) {
		// 연산자 : instanceof 연산자
		//        >> >>> << 쉬프트(shift)연산자
		//					방향을 바꾸다, 이동시키다, 옮기다.
		//        >>=    <<=복합대입연산자.
		
		System.out.println( 15 >> 2); 	// 000011111 >> 2 -> __000011(부호비트 1 -> 11, 부호비트(양수) 0 -> 00 채우기) 
		System.out.println( 15 >>> 2);	// __000011(무조건 0 채우기) 
		System.out.println( 15 << 2); //<<<은 없음 // 001111__(뒤에 무조건 0으로 채움)
		//67 -> 0100 0011
		//33 -> 0010 0001
		
		// 이진법 함수
		 //System.out.println(Integer.toBinaryString(15));
		//00001111
		// System.out.printf("%08d",Integer.toBinaryString(15));
		 //IllegalFormatConversionException ---> conversion 안맞음     -> Integer.toBinaryString(15): string
		 
		String b = Integer.toBinaryString(15); // "1111" -> 1111
		System.out.printf("%08d", Integer.parseInt(b));
		 
	
		//System.out.println("0000" + Integer.toBinaryString(15));
		//a = System.out.println(Integer.toBinaryString(15));
		//System.out.printf("%4d",System.out.println(Integer.toBinaryString(15));
		
		
		System.out.println( Integer.toOctalString(15));// 8진수 문자열
		System.out.println(Integer.toHexString(15)); // 16진수 문자열
		
	} // main

}// class 
