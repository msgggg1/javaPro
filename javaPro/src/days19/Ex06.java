package days19;

import static java.lang.System.*;
import static java.lang.Math.*;
/**
 * @author msg
 * @date 2025. 2. 27. - 오후 3:38:36
 * @subject
 * @content
 */
public class Ex06 {

	public static void main(String[] args) {
		double d = 3.141592;
		//[2]
		d = Double.parseDouble(String.format("%.2f", d));
		System.out.println(d);
		
		//[1]
		// 문제 ) 소수점 3자리에서 반올림한 결과 출력
		
		d= round(d*100)/100D ; // 314/100
		System.out.println(d);
		//System.out.println(Math.round(d*(10^2)) % (10^2) + Math.round(d*(10^2))/(10^2));
		
		// Math 클래스
		
		

	} // main

} // class
