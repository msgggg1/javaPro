package days24;

import java.util.Arrays;

/**
 * @author msg
 * @date 2025. 3. 7. - 오후 4:13:08
 * @subject [ 열거형 ]	자료형  =/=  반복자/열거자(enumeration) 
 * @content  ㄴ 서로 관련된 상수들의 집합을 나타내는 특별한 클래스 타입 (표준화 위함)
 * 			 ㄴ jdk 1.5 새로 추가
 * 			 ㄴ 정의
 * 				enum 열거형이름 {상수명, 상수명...} ->클래스로 컴파일
 * 			 ㄴ 사용방법
 * 				
 */
public class Ex09 {
	/* 중첩 클래스 의미
	enum Card { // Ex09 클래스에서만 사용 가능 
		CLOVER, HEART, DIAMOND, SPADE
	}
	*/
	public static void main(String[] args) {
		/*
		 * switch(card){
		 *  case 1: // 하트
		 *  break;
		 *  case Card.HEART: // 옛날 
		 *  break;
		 *  case 1: 
		 *  break;
		 *  case 1: 
		 *  break;
		 * 
		 * }
		 * */ 

		System.out.println(Card.CLOVER);   //static final // 상수 CLOVER
		System.out.println(Card.CLOVER.name());   //"CLOVER"
		System.out.println(Card.CLOVER.ordinal());   // 0 순서
		
		
		Card cardType = Card.valueOf("CLOVER");
		System.out.println(cardType); // 상수 CLOVER
		
		// Card 열거형의 모든 상수값을 얻어올때
		Card [] cardArr = Card.values(); // 배열로 돌려줌
		System.out.println(Arrays.toString(cardArr));
	} // main

} // class

// enum 이전
/*
class Card {
	public static final int CLOVER = 0;
	public static final int HEART = 0;
	public static final int DIAMOND = 0;
	public static final int SPACE = 0;
}
*/
/*
enum Card { // 동일 패키지 내에서만 사용 가능 (여기서는 days24)
	CLOVER, HEART, DIAMOND, SPADE
}
*/