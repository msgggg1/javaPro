package days18;

import days15.Button;
import days15.Calc;

/**
 * @author msg
 * @date 2025. 2. 21. - 오후 3:34:17
 * @subject
 * @content3) 단독(홀로) 사용될 때의 this 용도
		  		- 매개변수 : ex06_02.java
 */

public class Calc_Button {

	public static void main(String[] args) {
		
		Calc calc = new Calc();
		calc.btnExec.btnExec_click();
		
	} // main
} // class


// 계산기
class Calc{

	//필드
	Button btnExec = new Button("[ = ]", this);
	
	// 인스턴스 클래스
	class Button{
		
		//필드
		String text; // [ = ]
		Calc calc;
		
		// 생성자
		public Button() {
		}
		public Button(String text) {
			this.text = text;
		}
		public Button(String text, Calc calc) { 
			this(text);
			this.calc = calc;
		}
		
		// 메소드
		public void btnExec_click() {
			String result = "3 + 5 = 8";
			calc.execDisp(result);
		}
	} // Button
		
	
	// 생성자
	public Calc() {
	}

	// 메소드
	public void execDisp(String result) {
		System.out.printf("[화면결과 출력] %s\n", result);
	}


} // calc




