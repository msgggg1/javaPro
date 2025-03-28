package days16;

/**
 * @author msg
 * @date 2025. 2. 24. - 오전 11:45:33
 * @subject 
 * @content
 * 		클래스 변수의 초기화 순서 : 기본값 -> 명시적 초기화 -> 클래스 초기화 블럭
 * 		인스턴스 변수의 "   "  : 기본값 -> 명시적 초기화 -> 인스턴스 초기화 블럭 -> 생성자
 * 
 * 		공장에서 제품을 생산할 때 제품마다 생산일련번호(serial no)를 부여..
 * 		인스턴스 마다 고유한 일련번호를 부여...
 */
public class Ex05_02 {

	public static void main(String[] args) {
		
		Document doc1 = new Document();
		Document doc2 = new Document();
		Document doc3 = new Document("자바문서.txt");
		Document doc4 = new Document();
		Document doc5 = new Document();

	} // main

} // class


class Document{
	String fileName ;
	static int count = 1; // 개념적으로 클래스당 하나 있어야 함 -> static
	
	// 인스턴스 초기화 블럭
 { // static .x -> 한번만 로드되기 때문에 값이 증가하지 않고 고정됨. 
		count ++; //인스턴스 초기화 블럭 (생성자 중복)
	}
	
	public Document() {
		//count ++;
		this(String.format("Noname%d.txt", count));
	}

	public Document(String fileName) {
		//count ++;
		this.fileName = fileName;
		System.out.printf("문서 \"%s\"가 생성되었습니다.\n", this.fileName);
	
	}
}








