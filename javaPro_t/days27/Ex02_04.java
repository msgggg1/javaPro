package days27;

/**
 * @author kenik
 * @date 2025. 3. 12. - 오전 10:17:04
 * @subject  람다식의 타입을 함수형 인터페이스 타입으로 형변환하는 예제.
 * @content
 */
public class Ex02_04 {

	public static void main(String[] args) {
		//                          익명객체
		MyFunction f = (MyFunction)(()->{}); // 1차적 함인 변환
		
		Object obj = (Object)((MyFunction)(()->{}));
		
		String str = ((Object)((MyFunction)(()->{}))).toString();
		
		System.out.println(f);
		System.out.println(obj);
		System.out.println(str);

	}

}

/*
@FunctionalInterface
interface MyFunction{
	void run();
}
*/

  