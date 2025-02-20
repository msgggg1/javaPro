package days01;

import days14.Person; // import구문 들어갔으나 // The type days14.Person [is not visible] 은닉, 캡슐화 
import days14.Time;

/**
 * @author msg
 * @date 2025. 2. 20. - 오후 2:22:29
 * @subject
 * @content
 */
public class Ex05 {

	public static void main(String[] args) {
//		[패키지 외부 클래스 접근지정자 테스트]
		// days14.Person
		// days01.Ex05 클래스 안에서 사용 가능 테스트 [ 다른 패키지]
		Person p1 = new Person();
		
		//[패키지 외부에서 멤버의 접근지정자 테스트]
		// days14.Time.java
		//days.Ex05.java
		Time t = new Time();
//		t.hour     -만 보임
	}

}
