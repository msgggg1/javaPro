package days14;

/**
 * @author msg
 * @date 2025. 2. 20. - 오후 2:33:17
 * @subject
 * @content
 */

public class Ex06 {

	public static void main(String[] args) {
		// 지역변수 선언 형식 : 지역변수에는 접근지정자 붙이지x
		// 자료형 변수명[=초기화]
		// final 자료형 상수명 = 초기화;

		// 지역변수는 접근지정자를 붙일 수 없다. 
		// public String name (x)
		
		// 객체 선언    객체 생성
		   Tv t1  =  new Tv();
		   t1.power();
		   
		   t1.channelUp();
		   System.out.println(t1.channel);
		   t1.power();
		   System.out.println("end");
	} // main

} // class

// The public type Tv must be defined in its own file
// Ex06.java 파일 생성하면 자바 파일 안에는 반드시 1개의 public 선언된 클래스(자바파일명)가 있어야 한다. 
// / 나머지는 접근지정자 public 올 수 없음. public은 하나만 가능. 
//public class Tv{
class Tv{	// 각각 컴파일 되어서 bin폴더에 Ex06.class, Tv.class 클래스 당 하나의 클래스파일 생성됨
	
	
	//필드 선언 형식
	//[접] [기] 자료형 필드명[=초기값];
//					변수명
						public String color;
	/*default(package)*/ boolean power = false;
						public int channel = 11;
	//메서드
	public void power() {
		power = !power;
	}//필드, 메서드명 같게 줄수는 있음. 
	
	public void channelUp() {
		channel ++;
	}
	public void channelDown() {
		channel --;
	}
	
	
} // Tv class











