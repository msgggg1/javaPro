package days17;

/**
 * @author msg
 * @date 2025. 2. 25. - 오전 11:45:58
 * @subject [싱글톤(Singleton) 패턴]
 * @content
 */
public class Ex07 {

	public static void main(String[] args) {

		//		BoardDAO dao = new BoardDAO;
		BoardDAO dao1 = BoardDAO.getIstance();
		BoardDAO dao2 = BoardDAO.getIstance();
		BoardDAO dao3 = BoardDAO.getIstance();
		BoardDAO dao4 = BoardDAO.getIstance();

		System.out.println(dao1.hashCode());
		System.out.println(dao2.hashCode());
		System.out.println(dao3.hashCode());
		System.out.println(dao4.hashCode()); // 인스턴스고향값

	} // main

} // class 

//싱글톤 패턴 - DAO 많이 사용
// 2. Lazy initialization(지연초기화) - 멀티스레드 안전x
/*
private static BoardDAO boardDAO = null;

//외부에서 객체 생성 못하도록 private 막음
private BoardDAO() {}

public static BoardDAO getIstance() {
	if (boardDAO == null) {
		boardDAO = new BoardDAO();
	} // if
	return boardDAO;
}
 */

// 3. thread -safe(synchronized)
/*
class BoardDAO{

	private static BoardDAO boardDAO = null;

	//외부에서 객체 생성 못하도록 private 막음
	private BoardDAO() {}

	public static synchronized BoardDAO getIstance() {
		if (boardDAO == null) {
			boardDAO = new BoardDAO();
		} // if
		return boardDAO;
	}
	 */

	// 이중확인 잠금
class BoardDAO{
		private static volatile BoardDAO boardDAO = null;

		//외부에서 객체 생성 못하도록 private 막음
		private BoardDAO() {}

		public static BoardDAO getIstance() {
			if (boardDAO == null) {
				synchronized (BoardDAO.class) {
					boardDAO = new BoardDAO();
				} // if
			}
			return boardDAO;
		}

	}



