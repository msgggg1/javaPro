package days18;

/**
 * @author msg
 * @date 2025. 2. 26. - 오전 10:32:09
 * @subject
 * @content
 */
public class Ex03_03 { // 외부클래스
	
	class InstanceInner{} //1.
	static class StaticInner{} //2.

	// 외부의 인스턴스 멤버 간에 서로 직접 접근 가능하다. 
	InstanceInner ii = new InstanceInner();
	// 외부의 static 필드 선언
	static StaticInner si = new StaticInner();
	
	//인스턴스 메서드
	void method01() {
		class LocalInner{} //3.로컬클래스 -> 메소드 안에서만 사용. 바깥에서 접근 못, 필요도 없음.
		
		LocalInner li = new LocalInner();
		
		//인스턴스 메소드 안에서 1.2.사용 - 밖에 있는 innerclass 사용 가능
		InstanceInner ii = new InstanceInner();
		StaticInner si = new StaticInner();
		
	}
	
	// static 메서드
	static void method02() {
		
	}
	
	public static void main(String[] args) {
		// LocalInner li = new LocalInner(); 사용불가. 애초에 목적이 해당함수내에서만 사용
		// No enclosing instance of type Ex03_03 is accessible. Must qualify the allocation with an enclosing instance of type Ex03_03 (e.g. x.new A() where x is an instance of Ex03_03).
//		InstanceInner ii = new InstanceInner(); 외부객체가 생성이 되어야 사용가능
		StaticInner si = new StaticInner(); //O
		// 인스턴스 클래스를 static 메서드에서 사용하려면 외부 클래스 객체를 생성 후 사용 가능하다
		Ex03_03 outer = new Ex03_03();
		InstanceInner ii = outer.new InstanceInner();

		
		// 클래스파일 무조건 따로 생성됨
	} // main

} // class
