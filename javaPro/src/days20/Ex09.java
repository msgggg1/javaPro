package days20;

import java.util.Calendar;
import java.util.Date;

/**
 * @author msg
 * @date 2025. 2. 28. - 오후 4:13:19
 * @subject
 * @content
 */
public class Ex09 {

	public static void main(String[] args) {
		//1. Calendar -> Date 변환
		Calendar c = Calendar.getInstance();
		//[3] ***
		Date d = c.getTime();
//		[1] Date d = new Date(0, 0, 0, 0, 0, 0)
//		Date d = new Date(c.get(Calendar.YEAR)-1900, c.get(Calendar.MONTH), c.get(Calendar.DATE));
//		[2] Date d = new Date(long time);
		
		
		//2. Calendar <- Date 변환
		c.setTime(d);
		

	} // main

} // class
