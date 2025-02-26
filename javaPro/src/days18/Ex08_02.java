package days18;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author msg
 * @date 2025. 2. 26. - 오후 2:48:47
 * @subject 예외처리 2번째 방법 		: throw[s]문 설명
 * @content	예외를 강제로 발생시키는 문 : throw문 설명
 * 			사용자 정의 예외 객체 강제 발생
 */
public class Ex08_02 {

	public static void main(String[] args) /*throws IOException*/ {//main함수에게 떠넘김 예외처리 안하겠다
		
		//System.in.read(); 이해

		// 국어점수를 입력받아서 수~가 출력.
		int kor = 0;
		try { // 일 하는 사람에게 물어봐라
			kor = getScore();
		System.out.println("kor="+kor);
		} catch (ScoreOutofBoundException e) {
			System.out.println(e.getERROR_CODE()+"\n"+e.getMessage()); 
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		
		
		System.out.println("end");
		
	} // main

	private static int getScore() throws ScoreOutofBoundException/*, 예외나열*/ { // 일 시킨 사람에게 물어봐라. 예외처리 여기서 x
		Scanner scanner = new Scanner(System.in);
		int score = 0;
		
		System.out.print("> 점수입력?");
		String input = scanner.next();// "90"
		
		//0~100유효성 검사
		String regex = "^(100|[1-9]?\\d)$";
		
		if (input.matches(regex)) {
			score = Integer.parseInt(input);
		} else {
			// 강제 예외 발생시키겠다. : throw문 사용
			//throw 발생시키고자하는 예외객체 
			//throw new IOException("점수범위 0~100");		  // 오류O checked
			//throw new ArithmeticException("점수범위 0~100"); // 오류x unchecked
			throw new ScoreOutofBoundException("점수범위 0~100");
		}
		
		return score;
	}

} // class

//class ScoreOutofBoundException extends RuntimeException{//unchecked
class ScoreOutofBoundException extends Exception{//checked
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1361386386864749666L; // 시간바탕으로 고유한 값
	
	// 예외 코드 번호
	private final int ERROR_CODE;
	
	//getter - 에러코드번호 만들어짐, 상수임.
	public int getERROR_CODE() {
		return ERROR_CODE;
	}
	
	
	public ScoreOutofBoundException(int error_code, String message) {
		super(message);
		this.ERROR_CODE = error_code;
	}


	public ScoreOutofBoundException(String message) {
		this(1001, message);
	}
	
}
