package days02;

/**
 * @author msg
 * @date 2025. 2. 4. - 오후 12:38:05
 * @subject
 * @content system.out.println() 출력 + 개행O
 * 			system.out.print() 출력 + 개행X
 * 			system.out.printf()
 */
public class Ex04 {

	public static void main(String[] args) {
		System.out.println("이창익");
		System.out.println("변상호");
		System.out.println("김예지");
		System.out.println("-".repeat(50));
		System.out.print("이창익\n");
		System.out.print("변상호"+'\n');
		System.out.print("김예지");
		System.out.println();//개행 용도
		System.out.println("-".repeat(50));

	} //main

} //class
