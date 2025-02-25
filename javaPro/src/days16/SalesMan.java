package days16;

// final키워드 ==> 최종클래스 (= 마지막 클래스)
//					ㄴ 자식 클래스를 가질 수 없는 클래스/부모클래스가 될 수 없음
public final class SalesMan extends Regular {

	// 필드 : name, addr, tel, hiredate, basepay
	// 메서드: dispEmpInfo(), getpay()
	// 생성자 상속x

	private int sales; // 판매량
	private int comm;  // 커미션

	//생성자
	public SalesMan() {
		super();
		System.out.println("> SalesMan 디폴트 생성자 호출됨.");
	}
	public SalesMan(String name, String addr, String tel, String hiredate, int basePay, int sales, int comm) {
		super(name, addr, tel, hiredate, basePay);		
		this.sales = sales ;
		this.comm = comm;
		System.out.println("> SalesMan 7 생성자 호출됨.");
	}
	
	@Override
	public int getPay() {
		return super.getPay() + this.sales * this.comm ;
	}
	
	@Override
	public void dispEmpInfo() {
		System.out.printf(
	            "사원명:%s, 주소:%s, 연락처:%s, 입사일자:%s, 기본급:%d"
	                  + " 판매량=%d, 커미션=%d\n"
	                  ,this.getName(), this.getAddr(), this.getTel()
	                  , this.getHiredate(), this.getBasePay()
	                  , this.sales, this.comm );
	}
}// class


//The type SalesManTwo cannot subclass the final class SalesMan - 자식 가질 수 없음/부모클래스 될 수 없음
//class SalesManTwo extends SalesMan{
//	
//}






