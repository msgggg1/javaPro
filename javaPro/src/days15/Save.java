package days15;

// 저축과 관련된 클래스
public class Save {

	// 필드
	// 인스턴스 변수(필드) - 제각각 인스턴스마다 다른값 가져야하는 것.
	private String name; // 예금주
	private int money; // 예금액
	
	// 클래스(static) 변수 또는 필드, 공유변수(shared), 정적(static) 변수 // 클래스 선언과 동시에 메모리에 올라감 // private이어도 static -> 메모리에는 올라가있음.
	private static double rate = 0.04; // 이자율 - // static 인스턴스 생성하지 않더라도 기억공간에 올라감. 모든 인스턴스가 공유해서 사용
	
	// 생성자
	// 디폴트 생성자
	public Save() {

	}

	// 3개 생성자
	public Save(String name, int money, double rate) {
		this.name = name;
		this.money = money;
		this.rate = rate;
	}

	// 메소드
	// 인스턴스 메소드 - 객체가 생성되야 사용가능(메모리에 올라감)
	public void printSave() {
		System.out.printf("> 예금주:%s, 예금액:%d, 이자율:%.2f\n"
	            , this.name, this.money, this.rate);
	}

	//getter,setter (메소드임)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	//인스턴스 생성 후 사용가능
	// 클래스 메서드, static, 정적 메소드
	public static double getRate() {
		return rate;
	}

	public static void setRate(double rate) {
		//Cannot use this in a static context
		//this.rate = rate; this static안에서 못 씀
//		Save.rate = rate; //클래스명.rate 
		rate = rate; // 같은 클래스라서 생략
	}
	
	
} // class
