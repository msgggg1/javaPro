package days21;

/**
 * @author msg
 * @date 2025. 3. 4. - 오전 11:17:32
 * @subject
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		/*
		 * [jdk 1.8 java.time 패키지 및 하위 패키지의 
		 * 				날짜, 시간 클래스]
		 * 1. 5개의 time 패키지 + 하위 패키지 (특징 표 참고)
		 * (암기)
		 * 2. j.t 패키지의 핵심 클래스
		 * 		ㄴ 특징 : 날짜클래스 , 시간클래스 분리 // date, calendar 같이 들어가 있음.
		 * 		1) 날짜: LocalDate 클래스
		 * 		2) 시간: LocalTime 클래스
		 * 		3) 날짜 + 시간 : LocalDateTime 클래스
		 * 		4) 날짜 + 시간 + 시간대(timeZone) : ZonedDateTime 클래스
		 * 	=> 모두 Temporal, TemporalAccessor, TemporalAdjuster 인터페이스를 구현한 클래스 이다. 
		 * 
		 * 3. 날짜와 날짜 사이의 간격 : Period 클래스
		 * 	  시간과 시간 사이의 간격 : Duration 클래스
		 *  => TemporalAmount 인터페이스를 구현한 클래스이다. 
		 *  
		 * 4. 날짜, 시간 객체 생성 : new 연산자 X
		 * 		ㄴ now(), of() 로 생성
		 * 
		 * 5. 날짜, 시간의 특정 필드(ex. 년도,월,일,시간,분,초 등)을 얻어올 때
		 * 		ㄴ get(int field)
		 * 		ㄴ getXXX()
		 * 		ㄴ plus()/minus() 날짜 더하거나 빼거나
		 * 		ㄴ with()
		 * 
		 * 6. TemporalUnit 인터페이스
		 * 		ㄴ 날짜, 시간의 단위 정의해 놓은 인터페이스
		 * 		ㄴ 이 인터페이스를 구현한 클래스 : ChronoUnit클래스
		 * 		
		 * 7. TemporalField 인터페이스
		 * 		ㄴ 필드
		 * 		ㄴ 필드를 정의해 놓은 인터페이스
		 * 		ㄴ 이 인터페이스를 구현한 클래스 : ChronoField 클래스
		 * 
		 * */

	} // main

} // class
