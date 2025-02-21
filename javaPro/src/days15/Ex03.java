package days15;

/**
 * @author msg
 * @date 2025. 2. 21. - 오전 11:11:58
 * @subject
 * @content
 * 			1. 기본형 매개변수와 참조형 매개변수
 * 			2. 기본형 리턴자료형과 참조형 리턴자료형
 * 
 * 			MyPoint 클래스 선언 : 좌표를 관리하기 위한 필드, 메서드를 가진 클래스 
 */

public class Ex03 {

	public static void main(String[] args) {
		
		MyPoint p1 = new MyPoint();
		p1.x = 10;
		p1.y = 20;
		
		//   새로운 참조 변수 생성// disp
		p1
			.offsetPoint(100)
			.dispMyPoint(); // 체이닝: 메소드 여러번연달아 호출
		
//		p1.plusPointX(100).dispMyPoint();
//		   int  .  dispMyPoint    ---> x
		
		
//		MyPoint p1 = new MyPoint();
//		//객체명.필드
//		//객체명.메서드()
//		p1.dispMyPoint();
//		
//		MyPoint p2 = new MyPoint();
//		p2.x = 10;
//		p2.y = 20;
//		p2.dispMyPoint();
//		
//		// x,y 좌표값 모두 내가 준 값 만큼 이동.
//		p1.offsetPoint(100);
//		p1.dispMyPoint();
//		
//		p1.offsetPoint(p2);
//		p1.dispMyPoint();
//		
//		// x좌표만 이동 w
////		p1.offsetPoint(10); // 오버로딩 안됨.
//		int x = p1.plusPointX(10); // 기본형 리턴자료형
//		System.out.println(x);
//		
//		// 클래스 복사
//		MyPoint p3 = p1.offsetPoint(5);
//		p3.dispMyPoint();
//		p1.dispMyPoint();
		
	} // main	

} // class
