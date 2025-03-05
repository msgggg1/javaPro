package days22;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * @author msg
 * @date 2025. 3. 5. - 오후 5:20:58
 * @subject
 * @content
 */
public class Ex11 {

	public static void main(String[] args) {
		 // Set 인터페이스의 특징
		// 중복 허용 x, 순서 유지 X
		// 중복 허용 x, 순서 유지 O 해야하는 경우
		// [HashSet 컬렉션 클래스]
		//HashSet<int> hs = new HashSet<int>(); // 제네릭 기본형 사용 불가
		
		//<> 제네릭 : 기본형X, 참조형O
//		HashSet<Integer> hs = new HashSet<Integer>();
		LinkedHashSet<Integer> hs = new LinkedHashSet<>();
		hs.add(new Integer(100));
		hs.add(20); // Auto-Boxing
		hs.add(20); // Auto-Boxing
		hs.add(20); // Auto-Boxing
		hs.add(15);
		hs.add(15);
		hs.add(30);

		System.out.println(hs);
		
	} // main

} // class
