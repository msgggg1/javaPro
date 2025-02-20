package days14;

//class Person { // package 선택 -> 접제 안붙음. 없으면package // 같은 패키지 내부에서만 사용가능

public class Person {	// public -> 패키지 내부/외부 어디서든 사용 가능
	// field
	public String name;
	public int age;
	
	//메서드
	public void work() {
		System.out.println(name + "이/가 일한다.");
	}
	public void run() {
		System.out.println(name + "이/가 달린다.");
	}
	 
	/**[is not visible] 
	 * 접근지정자의 접근 범위 문제 
	 * 
	 * **/

}
