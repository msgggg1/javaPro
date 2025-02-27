package days19;

import java.util.Arrays;

/**
 * @author msg
 * @date 2025. 2. 27. - 오후 2:12:08
 * @subject
 * @content
 */
public class Ex04_07 {

	public static void main(String[] args) {
		String message = "TODO Auto-generated method stub";
		
		// String -> byte[] 변환 /네트워크 기본단위 바이트
		byte [] messageArr = message.getBytes();
		System.out.println(Arrays.toString(messageArr));
		
		// byte[] -> String 변환
		message = new String(messageArr);
		System.out.println(message);
		
	} // main

} // class
