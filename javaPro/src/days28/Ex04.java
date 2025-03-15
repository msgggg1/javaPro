package days28;

/**
 * @author msg
 * @date 2025. 3. 13. - 오전 10:07:44
 * @subject	[스트림의 연산]
 * @content		ㄴ 스트림이 제공하는 다양한 연산을 이용해서 복잡한 작업들을 간단히 처리하는 기능 == 함수 == 메서드
 * 				ㄴ 연산(operation) ? 스트림에 정의된 메서드 중에 데이터소스를 다루는 메서드 
 * 				   s1.distinct().limit(6).sorted().forEach()
 * 				   		중			중		중   	 최
 * 					 지연된 연산
 * 					
 * 				   1) 중간연산 : 처리X. 연산 결과 스트림 O
 * 				   2) 최종연산 : 중간연산자까지 처리 이때 일어남. 연산 결과 스트림X
 * 						Ex04_02.java
 * 				
 * map메서드 -> stream으로 변환
 * 기본형스트림 (boxing ,unboxing x)
 * 스트림<> 래퍼클래스 사용
 */
public class Ex04 {

	public static void main(String[] args) {
		//

	} // class

} // main
