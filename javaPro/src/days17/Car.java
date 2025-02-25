package days17;


/**
 * @author msg
 * @date 2025. 2. 24. - 오후 12:17:02
 * @subject
 * @content
 */

//자동차 클래스
public class Car {

	//필드
	String name;
	String gearType;
	int door;
	
	// 인터페이스
	private Engine engine = null;
    
	//엔진만드는 중이여도 사용가능 -> 독립적
	
	// getter, setter
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	//생성자
	Car(){
	}
	Car(Engine engine){ // 매개변수 다형성
		this.engine = engine;
	}
	
	//메서드
	void speedUp(int fuel) {
		this.engine.moreFuel(fuel);
	}

	void speedDown(int fuel) {
		this.engine.lessFuel(fuel);
	}
	
	void stop() {
		this.engine.stop();
	}
	
	
} // class
