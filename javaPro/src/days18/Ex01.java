package days18;

/**
 * @author msg
 * @date 2025. 2. 26. - 오전 9:21:14
 * @subject
 * @content
 */
public class Ex01 {

	public static void main(String[] args) {
		
		// new AbstractSample();

	} // main

} // class

// 추상메소드 없음 -> 추상 클래스 선언 가능
// 의도: 바로 객체 생성하지 말라는 뜻
abstract class AbstractSample{ // 추상메소드 없어도 추상클래스 만들 수 있음.
	String name;
	int age;
	
	void disp(){
		
	}
}

class B extends AbstractSample{ // B부터는 객체생성 가능
	
}