package days16;

/**
 * @author msg
 * @date 2025. 2. 24. - 오후 12:11:07
 * @subject
 * @content
 */
public class Ex06 {

	public static void main(String[] args) {
		/*
		 * [ 클래스들 간의 2가지 관계 ]
		 * 1. has-a 관계(소속 관계)
		 * 	  예) 자동차 클래스				Car
		 * 		 ㄴ  엔진(1) 클래스 		Engine
		 * 2. is-a 관계(상속 관계)
		 * 
		 * */
		
		// 생성자를 사용해서 의존성 주입(DI dependency injecter) // engine - car 의존관계에 있음. 
		Engine k_engine = new Engine();
		Car car1 = new Car();
		car1.speedUp(10);
		
		//엔진고장
		// setter를 사용해서 의존성 주입(DI)
		Engine h_engine = new Engine();
		car1.setEngine(h_engine);
		
		int speed = car1.getEngine().speed;
		System.out.println("현재 속도: " + speed);
		
		// [has-a 관계]
		//Syetem 필드 안 PrintStream out;
		//				ㄴ printf(), println(), print()
		System.out.println();
		
		
	} // main

} // class
