package days21;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 * @author msg
 * @date 2025. 3. 4. - 오후 2:00:59
 * @subject
 * @content
 */
public class Ex05 {

	public static void main(String[] args) {
		// LocalDate
		// LocalTime
		
		// 날짜 + 시간
//		LocalDateTime dt = LocalDateTime.now();//now, of로 객체 생성
//		System.out.println(dt); // 2025-03-04T14:02:12.701045800
		
		LocalDate d = LocalDate.now();
		LocalTime t = LocalTime.now();
		LocalDateTime dt = LocalDateTime.of(d, t);
		System.out.println(dt); // 2025-03-04T14:03:31.122515500

//		d = dt.toLocalDate();
//		System.out.println(d);
		
		t = dt.toLocalTime();
		System.out.println(t);
		
		dt = d.atTime(t);
		System.out.println(dt);
		
		dt = dt.truncatedTo(ChronoUnit.DAYS);
		System.out.println(dt);

	} // main

} // class
