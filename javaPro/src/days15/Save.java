package days15;

// 저축과 관련된 클래스
public class Save {

	// 필드
	private String name; // 예금주
	private int money; // 예금액
	private double rate = 0.04; // 이자율
	
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

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}
	
	
} // class
