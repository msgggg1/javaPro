package days18;

import java.io.IOException;

/**
 * @author msg
 * @date 2025. 2. 26. - 오후 2:41:06
 * @subject
 * @content
 */

public class Ex07 {

	public static void main(String[] args)  {// 1) throws IOException
		
		// Unhandled exception type IOException - 예외 처리되지 않았다.
		// 2)
		// Exception
		//	직계자식
		//IOException
		
		//컴파일러가 예외처리 유무 확인 -> 밑줄
//		System.in.read();
		
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		/*
		 * 1. "unchecked 예외"
		 * 		RuntimeException 및 자식 예외클래스들은
		 * 		컴파일러가 예외처리를 확인하지 않는 예외이다.
		 * 2. "checked 예외"
		 * 		그 외 모든 Exception 클래스들은 컴파일러가 
		 * 		예외처리를 확인하는 예외이다. 
		 * */

	} // main

} // class
