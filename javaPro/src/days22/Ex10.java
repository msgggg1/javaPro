package days22;

import java.util.HashSet;

/**
 * @author msg
 * @date 2025. 3. 5. - 오후 4:10:57
 * @subject C -> L -> Arraylist, Vector, LinkedList, Stack, Queue(LinkedList,  PriorityQueue - queue기능 사용 시 큐로 받기)
 * @content C -> Set -> HashSet 컬렉션 클래스
 * 				중복허용X
 * 				순서유지X
 */
public class Ex10 {

	public static void main(String[] args) {
		HashSet hs = new HashSet(); // 증가시 %
		hs.add(9);
		hs.add(1);
		hs.add(15);
		hs.add(15); // 예외 발생X
		hs.add(15);// 예외 발생X
		hs.add(null);
		hs.add(null); // 예외 발생X
		//[1, 9, 15]
		// 중복 허용 X 15	1번만 추가됨.
		// 순서 유지 X
		System.out.println(hs);
	} // main

} // class
