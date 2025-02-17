package days02;

/**
 * @author msg
 * @date 2025. 2. 4. - 오후 2:26:02
 * @subject
 * @content
 */
public class Ex05_02 {

	public static void main(String[] args) {
		
		// 기본형 - 논리형(boolean)
		boolean gender ; 
		//   [ ] 1바이트  true/false 저장
		//   gender
		
		//Type mismatch: cannot convert from int to boolean
		// gender = 100;
		
		gender = true;
		
		System.out.println(gender);
		// 출력형식 : 성별은 true이다.
		System.out.println("성별은 "+gender+"이다.");
		System.out.printf("성별은 "+ gender +"이다.", gender);
		System.out.printf("성별은 %b(%1$B)(%1$s)이다.", gender);//boolean string으로 리턴
	}//main

}// class
