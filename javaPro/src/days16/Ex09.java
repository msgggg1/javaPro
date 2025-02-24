package days16;

/**
 * @author msg
 * @date 2025. 2. 24. - 오후 4:06:32
 * @subject
 * @content
 */
public class Ex09 {

	public static void main(String[] args) {
		// 자식 객체를 생성하면 먼저 부모 객체가 생성된 후에 
		// 자식 객체가 생성된다. 
		// (부모의 생성자함수가 먼저 호출되고 자식의 생성자 함수가 호출된다.)
		
		// super 키워드
		// ㄴ 정의: 자식 클래스에서 부모클래스의 멤버를 참조하는 데 사용되는 참조변수
		// ㄴ 용도: 1) 부모의 멤버를 가리킬 때의 super
		//		  2) 생성자에서 또 다른 부모의 생성자를 호출할 때의 super
		//		  3) 단독으로 사용되는 super 없음.

		// 자식 객체 c를 생성
		Child c = new Child();
		
		System.out.println("end");
	} // main

} // class


// 모든 클래스의 최상위 부모클래스는 Object이다.
class Parent { // extends Object
	
	// 필드
	int x = 10;
	
	//생성자
	Parent(){
		System.out.println("> Parent 디폴트 생성자 호출됨.");
	}
	
	// 메소드
	void dispParent() {
		
	}
	
	// final + 메소드선언 -> 재정의 불가
	// 자식클래스에서 오버라이딩(재정의) 할 수 없는 메소드이다. 
	public final void test() {
		System.out.println("> Parent.test()...");
	}
}

class Child extends Parent{
	
	// int x = 10; 필드 상속
	// dispParent(){} 상속
	// test(){} 상속
	// 부모의 생성자  상속x
	
	int x = 20; // 부모에게 물려받은 똑같은 변수 선언 가능함.
	int y ; //새로 추가된 필드
	
	public Child() {
		super(); // 컴파일러가 추가. 부모의 디폴트 생성자가 호출
		System.out.println("> Child 디폴트 생성자");
	}
	
	void dispChild() {
		System.out.println(x); // child x
		System.out.println(this.x); // child x
		System.out.println(super.x); // Parent x
	}
	
	@Override
	public void dispParent() {
		System.out.println("재정의함");
	}
	
	@Override
	//Cannot override the final method from Parent
	public final void test() {
		System.out.println("> Parent.test()...");
	}
	
}