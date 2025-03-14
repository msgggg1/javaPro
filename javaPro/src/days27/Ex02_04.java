package days27;

/**
 * @author msg
 * @date 2025. 3. 12. - 오전 10:17:23
 * @subject 람다식의 타입을 함수형 인터페이스 타입으로 형변환하는 예제 
 * @content
 */
public class Ex02_04 {

	public static void main(String[] args) {
									//익명객체
		MyFunction f = (MyFunction)(() -> {}); // 1차적 함수형인터페이스 변환
		
		Object obj = (Object)((MyFunction)(() -> {})); // 	Object 변환 가능
		
		String str = ((Object)((MyFunction)(() -> {}))).toString();

		//람다식 객체 -> 내부적으로 익명 객체다. 
		System.out.println(f); // days27.Ex02_04$$Lambda$23/0x0000000800087040@1e643faf
		System.out.println(obj);
		System.out.println(str);
	} // main

} // class

/*
@FunctionalInterface
interface MyFunction{
	void run();
}
*/