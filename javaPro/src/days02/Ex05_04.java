package days02;

public class Ex05_04 {

	public static void main(String[] args) {
		// byte(1), short(2), int(4), long(8)
		// [문제] 나이를 저장할 변수를 선언하세요. 
		//		자료형 : 숫자/정수
		// int age = 20;
		// 자바 무조건 반은 음수, 반은 양수
		// b(1)[][][][][][][][] -128~127 정수 (중간에 0)
		// s(2)[][][][][][][][] [][][][][][][][]-27678~27677 정수
		// i(4)[][][][][][][][] [][][][][][][][] [][][][][][][][] [][][][][][][][] -21억~21억
		// ㅣ(8) -900경~900경 정수
		
		byte age ;
		age =20;
		System.out.printf("age=%d\n", age);
		
		//[문제] 국어 점수를 저장할 변수 선언 95 할당.
		byte koreanScore = 95;
				System.out.printf("koreanScore=%d\n", koreanScore);
		
	}//main

}//class
