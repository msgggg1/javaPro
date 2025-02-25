package days17;

/**
 * @author msg
 * @date 2025. 2. 25. - 오후 3:16:55
 * @subject
 * @content
 */
public class Ex11 {

	public static void main(String[] args) {
		/*
		 * [ 인터페이스 사용 장점]
		 * 1. 개발 시간 단축 / 병렬적으로 개발
		 * 2. 표준화 가능 / 같은 메서드
		 * 3. 서로 관련 없는 클래스들에게 관계를 맺어 줄 수도 있다. / Repairable
		 * 4. 독립적인 프로그래밍이 가능하다. 
		 * 
		 * */
		
		//		인터페이스 선언	CRUD 작업 // 내부코딩은 달라도 이름 같음
		//이번 프로젝트 개발 DBMS : Oracle
		//다음 프로젝트 개발  "   : MS SQL Server
		//다음 프로젝트 개발  "   : MS SQL 

		// 다형성
		// 인터페이스 참조(업캐스팅 가능)
//		IDBConn conn = new OracleDriver();
		IDBConn conn = new MySQLDriver();
		
		// 같음
		conn.open();
		
		conn.close();
		
		conn.select();
		conn.insert();
		
	} // main

} // class

// 추상클래스 다른거 다 가지고 있음. 추상화 작업 시 사용. 공통적인 부분 빼놓기위한 클래스 
// 인터페이스 상수, 추상메소드만 가지고 있음. 

interface ILotto{
	int LENGTH = 6;
	void fillLotto(int [] lotto);
	void dispLotto(int [] lotto);
	void isDuplicateLotto(int [] lotto);
}

interface Player2{
	void stop();
	void play();
}

class A_Player implements Player2{

	@Override
	public void stop() {
		// 1주 동안 구현
		
	}

	@Override
	public void play() {
		// 1주 동안 구현
	}
	
}


