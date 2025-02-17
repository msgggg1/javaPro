package days08;

/**
 * @author msg
 * @date 2025. 2. 12. - 오후 5:27:41
 * @subject 재귀 [호출] 함수? 함수 안에서 자기 자신을 다시 호출하는 함수.
 * @content
 */
public class Ex11 {

	public static void main(String[] args) {

		disp();
		
	}// main
	
	
	// 재귀 함수 : 함수안에 자기 자신 호출하는 코딩이 어디든간에 있음.
	private static void disp() {
		System.out.println("disp() 호출됨");
		disp(); // 자기 자신 함수 호출 부분
		
	}

} // class
