package days20;

import java.util.Calendar;

/**
 * @author msg
 * @date 2025. 2. 28. - 오후 2:19:36
 * @subject
 * @content
 */
public class Ex07 {

	public static void main(String[] args) {
		// jdk 1.1 Calendar 클래스
		// 추상클래스 -> new 연산자로 객체 생성X
		//Calendar c = new Calendar();
		Calendar c = Calendar.getInstance();
		//System.out.println(c);
		System.out.println(c.get(1));// year
		System.out.println(c.get(Calendar.YEAR));// year
		System.out.println( c.get( Calendar.MONTH ) + 1 ); // month
		System.out.println( c.get( Calendar.DATE ) ); // date
		System.out.println( c.get( Calendar.DAY_OF_MONTH ) ); // date
		//
		System.out.println(c.get(Calendar.DAY_OF_YEAR));//date
		
		// 시간, 분, 초 , 밀리초
		System.out.println( c.get( Calendar.HOUR) );
		System.out.println(c.get(Calendar.HOUR_OF_DAY));
		System.out.println(c.get(Calendar.MINUTE));
		System.out.println(c.get(Calendar.SECOND));
		System.out.println(c.get(Calendar.MILLISECOND));
		// Date와 차이 
		// Date 	일0	토(6)
		// Calendar 일1	토(7)
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
	
	
	} // main
	
	public static String getCalendar(Calendar c) {
		return String.format("%d.%02d.%02d"
				,c.get(Calendar.YEAR), c.get(Calendar.MONTH)+1, c.get(Calendar.DAY_OF_MONTH));
	}

} // class
