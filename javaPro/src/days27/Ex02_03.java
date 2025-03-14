package days27;

import java.util.function.Function;

/**
 * @author msg
 * @date 2025. 3. 12. - 오전 10:05:30
 * @subject 함수형 인터페이스 타입을 매개변수, 리턴타입
 * @content
 */
public class Ex02_03 {
	//1.				함수형인터페이스를 매개변수로 사용한 경우
	static void execute(MyFunction f) {
		f.run();
	}
	
	// 2. 리턴값으로 사용한 경우
	static MyFunction getMyFunction() {
		
//		MyFunction f = () -> System.out.println("f1.run()...");
//		return f;
		
		
		return () -> System.out.println("f1.run()..."); // 리턴값으로 람다식
	}

	public static void main(String[] args) {
		MyFunction f1 = () -> System.out.println("f1.run()...");
		execute(f1);
		// 람다식을 매개변수로 사용
		execute(() -> System.out.println("f1.run()...")); // 람다식을 매개변수로 사용
		
		// 2.
		MyFunction f = getMyFunction();
		f.run();

	} // main

} // class

@FunctionalInterface
interface MyFunction{
	void run();
}
