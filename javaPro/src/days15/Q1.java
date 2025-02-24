package days15;

import days14.Tv;

public class Q1 {
	
	
//	 * 1. 정의 : 클래스 자기 자신의 주소값 갖는 참조변수
//	 * 
//	 *  MyPoint p1 = new MyPoint(10,20);
//	 *  MyPoint p2 = new MyPoint(10,20);
//	 *  Heap                       call Stack( main )
//	 *  인스턴스                    객체
//	 *  [10][20][0x100]                [0x100] 
//	 *   x y     this                  p1
//	 *  0x100
//	 *  
//	 *  p1.x
//	 *  this.x
//	 *  
//	 *  인스턴스                    객체
//	 *  [10][20][0x200]                [0x200] 
//	 *   x y     this                  p2
//	 *  0x200 
//	 *  this.x
	
//	days15 Ex07
//	Tv t3 = t1; // 주소값만 가져간다는 뜻 => 객체 복사 = 클래스 복사 / 인스턴스가 같은 값을 참조할때
	

	public static void main(String[] args) {
	
		new Calc2().btnExec.btnExec_click();
		
	} // main 

} // class

class Calc2 {
	
	Button2 btnExec = null;

	public Calc2() {
		init();
	}
	
	private void init() {
		this.btnExec = new Button2("[ = ]", this);
		
	}

	public void execDisp(String result) {
		System.out.println(result);
	}
	
} /// Calc2
