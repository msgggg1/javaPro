package days24;

public enum Direction { // 요일, 단위, 방향.. 표준화 
	// 내부 컴파일 방법 알고있어야
	// The constructor Direction(int, String) is undefined
	EAST(100, "→"), SOUTH(200, "↓"), WEST(300, "←"), NORTH(400,"↑");

	// 필드
	private final int value ; 
	private final String symbol;
	
	
	// 2 생성자 선언
	Direction(int value, String symbol) { 
		this.value = value;
		this.symbol = symbol;
	}


	public int getValue() {
		return value;
	}


	public String getSymbol() {
		return symbol;
	}
	
	//setter X 안만들어지는게 당연..? final
	
	// 메서드 선언 가능  ----class
	// 추상메서드 선언 가능 
	public String toString() { // toString 재정의 해도됨. 
		return name()+":"+this.symbol;
	}
}
