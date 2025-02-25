package days17;

import java.security.acl.Group;
import java.util.ArrayList;

/**
 * @author msg
 * @date 2025. 2. 25. - 오후 2:15:24
 * @subject
 * @content
 */
public class Ex10 {

	public static void main(String[] args) {
		/*
		 * [ 인터페이스(interface) ] ★★★★★
		 * 1. 자바 자료형 - 참조형: 배열, 클래스, [인터페이스]
		 * 2. 일종의 추상 클래스 이다.
		 * 		ㄴ 인터페이스 안에는 100% 추상메서드
		 * 		ㄴ 일반 메서드는 하나도 존재 하지 않음
		 * 		ㄴ 상수만 선언 가능. 그 외 필드는 선언 할 수 없다. 
		 * 3. -> 인터페이스는 그 자체만으로 사용되지 않고, 
		 * 	  다른 클래스를 작성(선언)하는 데 도움을 줄 목적의 클래스
		 * 4. 인터페이스 선언 형식
		 * 	  [접지] interface 인터페이스명 {
		 * 			}
		 * 		- 클래스의 일종이기에 인터페이스명은 대문자로 시작  
		 * 5. JDK 1.8 부터~
		 * 	1) static 메소드
		 * 	2) default 메소드
		 *  추가할 수 있다. 
		 * 6. 인터페이스 끼리도 [상속]이 가능하다. : 기존 인터페이스 이용해 새로운 인터페이스 만듦 
		 * 	interface IA{}
		 * 	interface IB extends IA{}
		 * 7. 어떤 클래스에서 인터페이스를 구현한다고 할 때
		 * 	interface IA{
		 * 		void disp();
		 * }
		 * 	interface IB extends IA{
		 * 		void test();
		 * }
		 * 
		 * class A implements IB, , {
		 * 		void disp(){
		 * 		}
		 * 		void test(){
		 * 		}
		 * }
		 * */

		//ArrayList<E>
		
	} // main

} // class

// 클래스 설계: 인터페이스 사용

//(군사) 부대, 한 사람, 단일체
class Unit{
	//[필드]
	// 유닛의 위치
	int x; 
	int y;
	
	int currentHP; // 현재 유닛의 체력
	
}

//하늘 유닛
//땅 유닛
//바다 생략
class AirUnit extends Unit{
	//필드, 메서드 구현
	
}

class GroundUnit extends Unit{
	//필드, 메서드 구현
	
}

interface Movable{
	// 상수, 추상메소드 +  JDK 1.8 default, static 메소드
	void move(int x, int y); // public abstract 생략
	
}

interface Attacable{
	void attack(Unit unit);
}

//인터페이스끼리 상속 가능, 키워드는 extends 사용. move, attack 다 구현해야함.
// 인터페이스는 다중상속이 가능하다. 
interface Fightable extends Movable, Attacable{
	
}

// 어떤 클래스가 인터페이스를 구현하면 추상메소드를 오버라이딩 해야한다. 
class Fighter implements Fightable{

	@Override
	public void move(int x, int y) {
		// 구현
		
	}

	@Override
	public void attack(Unit unit) {
		// 구현
		
	}
	
}

// 공격 유닛 - 탱크(수리가능), 해병대원, 수송선(수리가능)
// 수리유닛 - SCV(끼리 수리가능)
class Tank extends GroundUnit implements Fightable, Repairable{

	@Override
	public void move(int x, int y) {
		// 구현
		
	}

	@Override
	public void attack(Unit unit) {
		// 구현
		
	}
	
}

class Marine extends Unit implements Fightable{
	@Override
	public void move(int x, int y) {
		// 구현
		
	}

	@Override
	public void attack(Unit unit) {
		// 구현
		
	}
}

class DropShip extends AirUnit implements Fightable, Repairable{
	@Override
	public void move(int x, int y) {
		// 구현
		
	}

	@Override
	public void attack(Unit unit) {
		// 구현
		
	}
}

interface Repairable{
	// 상수, 추상메소드 x
	// 수리가능 대상 implements 해서 구분
}



class SCV extends GroundUnit implements Repairable{
	
	// 수리기능이 구현된 메서드
				//수리 대상
	void repair(Repairable target) { // 매개변수 다형성 / 인터페이스 업캐스팅 가능함. 
		//수리 코딩
		//수리방법
		if (target instanceof Unit) {
			Unit u = (Unit)target; // 다운캐스팅
		} // if
	}
	/*
	void repair(Tank tank) {
		//탱크 수리 코딩
	}
	void repair(DropShip dropShip) {
		//수송선 수리 코딩
	}
	void repair(SCV scv) {
		//SCV 수리 코딩
	}
	*/
	
}



