package days04;

import java.util.Scanner;

/**
 * @author msg
 * @date 2025. 2. 6. - 오후 12:45:25
 * @subject
 * @content
 */
public class Ex04_04 {

	public static void main(String[] args) {
		// 이름(String), 나이(byte), 키(double), 성별(boolean) 입력받아서 출력.
	    // (출력형식)
	    // > 이름:홍길동, 나이:20살, 키:178.89, 성별:남자/여자
		
		/*String name;
		byte age;
		double height;
		String gender;
		
		Scanner sc = new Scanner(System.in);
		
	    System.out.print("> 이름 나이 키 성별 입력?");
	    name = sc.next();
	    age = sc.nextByte();
	    height = sc.nextDouble();
	    gender = sc.next();
	    
	    System.out.printf("> 이름:%s, 나이:%d살, 키:%.2f, 성별:%s", name, age, height, gender);
	    
		*/
		
		/*String name;
		byte age;
		double height;
		boolean gender;
		
		Scanner sc = new Scanner(System.in);
		
	    System.out.print("> 이름 나이 키 성별 입력?");
	    name = sc.next();
	    age = sc.nextByte();
	    height = sc.nextDouble();
	    gender = sc.nextBoolean();
	    
	    String genderStr = gender ? "남자" : "여자";
	    
	    System.out.printf("> 이름:%s, 나이:%d살, 키:%.2f, 성별:%s", name, age, height, genderStr);
	    */
		
		String name;
		byte age;
		double height;
		boolean gender;
		
		
		//클래스   식별자(내가 준 이름)
		Scanner scanner = new Scanner(System.in);
		
		// 홍길동 20 178.89 true
		System.out.print("> 이름 나이 키 성별 입력 ? ");
		name = scanner.next();
		age = scanner.nextByte();
		height = scanner.nextDouble();
		gender = scanner.nextBoolean();
		
		System.out.printf("> 이름:%s, 나이:%d살, 키:%.2f, 성별:%s\n", name, age, height, gender?"남자":"여자");
		
		//s.useDelimiter(",fish,");
		
		// [체크] 홍길동, 20, 178.89, true   Scanner의 구분자를 콤마(,) 설정 방법
	} //main

} // class
