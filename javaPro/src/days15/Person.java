package days15;

public class Person {

	//필드
	// private : 해당 클래스 내에서만 참조 가능.
	String name; // 이름
	private int age; // 나이
	private boolean gender; // 성별 alt + shift + S
	
	//생성자
	public Person(boolean g) { // 보통 필드, 생성자 이름 같게 줌
//		super();
//		this.gender = gender;
		gender = g;
	}

	public Person() { // 디폴트 생성자 
		// [ this 두번째 용도 ] 생성자에서 또 다른 생성자를 호출 할 때의 this// 
		// 설정된 기본값 넣어놓으려고
			this("익명사용자", 1, true); // this.name = "익명" .....
//	 		this.name = "익명";
//	 		this.age = 1;
//	 		this.gender = true;
	 		
	 		System.out.println("> Person 0 디폴트 생성자 호출됨.");
	}
	


	public Person(String name, int age, boolean gender) {
//		super();
		// 멤버를 가리킬때의 this // name = name 뭐가 뭔지 구분 못함
//		this.name = name; // 멤버변수 = 지역변수
//		this.age = age;
//		this.gender = gender;
		
		this(name, age);
		this.gender = gender;
		System.out.println("> Person 3 생성자 호출됨.");
	}

	public Person(String name, int age) { // 오버로딩
//		super();
		// 멤버를 가리킬때의 this // name = name 뭐가 뭔지 구분 못함
		this.name = name; // 멤버변수 = 지역변수
		this.age = age;
		System.out.println("> Person 2 생성자 호출됨.");
	}

	// 메소드임. 역할: private 필드의 값을 설정. 얻어올때 사용하는 메서드.
	// [ getter ] - 값 얻어옴
	public int getAge() {
		return age;
	}
	// [ setter ] - private 접근가능. 값 설정함
	public void setAge(int a) {
		if (a >=0 && a <=120) { //매번확인해야함 -> getter, setter로 유효한 값만을 불러올 수 있음
			age = a;
		} else {
			  // 강제로 예외(오류)를 발생 코딩.
			throw new RuntimeException("[경고] 0~120의 나이를 입력!!!");
		} 
	}
	
	// getGender boolean isGender
	// 읽기 전용의 필드
	public boolean isGender() {
		return gender;
	}
	
	/*
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	*/
	
	
	
	
}
