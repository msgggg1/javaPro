package days21;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Predicate;

public class Ex10_review {

	public static void main(String[] args) {
//		
		
		ArrayList wish = new ArrayList();
		
		wish.add("오시온");
		wish.add("마에다 리쿠");
		wish.add("토쿠노 유우시");
		wish.add("히로세 료");
		wish.add("후지나가 사쿠야");
		
		System.out.println(wish);
		
		
		//[1] 김도훈 한번 더 추가
		// index 2 => "양재원" 삽입(insert)
		wish.add(2, "오시온");
		
		// [문제]
		//"김도훈" 요소를 찾아서 있으면 삭제.
//		wish.remove(wish.indexOf("오시온"));
//		System.out.println(wish);
		
		
		// [문제] 모든 김도훈 요소를 삭제.
//		int index = 0;
//		while ((index=wish.indexOf("오시온"))!= -1) {
//			wish.remove("오시온");
//		} //while
//		System.out.println(wish);

//		while (wish.remove("오시온")) ;
//		System.out.println(wish);

//		ArrayList removeList = new ArrayList();
//		removeList.add("오시온");
//		wish.removeAll(removeList);
//		System.out.println(wish);

//		Predicate<String> isNameCheck = (n) -> n.equals("오시온");
//		wish.removeIf(isNameCheck);
//		System.out.println(wish);
		
//		wish.removeIf((t) -> t.equals("오시온"));
//		System.out.println(wish);
		
		//[문제] 김씨 모두 삭제
//		wish.removeIf((t) -> ((String)t).matches("김[가-힣]+"));
//		wish.removeIf((t) -> ((String)t).matches("김.+"));
//		wish.removeIf((t) -> ((String)t).startsWith("김"));
		
		// 이름을 오름차순 정렬
		wish.sort(null);
		System.out.println(wish);
		
		//이름 내림차순 정렬
//		wish.sort(Collections.reverseOrder());
		wish.sort((o1, o2) -> ((String) o2).compareTo((String) o1));
		System.out.println(wish);
		
		// [문제] index = 5 이름 요소 얻어오기
		System.out.println(wish.get(5));
		
		// [문제] index 1~4 요소  w
		System.out.println(wish.subList(1, 5));
		
		wish.clear();
		System.out.println(wish);
		System.out.println(wish.size());
		
		// [문제] 모든 요소를 제거
	} // main

} // class
