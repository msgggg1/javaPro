package days02;

/**
 * @author msg
 * @date 2025. 2. 4. - 오전 10:22:11
 * @subject 상수
 * @content
 */
public class Ex01 {
	public static void main(String[]args) {
// 문자열 String
// 실수 double
// PI 저장할 변수를 선언
	//자료형 변수명[=초기값];
	 //double PI = 3.141592;
	 // 중간에 pi=4.125 등 다른 값으로 바뀔 수 없음 -> 상수선언 -> final
	 final double PI = 3.141; //(값 한번만 할당. 상수 기억공간이 됨.)

	 //상수는 대문자로 표기, 단어사이 _언더바
	  //PI = 4.52;
	 // The final local variable PI cannot be assigned. 
	 //It must be blank and not using a compound assignment
	 final double MAX_VALUE = 100.22;
	}

}