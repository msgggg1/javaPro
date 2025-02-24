package days16;


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
	// has-a 관계 : Car + Engine
	//private Engine engine = new Engine(); // 명시적 초기화 X d/t 결합력이 높음. (엔진고장나면 폐차) 미리 붙여놓고 출발, 나중에 장착
	private Engine engine = null;
	
	
	// getter, setter
	
	
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	//생성자
	Car(){
		this.engine = new Engine(); // 생성자 초기화 , 결합력 높음 -> X
	}
	Car(Engine engine){
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
