package days23;

import java.util.HashMap;
import java.util.Map;

/**
 * @author msg
 * @date 2025. 3. 6. - 오후 2:51:23
 * @subject
 * @content
 */
public class Ex06 {

	public static void main(String[] args) {
		// Map 
		/* 1. 키-값 쌍으로 데이터를 저장하는 구조
		 * 	 엔트리(entry)
		 * 2. 키는 중복 허용 X 
		 * 3. Map 인터페이스를 구현한 클래스
		 * 	1) [Hash]Map		신								대표적 Map인터페이스 구현 클래스 ArrayList		StringBuilder
		 * 	4) [Hash]table	구, 멀티스레드 안전(동기화처리 O)									Vector		StringBuffer
		 * 		hash - 해싱기법 사용해서 데이터 저장 -> 검색 성능 뛰어나다.***
		 * 
		 * 		해싱기법 - 해시함수(hash function)을 이용해서 
		 * 					데이터를 해시테이블(hash table)에 저장하고 검색하는 기법
		 * 				- 해시함수: 데이터가 저장되어 있는 곳을 알려주기에 
		 * 							대량의 데이터 중에 원하는 데이터를 빠르게 검색할 수 있다. 
		 * 
		 * 	2) TreeMap			- 검색, 정렬 성능 뛰어남
		 * 	3) LinkedHashMap 	- 순서 유지 O
		 * 
		 * */
		// <[K]ey, [V]alue>
		//   id      name
		HashMap<String, String> hm = new HashMap<>();
		//	LinkedHashMap<String, String> hm = new LinkedHashMap<>(); // 순서유지 O
		hm.put("admin", "관리자");
		hm.put("kenik", "이창익");
		hm.put("kenik", "서주원");
		hm.put("hong", "홍길동");

		System.out.println(hm);
		// {kenik=이창익, hong=홍길동, admin=관리자} 순서유지X

		// 검색, 수정, 삭제 - key, value - 일반적으로 key값을 찾음
		// "kenik"키
		System.out.println(hm.containsKey("kenik"));
		System.out.println(hm.containsValue("이창익"));

		//indexOf X ->순서유지X
		if (hm.containsKey("이창익")) {
			// 엔트리 (Entry) ***
			//hm.get("")

			hm.put("kenik", "서주원");
			//			hm.replace("kenik", "서주원");
		} // if

		System.out.println(hm);

		//hm.clear();

		hm.put("park", "서주원");
		hm.put(null, null); // null 상관 x
		hm.put(null, "널");

		System.out.println(hm);
		
		// null 키의 엔트리 삭제
		System.out.println(hm.remove(null)); // 삭제된 엔트리의 Value 값

		System.out.println(hm);

		//String value = hm.getOrDefault("abc", "익명"); // 존재 X -> null
		String value = hm.get("abc"); // 존재 X -> null

		// merge() 병합 메소드 사용 예
		Map<String, Integer> map = new HashMap<>(); //Map으로 하는게 더 좋은 코딩 // List계열 - 다 list 기본(?)형

		// 초기 데이터 추가
		map.put("apple", 1);
		map.put("banana", 2);

		// merge() 메서드 사용 예
		map.merge("apple", 3, (oldValue, newValue) -> oldValue + newValue);  // 기존 값 + 새 값
		map.merge("banana", 1, (oldValue, newValue) -> oldValue + newValue); // 기존 값 + 새 값
		map.merge("cherry", 5, (oldValue, newValue) -> oldValue + newValue); // cherry는 처음 등장

		System.out.println(map);


	} // main

} // class
