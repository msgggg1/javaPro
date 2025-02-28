package days19;

import days20.Parent;

// 다른 패키지, 외부 - days20. Parent, Child
public class Child extends Parent {
	
	//부모 물려받음
	void modifierAccessTest() {
		this.pub = 100; // public -> 패키지 내/외부 어디서든 접근 가능
		this.pro = 90; // default + 상속 접근 가능
		//this.def = 80; // 같은 패키지 내부 접근 가능 -> 접근 못 함
		
		//this.priX private -> Parent 클래스 내부에서만 접근가능
	}
	

}
