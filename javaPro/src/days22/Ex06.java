package days22;

/**
 * @author msg
 * @date 2025. 3. 5. - 오후 12:13:17
 * @subject	C -> List -> LinkedList 컬렉션 클래스
 * @content 1. 배열의 단점
 * 				1) 배열 크기 자동(동적) 증가X
 * 				2) [][][][3][->][][][][][]
 * 						 10삽입
 * 						
 * 						 삭제
 * 				   데이터 삽입, 삭제 시 성능 떨어짐 (밀고 당기고)
 * 			2. 배열 장점
 * 				1) 읽기 성능이 가장 빠르다. 
 * 
 * 			3. 배열의 단점 2) 보완 -> LinkedList 컬렉션 클래스
 * 								  (특징)비연속적 (배열은 메모리상에 연속적으로 놓임) 잦은삭제, 삽입 예상될때
 * 				노드(Node)
 * 			다음요소의주소저장
 * 				[0X200]		[0X300]		[null]
 * 				->[0X500]
 * 				[3]			[10]  		[5]
 * 				0X100		0X200		0X300
 * 
 * 					1번째 요소
 * 					[0X300]
 * 					[100]
 * 					0X500
 * 
 * 맨뒤/맨앞 연결 : 환형 linkedlist
 * 앞의 주소도 가지고 있게: 양방향 LinkedList
 * 
 */
public class Ex06 {

	public static void main(String[] args) {
			Node node1 = new Node();
			node1.value = 10;

			Node node2 = new Node();
			node2.value = 15;
			node1.next = node2;
					
			Node node3 = new Node();
			node3.value = 17;
			node2.next = node3;
			
			Node node4 = new Node();
			node4.value = 34;
			node3.next = node4;
			node4.next = null;
			
			//[문제] 노드2와 노드3 사이에 노드5(100) 추가하는 코딩
			Node node5 = new Node();
			node5.value = 100;
			node5.next = node2.next;
			node2.next = node5;
			
			// [문제] 노드3 삭제
			node5.next = node4;

			Node node = node1;
			while (node != null) {
				System.out.println(node.value);
				node = node.next;
			} //  while
			

	} // main

} // class
	//단방향 링크드 리스트
	class Node{
		
//		Node prev= null; -> 양방향
		int value = 0;
		Node next = null;// 뒤의 노드의 주소를 저장할 참조변수
		
	}
	
