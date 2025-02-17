package days10;

import java.util.Arrays;

/**
 * @author msg
 * @date 2025. 2. 14. - 오후 4:31:53
 * @subject
 * @content
 */
public class Ex04_04 {

	public static void main(String[] args) {
		// 배열 -> 더 큰 배열 복사
		int [] m = {1,2,3};
//		int [] temp = new int [m.length+3];
		
//		[1]
//		for (int i = 0; i < m.length; i++) {
//			temp[i]=m[i];
//		} // for i
		
		// [2] System.arraycopy();
//		System.arraycopy(m, 0, temp, 0, m.length);
		
		//[3] Arrays.copyOf()
		int [] temp = Arrays.copyOf(m, m.length+3); // 바로 배열 만들어서 저장
		
	
		int [] mClone = m.clone(); // 복제(똑같은 배열 생성, 자기거 참조)/ 복사(원래것 참조)
		
		

	} // main

} // class
