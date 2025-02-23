package days15;

public class MyPoint {
	
	
	// 필드
	// 초기화 하지 않으면 자료형의 기본값으로 초기화되어져있음
	public int x;
	public int y;
	
	// 생성자 선언  ---- 매개변수 없는 생성자 = 디폴트 생성자 / 컴파일러가 알아서 자동추가함 
	public MyPoint() {
		System.out.println("> MyPoint 디폴트 생성자 호출됨");
	}
	
	public MyPoint(int x, int y) { // 오버로딩 가능
		// 100% 필드 초기화 코딩 들어가야함. 
		this.x = x;
		this.y= y;
	}

	// 메서드
	// p1.plusMyPoint(                 p2 );
	public MyPoint plusMyPoint(MyPoint p) {// 클래스 복사
		this.x += p.x;
		this.y += p.y;
		return this; // [this 3 용도]
	}
	
	
	
	// p1.dispMyPoint();
	// p2.dispMyPoint();	
	public void dispMyPoint() {
		System.out.printf("> x=%d, y=%d\n", this.x, this.y);// 호출한 객체.x , 호출한 객체.y 이용
	}

	// p2.offsetPoint(100)
//	public void offsetPoint(int d) { // int 기본형 매개변수
//		x += d;
//		y += d;
//		
//	}
//타입, 개수 달라야 중복선언가능/ 리턴값은 상관없음
	//Duplicate method offsetPoint(int) in type MyPoint
	public MyPoint offsetPoint(int d) { // 참조형 리턴자료형
	
		MyPoint p = new MyPoint(); // 새로운 객체 만들어서 돌림 --> 클래스 복사
		p.x = x + d;  
		p.y = y + d;
		
		return p;
	}

	// p1.offsetPoint(p2);
	// p1.x = p1.x + p2.x
	// p1.y = p1.y + p2.y	 //클래스 복사
	public void offsetPoint(MyPoint p) {//class 참조형 매개변수 , 클래스 복사 
		x += p.x;
		y += p.y;
		
	}

	// p1.plusPointX(10)
	public int plusPointX(int d) { // 기본형 리턴자료형
		return x + d;
	}
	
	
} // class
