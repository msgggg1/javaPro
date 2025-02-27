package days19;

/**
 * @author msg
 * @date 2025. 2. 27. - 오전 10:06:54
 * @subject 어떤 객체로부터 클래스 정보를 얻어오는 3가지 방법
 * @content			=	Class 객체 얻어오기 / 클래스 정보 담고있는 객체
 */
public class Ex03 {

	public static void main(String[] args) {
		Card c1 = new Card();
		System.out.println(c1);
		
		/*
		//Class 객체 첫 번째 방법 getClass
		Class cls =	c1.getClass();
		String fullName = cls.getName();
		System.out.println(fullName);
		*/
		
		/*
		// 두 번재 방법 - 모든 클래스 static 필드 : class
		Class cls = Card.class;
		//cls을 사용해서 Card 객체(인스턴스)를 생성.
		//new Card();
		try {
			Card c2 = (Card) cls.newInstance();
			System.out.println(c2);
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		*/
		
		// 세 번째 방법 - Class.forName
		String className = "days19.Card"; //패키지명.클래스이름
		try {
			Class c3 = Class.forName(className); // JDBC
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		}
		
	}// main

} // class

//final 클래스 : 최종 클래스
//final 메소드 : 재정의 할 수 없다. 
//final 필드	 : 상수
//final 지역변수: 상수
final class Card{
	
	String kind;//카드 종류
	int num; 	//카드 번호
	
	Card(){
		this("SPADE", 1);
	}
	
	//생성자
	public Card(String kind, int num) {
		this.kind = kind;
		this.num = num;
	}

	@Override
	public String toString() {
		return String.format("%s : %d", this.kind, this.num);
	}
}