package days22;

import java.util.Stack;

/**
 * @author msg
 * @date 2025. 3. 5. - 오후 2:01:28
 * @subject ArrayList - 읽기 빠르다.
 * @content	LinkedList
 * 			1) 순차적으로 추가/삭제 : ArrayList가 빠르다.
 * 			2) 중간 	   추가/삭제 : LinkedList 가 빠르다.
 * 			Vector- arrayList와 같은 기능인데 멀티스레드에 안전.
 */
public class Ex07 {

	public static void main(String[] args) {
		// 스택(Stack)과 큐(Queue)
		/*
		 * [Stack]
		 * 1. java.util 패키지
		 * 2. LIFO 자료구조
		 * 3. push() 요소 추가
		 * 	  pop() 요소 얻어오기, 제거O
		 * 	  peek()  "       , 제거X
		 * 	  isEmpty()
		 * 	  index search() 검색
		 * 4. Vector 클래스의 자식클래스 (=순서있는 List계열)
		 * 
		 * */
		
		Stack s = new Stack();
		s.push("박지웅"); // add쓰면 stack이 아님. stack 구조 쓰면 안되는것. pop, push. vector메소드 다 잇지만 쓰면 안됨
		s.push("서주원"); 
		s.push("안우혁"); 
		s.push("최인식"); 
		
		System.out.println(s.search("서주원")); //3
		
//		push(), pop(), peek(), isEmpty(), search(); 암기! stack구조는 다른 메소드 있어도 쓰면 안됨. 
		
		/*
		s.clear();
		System.out.println(s.peek());// EmptyStackException
		*/
		
		/*
		System.out.println(s.peek()); // 제거X
		System.out.println(s.peek()); // 최인식
		*/
		
		/*
		System.out.println(s.pop());//LIFO
		System.out.println(s.pop());//LIFO
		System.out.println(s.pop());//LIFO
		System.out.println(s.pop());//LIFO
		System.out.println(s.pop());//EmptyStackException
		*/
		
		/*
		while (!s.isEmpty()) {
			System.out.println(s.pop());
		} //  while iterator 안씀
		*/
		
		
	} // main

} // class
