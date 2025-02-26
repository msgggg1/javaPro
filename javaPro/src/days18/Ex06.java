package days18;

/**
 * @author msg
 * @date 2025. 2. 26. - 오후 2:30:05
 * @subject
 * @content
 */
public class Ex06 {

	public static void main(String[] args) {
		// [try~catch 블럭 실행 과정 이해]
		System.out.println("1 - DB open");
		try {
			System.out.println("2");
			System.out.println(100/10); // 0 예외발생
			System.out.println("3");
		} catch (ArithmeticException e) { // 여러개 catch 블럭 -> 하나만 걸림 / 예외x -> catch 실행 x
			System.out.println("4");
		} catch (Exception e) {
			 System.out.println("5");
		} finally { // 제일끝에. 없어도 됨 // 이 블럭은 try{} 블럭에서 예외 발생유무에 상관없이 실행할 코딩을 하는 블럭
			System.out.println("6 - DB close"); // 예외발생유무와 상관없이 닫아야함. 	
		}
		System.out.println("7");
		System.out.println("end");

	} // main

} // class
