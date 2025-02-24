package days16;

/**
 * @author msg
 * @date 2025. 2. 24. - 오후 2:18:30
 * @subject
 * @content
 */

// Point2D 기존 클래스를 재사용해서 새로운 point3D클래스 선언
//  = 상속
public class Point3D extends Point2D{
	
	// 필드
	//물려받은 x,y 삭제 
	private int z;
	
	// 생성자
	public Point3D() {
		System.out.println("> Point3D 디폴트 생성자 호출");
	}

	public Point3D(int a) {
//		super(a,a); = 매개변수 2개짜리
		super(a); // 모든 라인의 제일 위에 와야함(문법) 
//		The field Point2D.x [is not visible] 접근지정자X // 물려받았으나 private -> 접근 못 
		//this.x = a;
//		this.setX(a);
//		this.setY(a);
		this.z = a;
		System.out.println("> Point3D 1 생성자 호출");
	}


	public Point3D(int x, int y, int z) {
		super(x,y);
		this.z = z;
		System.out.println("> Point3D 2 생성자 호출");
	}
	
	public Point3D(Point2D p, int z) {
		this.setX(p.getX());
		this.setY(p.getY());
		this.z = z;
		
	}
	
	//메서드
	//get, set - 물려받은것 삭제
//		public int getX() {
//			return x;
//		}
//		public void setX(int x) {
//			this.x = x;
//		}
//		public int getY() {
//			return y;
//		}
//		public void setY(int y) {
//			this.y = y;
//		}
		
		public int getZ() {
			return z;
		}
		
		public void setZ(int z) {
			this.z = z;
		}
		
		// 메소드
		public void dispPoint3D() {
			System.out.printf("x=%d, y=%d, z=%d\n", this.getX(), this.getY(), this.z);
		}
		
		public Point3D offsetPoint(int i) {
//			x += i;
//			y += i;
			this.setX(this.getX()+i);
			this.setY(this.getY()+i);
			z += i;
			return this ; // this의 세번째 용도 / 참조현 반환자료형
		}
		
		public void offsetPoint(Point3D p) { // 참조형 매개변수
			this.setX(this.getX()+p.getX());
			this.setY(this.getY()+p.getY());			
				
			z += p.z;
		}
		
		public Point3D plus(Point3D p) {
			int xValue = this.getX()+p.getX();
			int yValue = this.getY()+p.getY();
			int zValue = z + p.z;
			
			Point3D newp = new Point3D();
			newp.this.getX() = xValue;
			newp.this.getY() = yValue;
			newp.z = zValue;
			
			return newp;
			
		}
	
	
}//  class
