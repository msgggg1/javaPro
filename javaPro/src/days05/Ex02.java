package days05;

/**
 * @author msg
 * @date 2025. 2. 7. - 오전 10:03:33
 * @subject
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
		String n1 = "admin", n2 = "Admin" ;
		//대소문자 구분하지 않고 문자열 비교
		
		System.out.println(n1.equalsIgnoreCase(n2));
		
/*		n1 = n1.toUpperCase();
		n2 = n2.toUpperCase();
		
		n1 = n1.toLowerCase();
		n2 = n2.toLowerCase();
		
		System.out.println(n1);
		System.out.println(n1.equals(n2));
		*/

		
		//
		// ? :  삼항연산자 / 조건연산자
		
		//[1]풀이~
/*		System.out.println(n1.equals(n2)?"같다":"다르다");

		if (n1.equals(n2)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		*/
		
		
		
		
	}//main

} //class
