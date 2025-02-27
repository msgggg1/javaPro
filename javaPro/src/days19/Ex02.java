package days19;

/**
 * @author msg
 * @date 2025. 2. 27. - 오전 9:31:25
 * @subject
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
		// Object의 메소드
		// 1. hashCode()
		// 2. getClass()
		// 3. toString()	오버라이딩
		// 4. equals()		오버라이딩
		Point p1 = new Point(1,2);
		Point p2 = new Point(1,2);
		
		System.out.println(p1==p2);
		System.out.println(p1.equals(p2));
		
		// [5. clone()]
		//Type mismatch: cannot convert from Object to Point
		try {
			Point p3 = (Point) p1.clone();
			System.out.println(p3);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	} // main

} // class


class Point extends Object implements Cloneable{ // repairable
	int x;
	int y;
	
	public Point() {}
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	//  p1.equals(p2)
	public boolean equals(Point obj) {
		if (obj != null && obj instanceof Point) {
//			Point p = (Point)obj; // 다운캐스팅
			Point p = obj;
			return this.x == p.x && this.y == p.y;
		} // if
		return false;
	}
	
	@Override
	/*
									//checked
	protected Object clone() throws CloneNotSupportedException {
		// 오버라이딩 부모 리턴자료형 그대로 넘어와야함
		Object obj = null;
		obj = super.clone();
		
		
		return obj;
	}
	*/
	
	// jdk 1.5부터 '공변 반환 타입' 추가 
	// 오버라이딩 주의할 점 - 부모의 리턴자료형, 매개변수, 예외 등
	// 공변 반환 타입: 부모리턴자료형 -> 자식리턴자료형 변경
	protected Point clone() throws CloneNotSupportedException {
		// 오버라이딩 부모 리턴자료형 그대로 넘어와야함
		Point obj = null;
		obj = (Point) super.clone();

		return obj;
	}
	
	@Override
	public String toString() {
		return String.format("(x=%d,y=%d)", this.x, this.y);
	}
	
	
	
	
	
}