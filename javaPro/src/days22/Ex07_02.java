package days22;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author msg
 * @date 2025. 3. 5. - 오후 2:18:45
 * @subject
 * @content
 */
public class Ex07_02 {

	public static void main(String[] args) {
		/*
		 * [큐(Queue) 구조]
		 * 1. FIFO 구조
		 * 2. Queue 인터페이스
		 * 3. " 	인터페이스를 구현한 클래스 :LinkedList 등
		 * 4. Stack - push()		pop/peek()		isEmpty()		search()
		 * 	  Queue - offer() 		poll()/peek()	isEmpty()		x
		 * 
		 * */ 
				Queue q = new LinkedList(); // List 물려받았으나 다른 메소드 쓰면안됨. Queue 기능(FIFO) 목적으로 쓰려면 다른 메소드 X 
				q.offer("김예지");
				q.offer("남현수");
				q.offer("서재웅");
				System.out.println(q.offer("이정인")); // boolean offer() 추가되면 true
				
				System.out.println(q.poll()); // 먼저들어간 김예지
				
				while (!q.isEmpty()) {
					System.out.println(q.poll());
				} //  while
				
				
				
				
				
				
	} // main

} // class
