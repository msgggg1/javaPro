package days17;

public interface Sample {

	// 인터페이스
	// 필드 선언 못함. 일반적인 변수 선언x, 상수만 선언 + public static final 생략
	public static final int MAX_VALUE = 100;
	/*public static final */int MIN_VALUE = 1; //public static final 생략됨
	
	//2. 모든 메소드가 추상메소드
	public abstract void test();
	int disp(int a, int b); //public static 생략됨
	
	// 3. jdk 1.8 ~ static, default 메소드를 추가할 수 있다. 
	
	
}
