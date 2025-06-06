package days17;

/**
 * @author msg
 * @date 2025. 2. 25. - 오후 3:40:47
 * @subject
 * @content
 */
public class Ex12 {

	public static void main(String[] args) {
		// has - a 관계 (소속 관계)
		// days16.Car.java
		// days16.Engine.java
		
		// [Engine 클래스 -> 인터페이스 변경]
		// K사 엔진 생산
		// H사 엔진 생산
		// 10년 후 
		// X사 엔진 생산
		
		Car car1 = new Car(new K_Engine());
		car1.setEngine(new X_Engine());
		
		Car car20000 = new Car(new K_Engine());
		
		Car myCar1 = new Car(new H_Engine());
		Car myCar30000 = new Car(new H_Engine());
		
		Car c = new Car(new X_Engine());
	} // main

} // class
