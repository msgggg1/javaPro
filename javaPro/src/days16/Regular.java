package days16;

// 정규직 사원 클래스
public class Regular extends Employee{

	// 필드  - name, addr, tel, hiredate
	// 메소드 - dispEmpInfo
	// 생성자 상속x
	public Employee(String name, String addr, String tel, String hiredate, int basePay) {
		
		super(name, addr, tel , hiredate);
//		this.name = name;
//		this.addr = addr;
//		this.tel = tel;
//		this.hiredate = hiredate;
		
		this.basePay = basePay;
	}
	
	
	//필드
	private int basePay; // 기본급
	
	//getter/set
	public int getBasePay() {
		return basePay;
	}

	public void setBasePay(int basePay) {
		this.basePay = basePay;
	}
	
	//메소드
	//employee 클래스에는 없는 급여계산 메소드 추가 
	public int getPay() {
		return this.basePay; // 정규직은 기본급
	}

	@Override
	public void dispEmpInfo() {
		// TODO Auto-generated method stub
		super.dispEmpInfo();
		System.out.printf("급여:%,d원", this.basePay);
	}
	
}
