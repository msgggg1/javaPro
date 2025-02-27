package days19;

import java.util.Objects;
import java.util.Random;

/**
 * @author msg
 * @date 2025. 2. 27. - 오후 5:08:09
 * @subject
 * @content
 */
public class Ex09 {

	public static void main(String[] args) {
		// java.util.Arrays 클래스
		// java.util.Random 클래스
		
		/*
		Random rnd = new Random();
		System.out.println(rnd.nextBoolean());
		System.out.println(rnd.nextInt()); //-21 ~ 21억
		System.out.println(rnd.nextInt(10)); // -10~10
		System.out.println(rnd.nextDouble());
		*/
		
		//java.util.Objects 클래스
		//  ㄴ Object의 보조 클래스
		// 	ㄴ 모든 멤버가 static -> 바로사용할 수 있음
		Point p = null;
		if (p != null) {
			//
		} // if
		//완전히 같은 코딩
		if (!Objects.isNull(p)) {
			
		} // if
		//완전히 같은 코딩
		if (Objects.nonNull(p)) {
			
		} // if
		
	///////////////////////////////////
		Point p2 = null;
		if (p != null && p.equals(p2)) {
			
		} // if
		//완전히 같은 코딩
		if (Objects.equals(p, p2)) {
			
		} // if
		
//		System.out.println(p.toString()); //예외 발생
		System.out.println(Objects.toString(p2, "NULL"));
		
	} // main

} // class
