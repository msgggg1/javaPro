package days22;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author msg
 * @date 2025. 3. 5. - 오전 11:38:16
 * @subject C -> List 계열 -> arrayList 컬렉션 클래스
 * @content			  		 Vector 컬렉션 클래스
 * 
 * 		[ArrayList]와 Vector의 차이점
 * 				  ==
 * 					멀티스레드 안전
 * 					동기화 처리O
 * 
 * 		String 불변
 * 		StringBuilder와 StringBuffer의 차이점.
 * 		싱글스레드			멀티스레드에 안전하다.
 * 		(빠르다)				<- 동기화 처리 O
 */
public class Ex05 {

	public static void main(String[] args) {
		//
		Vector v = new Vector(); // 10, 3 
		System.out.println(v.capacity()); // 용량 10
		System.out.println(v.size());	  // 요소 개수(크기)
		
		v.addElement("최승호");// add도 상관X
		v.add("최인석");
		v.add("김민선");
		
		System.out.println(v.size()); // 요소 개수 3
		
		v.trimToSize();
		System.out.println(v.capacity()); // 용량 3
		
		v.add("홍길동");
		System.out.println(v.capacity()); // 용량 6
		System.out.println(v.size()); // 4
		
		//v.ensureCapacity(10);
		//System.out.println(v.capacity()); // 용량 6
		// 잘 안씀. 자동으로 크기 조절위해 컬렉션클래스 쓰는것
		
		// 첫번째 요소 얻어오기
		System.out.println(v.get(0));
		System.out.println( v.elementAt(0) );  
		// v.elementAt(0) 위와 같음. / 차이점: 동기화 처리
		
		// 열거자
		Enumeration en = v.elements();
		while (en.hasMoreElements()) { // [true]/false 요소를 더 가지고 있냐
			String name = (String) en.nextElement(); // 다음 요소 얻어와라
			System.out.println(name);
		}// while
		
		// 열거자/반복자의 차이점
		// 반복자: 반복적으로 요소를 처리 중에 요소가 수정, 삭제, 추가 -> 예외 발생 시킴
		// 열거자:												수정 전 그대로 읽어옴. 오류 X. (복사해서 읽음)
		
		v.remove(0); //removelement
		
		// 첫번째 요소 반환
		v.firstElement();
		v.get(0);
		v.elementAt(0);
		
		//마지막 요소
		v.lastElement();
		v.get(v.size()-1);
		
		v.trimToSize();
		
//		v.set(0, en);
		
		
	} // main

} // class
