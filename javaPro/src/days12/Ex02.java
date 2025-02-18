package days12;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author msg
 * @date 2025. 2. 18. - 오전 9:21:01
 * @subject 배열 단점 - 배열크기 자동 증가x
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
		int [] m = {3,5,2,4,1};
		
		// 2. 2가 있는 위치를 찾아서 100을 삽입
		// 1.
		int index = -1 ;// 못찾는경우 고려
		for (int i = 0; i < m.length; i++) {
			if (m[i]==2) index = i ;
			if (index == -1) System.out.println("2는 없다");				
			} // for
		
		int index = Arrays.stream(m).boxed().collect(Collectors.toList()).indexOf(2)

		// 3.(암기) 람다와 스트림
		// 배열 -> List 반환. indexOf 메서드
		int index = Arrays.stream(m) // 배열 -> Stream 변환
					.boxed() // 기본형 int [] -> 래퍼클래스 Integer [] 변환
					.collect(Collectors.toList()) // list 로 변환
					.indexOf(2);
//		System.out.println(">index = "+ index);
//		
//				m = Arrays.copyOf(m, m.length+1);
//				System.out.println(Arrays.toString(m));
//				
//				//[3,5,2,4,1,6,0] -> [3,5,2,2,4,1,6]
//				for (int i = m.length-2; i >= index; i--) {
//					m[i+1] = m[i];
//				} // for i
		
				// 2.
				// [3,5,2,4,1,6,0]
			
				int [] temp = new int[m.length+1];
				System.arraycopy(m, 0, temp, 0, index);
				System.out.println(Arrays.toString(temp));
				System.arraycopy(m, index, temp, index + 1, m.length - index);
				System.out.println(Arrays.toString(temp));
				m = temp;
				m[index] = 100;
				
				System.out.println(Arrays.toString(m));
				
				// [문제 ] 다시 100 삭제
				// [3,5,100,2,4,1,6]
				// [3,5,2,4,1,6] 빈공간 0제거까지
			
				int [] temp2 = new int [m.length - 1];
				System.arraycopy(m, 0, temp2, 0, index);
				System.arraycopy(m, index+1, temp2, index, m.length -1 - index);
				m = temp2;
				System.out.println(Arrays.toString(m));
				
				
	} // main

} // class
