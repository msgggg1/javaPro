package days23;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author msg
 * @date 2025. 3. 6. - 오후 2:05:16
 * @subject
 * @content
 */
public class Ex05 {

	public static void main(String[] args) {
		// Set - HasgSet, LinkedHashSet
		//		[TreeSet]
		/*
		 * 1. 중복 허용 X, 순서 유지 X
		 * 2. 이진 검색 트리 (binary Search Tree)라는 자료 구조로 데이터 저장하는 컬렉션 클래스
		 * 3. 이진 검색 트리 (binary Search Tree) - 정렬, 검색, 범위 검색 높은 성능
		 * 4. LinkedList처럼 노드(Node)가 서로 연결된 구조이다. 
		 * 5. 				최상위노드 -- 루트(root)노드
		 * 
		 * 	  노드들 간의 관계  : 부모노드 - 자식노드
		 * 					   형제노드
		 * 6. 노드 구조
		 * 	  class TreeNode{
		 * 			TreeNode 왼쪽자식노드;
		 * 			int value;
		 * 			TreeNode 오른쪽자식노드;
		 * 		}
		 * 7. 이진 검색 트리 구조
		 * 		부모노드의 왼쪽에는 부모노드 값보다 작은 값의 자식노드가 배치되고 
		 * 				오른쪽에는 "    		큰 값을 가진 자식노드가 배치된다.
		 *  
		 *  
		 *  	 				[0x100][7][0x200]
		 *  
		 *  
		 *  
		 *  		[0x300][4][0x400]						[n][9][n]
		 *  	   0x100								0x200
		 *  
		 *  [n][1][n]      [n][5][0x500]
		 *  0x300			0x400
		 *  
		 *  						[n][6][n]
		 *  						0x500
		 *  
		 *  : 이진트리 정렬되어있음 -> 검색 금방함 (이진검색 생각)
		 * */

		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(7);
		ts.add(4);
		ts.add(9);
		ts.add(1);
		ts.add(5);
		ts.add(6);
		
		System.out.println(ts); // 자동정렬됨

		ts.add(5);// set -> 중복허용x
		System.out.println(ts); 
		
		System.out.println(ts.first());
		System.out.println(ts.last());
		
		//Sortedset : 정렬해서 넣어줌. 순서O,중복X
		SortedSet<Integer> ss = ts.subSet(4, 7); //4<=  < 7
		System.out.println(ss);
		
		System.out.println(ts.higher(1)); // 4, 바로 위 부모 노드
		System.out.println(ts.lower(1));  // null
		
		System.out.println(ts.floor(3));	// 1
		System.out.println(ts.ceiling(3));	// 4
		
	} // class

} // main
