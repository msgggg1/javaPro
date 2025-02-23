package days15;

import java.util.Scanner;

/**
 * @author msg
 * @date 2025. 2. 21. - 오후 2:01:04
 * @subject [private로 필드 선언한 후 필드에 접근하는 방법]
 * @content	 ㄴ getter, setter
 * 
 * 			Person 클래스 새로 선언
 * 			Private int age;
 * 			p1.age = 20; X
 * 
 * 			getter
 * 			setter
 * 			p1.setAge(20); O
 * 			1) 값 가공해서 받기
 * 			2) 읽기전용, 쓰기전용 만들때
 * 
 */

public class Ex05 {

	public static void main(String[] args) {

		Person p1 = new Person(true);
		// The field Person.name [is not visible] -> 접지때문(private) -> 해당 클래스 내에서만 참조 가능
		// 해결 : private -> package : 같은 패키지 내부에서만 참조 가능
		p1.name = "홍길동";
		p1.setAge(20); // <- p1.age = 20;
		System.out.println( p1.getAge() ); // 20

		// 나이를 키보드로부터 얻어와서 입력
		Scanner scanner = new Scanner(System.in);
		System.out.print("나이 입력?");
		int age = scanner.nextInt()	; // 0<=  <= 120

		//		if (age >=0 && age <=120) { 매번확인해야함 -> getter, setter로 유효한 값만을 불러올 수 있음
		//			
		//		} else {
		//					// 에러 메세지
		//		} //else

		//private로 막고 읽기전용 - getter만, 쓰기전용-setter만

		// getter -> 생성자 통해서 초기화





	} // main

} // class
