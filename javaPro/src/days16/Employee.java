package days16;

// 사원이라면 공통적으로 가지고 있는 멤버들을 선언한 클래스
public class Employee {

	// 필드
	private String name;	//사원명
	private String addr;	// 주소
	private String tel;
	private String hiredate;
	
	public Employee() {
		super();
		System.out.println("employee 디폴트 생성자");
	}

	//생성자
	public Employee(String name, String addr, String tel, String hiredate) {
		super();
		this.name = name;
		this.addr = addr;
		this.tel = tel;
		this.hiredate = hiredate;
	}
	
	//메소드
	public void dispEmpInfo() {
		System.out.printf("사원명");
	}

	
}
