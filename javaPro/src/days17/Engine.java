package days17;

// 엔진 인터페이스
public interface Engine {

	//상수만 가질 수 있음
	
	// 추상메서드밖에 없음
	
	// 모두가 추상 메서드
	public abstract void moreFuel(int fuel); 
	void lessFuel(int fuel);
	void stop(); 
	
	
}
