package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author msg
 * @date 2025. 2. 5. - 오전 11:46:51
 * @subject
 * @content
 */
public class Ex05 {

	public static void main(String[] args) throws IOException {
		
		 String name = null;
		// [문제]키보드로 부터 이름을 입력받아서 출력.

		/*
		 * 표준입력장치
		 * [키보드] -> [System.in] -> InputStreamReader -> bufferedReader
		 * 이창익 엔터
		 * 
		 * String name = br.readLine();
		 */
		//                          임시기억공간       바이트로 변환           입력값
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("> 이름 입력?");// 밑 코딩 위에만 있으면 됨
		//         스트링반환   
		name = br.readLine(); // 입력된 한 줄을 읽어라// readline 오류 -> 클릭
		// Unhandled exception type IOException : 예외처리해줘야하는 메소드
		
		System.out.printf("이름=%s\n", name);
		
		
	} //main

} //class
