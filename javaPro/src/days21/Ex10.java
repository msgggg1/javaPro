package days21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author msg
 * @date 2025. 3. 4. - 오후 3:51:19
 * @subject
 * @content
 */
public class Ex10 {

	public static void main(String[] args) {
		// L S M
		// [List] - ArrayList 컬렉션 클래스
		//			 ㄴ 가장 많이 사용되는 컬렉션 클래스
		// 			 ㄴ 순서 유지O, 중복 허용 O
		// 배열 용어 사용
		
		//배열
//		String [] names = new String[5];
//		names[0] = "홍길동"; // 0번째 요소

		// <> 제네릭, E -> Elemnet
		ArrayList list = new ArrayList(10);
//		ArrayList list = new ArrayList(); 위 와 같음.
//		System.out.println(list.isEmpty());
		System.out.println(list.size()); // 요소(Element)의 크기(갯수)
		list.add("권태정");
		list.add("김도훈");
		list.add("김민선");
		list.add("서재웅");
		list.add("김승효");
		list.add("김도훈"); // 중복 허용 O
//		System.out.println(list.size());
//		System.out.println(list.isEmpty());
		System.out.println(list); // 순서 지켜지는지 확인!
		//[권태정, 김도훈, 김민선, 서재웅, 김승효] -> 순서 유지 O
		
		// index 2 => "양재원" 삽입(insert)
		list.add(2, "양재원");
		//list.set(2, "양재원");
		System.out.println(list);
		
		list.trimToSize(); // 남은 공간(4) 제거
		System.out.println(list);
		
		//System.out.println(list.indexOf("홍길동")); // 없으면 -1
		System.out.println(list.lastIndexOf("홍길동")); // -1
		
		// "김도훈" 요소를 찾아서 있으면 삭제.
		
//		list.contains("김도훈"); // boolean
//		if (list.contains("김도훈")) {
//			System.out.println(list.remove("김도훈"));
//		} // if
	
		
//		list.remove(list.indexOf("김도훈"));
//		if (list.indexOf("김도훈")!=-1) {
//			list.remove(list.indexOf("김도훈"));
//		} // if
//		System.out.println(list);
		
		// [문제] 모든 김도훈 요소를 삭제
		
		//[5] 람다와 스트림
		// predicate gpt
//		Predicate<String> isNameCheck = (n) -> n.equals("김도훈"); // 익명클래스라고 봐도 됨
//		list.removeIf(isNameCheck);
		
		//[6] 익명클래스
//		list.removeIf(new Predicate<String>() {
//
//			@Override
//			public boolean test(String t) {
//				return t.equals("김도훈");
//			}
//		});
		
		//[7]
//		list.removeIf((t) ->  t.equals("김도훈")); // 
		
		//[문제] 김씨 모두 삭제
//		list.removeIf((t) -> ((String)t).matches("김[가-힣]+"));
//		list.removeIf((t) -> ((String)t).matches("김.+"));
//		list.removeIf((t) -> ((String)t).startsWith("김"));
//		list.removeIf((t) -> ((String)t).charAt(0) == '김');
		
		/*
		list.removeIf(new Predicate<String>() {

			@Override
			public boolean test(String t) {
				return (t.charAt(0)).eq;
			}
			
		})
		*/
		
		// 이름을 오름차순 정렬
//		Arrays.sort(배열명);
//		list.sort(null); // 기본 오름차순
		
		//이름 내림차순 정렬
//		list.sort(Collections.reverseOrder());
		// 람다와 스트림
//		list.sort((o1,o2) -> 
		
		System.out.println(list);
		
		// index = 5 이름 요소 얻어오기
		// 풀이) get(index) 메서드는 index 위치에 해당하는 요소를 반환
		// 배열의 경우 배열명[5]
		int index = 5;
		System.out.println(list.get(index));
		
		// [문제] index 1~4 요소  w
		int fromIndex = 1, toIndex =5;
		List slist = list.subList(fromIndex, toIndex);
		System.out.println(slist);
		
		// [문제] 모든 요소를 제거
//		while (!list.isEmpty()) {
//			list.remove(0);
//		} //  while
		
		list.clear();
		System.out.println(list);
		System.out.println(list.size());
		
		//[4]
//		while (list.remove("김도훈")) ;
		
		//[3]
//		ArrayList removeList = new ArrayList();
//		removeList.add("김도훈");
//		list.removeAll(removeList);
//		
//		System.out.println(list);
		
		
		
//		int index = 0;
//		while ((index = list.indexOf("김도훈")) != -1) {
//			System.out.println(index);
//			list.remove(index);
//		} //  while
		
		
//		while (list.contains("김도훈")) {
//			list.remove("김도훈");			
//		} //  while
//		System.out.println(list);
		
		
	} // main

} // class


