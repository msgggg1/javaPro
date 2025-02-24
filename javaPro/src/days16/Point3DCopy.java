package days16;

/**
 * @author msg
 * @date 2025. 2. 24. - 오후 2:18:30
 * @subject
 * @content
 */


public class Point3DCopy {
	
	// 필드
	private int x;
	private int y;
	private int z;
	
	// 생성자
	public Point3DCopy() {
		System.out.println("> Point3D 디폴트 생성자 호출");
	}

	public Point3DCopy(int a) {
		this.x = a;
		this.y = a;
		System.out.println("> Point3D 1 생성자 호출");
	}


	public Point3DCopy(int x, int y, int z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
		System.out.println("> Point3D 2 생성자 호출");
	}
	
	//메서드
	//get, set
		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}
		
		public int getZ() {
			return z;
		}
		
		public void setZ(int z) {
			this.z = z;
		}
		
		// 메소드
		public void dispPoint3D() {
			System.out.printf("x=%d, y=%d, z=%d\n", this.x, this.y, this.z);
		}
		
		public Point3DCopy offsetPoint(int i) {
			x += i;
			y += i;
			z += i;
			return this ; // this의 세번째 용도 / 참조현 반환자료형
		}
		
		public void offsetPoint(Point3DCopy p) { // 참조형 매개변수
			// 부모 생성자 인위적으로 호출x/ 일반메서드 안에서 생성자, 부모 생성자 인위적으로 호출 못함.
			// super x
			this.setX(this.getX()+p.getX());
			this.setY(this.getY()+p.getY());
//			x += p.x;
//			y += p.y;
			z += p.z;
		}
		
		public Point3DCopy plus(Point3DCopy p) {
			int xValue = this.getX() + p.getX();
			int yValue = this.getY() + p.getY();;
			int zValue = z + p.z;
			
			Point3DCopy newp = new Point3DCopy(xValue, yValue, zValue);
//			newp.x = xValue;
//			newp.y = yValue;
//			newp.z = zValue;
			
			return newp;
			
		}
	
	
}//  class
