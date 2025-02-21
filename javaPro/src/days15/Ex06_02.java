package days15;

/**
 * @author msg
 * @date 2025. 2. 21. - 오후 3:34:17
 * @subject
 * @content3) 단독(홀로) 사용될 때의 this 용도
		  		- 매개변수 : ex06_02.java
 */

public class Ex06_02 {

	public static void main(String[] args) {
	
		new Calc().btnExec.btnExec_click();

	} // main

} // class

// 계산기
class Calc{
	
	Button btnExec = null;
	
	// 디폴트 생성자
	public Calc() {
		init(); // 계산기 초기화하는 메서드 호출
	} // Calc

	private void init() {
		// this [1용도]                     [3-1용도]
		this.btnExec = new Button("[ = ]", this);
	
	}
	
	public void execDisp(String result) {
	      System.out.printf("[화면결과 출력] %s\n", result);
	   }

	
} // calc

// 버튼
class Button{

	String text; // [ = ]
	
	Calc calc;
	
	public Button() {
		
	}


	public Button(String text) {
		// this [1용도]
		this.text = text;
	}

	public Button(String text, Calc calc) { // calc 지역변수임
		this(text);
		this.calc = calc;
	}


	// 실제 계산기 계산버튼 클릭 -> 클릭 이벤트 발생 -> btnExec_click 메서드 호출
	public void btnExec_click() {
		//계산기 접근할 수 있어야 된다.  = 버튼 전에 뭘 눌렀는지 파악, 화면에 출력 -> 계산기 객체 알아야함. 떠있는계산기 찾아와야
		
		String result = "3 + 5 = 8";
	    this.calc.execDisp(result);

	}
	
}


