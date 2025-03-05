package days22;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author msg
 * @date 2025. 3. 5. - 오후 12:37:13
 * @subject
 * @content
 */
public class Ex06_02 {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		list.add("양재원");
		list.add("서주원");
		list.add("안우혁");
		list.add("이정인"); // 내부적으로 주소값 가짐(node가 연결되고 있음)
		
		System.out.println(list); // 순서 유지O
		
		list.addFirst("김현수");
		list.addLast("박지웅");
		
		
		// 양재원, 서주원 사이에 홍길동 삽입
//		int index = list.indexOf("서주원");
//		list.set(index, "홍길동");
		
		// 안우혁 삭제
		int index = list.indexOf("안우혁");
		list.remove(index);
		
		System.out.println(list);
		
		// list.iterator();
		
		// 내림차순으로 반복자 -> 뒤부터 읽어옴
		Iterator ir = list.descendingIterator();
		while (ir.hasNext()) {
			String name = (String) ir.next();
			System.out.println(name);
		} // while
		
		System.out.println("-".repeat(60));
		
		// 첫번째로 일치하는 객체 제거
		list.removeFirstOccurrence("홍길동");
		// 마지막일치하는 객체 제거
//		list.removeLastOccurrence()
		
	} // main

} // class
