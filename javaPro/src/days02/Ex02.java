package days02;

/**
 * @author msg
 * @date 2025. 2. 4. - 오전 10:37:58
 * @subject
 * @content
 */
public class Ex02 {
	public static void main(String[] args) { //->영역, 범위 나타내는 연산자{}
		//ctrl + shift +L : 이클립스 모든 단축키 목록
		String name = null;//(String 기본값) ; //{}안에서만 사용가능
		name = "홍길동";
		name = "김민선";
		//error: The local variable name may not have been initialized
		//            지역 변수                                초기화(처음 값을 할당하는 작업)
		// 지역변수 반드시 초기화해야 사용 가능
				System.out.println(name);
		//제일 마지막에 할당된 값 출력
	}

}
