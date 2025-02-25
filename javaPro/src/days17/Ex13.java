package days17;

/**
 * @author msg
 * @date 2025. 2. 25. - 오후 4:09:04
 * @subject 인터페이스 
 * @content		ㄴ 상수, 추상메소드 선언
 * 				ㄴ [ jdk 1.8 부터 default, static 메소드 추가 ]
 */
public class Ex13 {

	public static void main(String[] args) {
		// html 문서 구문분석(파싱)을 해서 내가 원하는 내용을 얻어오기를 w
		// 또는 
		// xml 문서 구문분석(파싱)을 해서 내가 원하는 내용을 얻어오기를 w

		String fileName = "sample.xml";
		String docType = "xml";
		// 업캐스팅
		Parseable parser = ParserManager.getParser(docType);
		
		// 다형성
		parser.parse(fileName);
		parser.print();
		
		System.out.println("end");
		
	} // main

} // class

// 2000년도 A 개발자 선언, 구현
interface Parseable{
	// 구문분석하는 추상 메소드 선언
	void parse(String fileName);

	//20년지나 새로운 추상 메소드 추가.
	// void test(); -> 20년간 축적된 모든 곳에서 구현하지 않으면 객체생성 못함 -> static 객체 생성안해도 메모리 올라감. 추가됨. 
	static void test() {
		System.out.println("20년 지난후에 이 기능 메서드 추가");
	} // 몸체 구성

	/*public abstract*/default void print() { // 오버라이딩 안해도 사용가능  // default라고 되어 있어도 public임 // default 접근지정자아님
		//default 메서드 != default 접근제어자
		// default 기타제어자
		System.out.println("인쇄 기능 구현된 메소드 추가");
	}

	//static 오버라이딩 불가/ default는 다시 구현 가능


}

//
interface parseablePlus extends Parseable{

	// 인쇄 추상메서드 추가 
	void print();
}

// 2000년 A 개발자
//HTML 문서를 파싱하는 클래스 (파서) 선언
class HTMLParser implements Parseable{

	@Override
	public void parse(String fileName) {
		System.out.println("HTML 파일 구문 분석 메서드 호출");

	}

}

//2000년 A 개발자
//XML 문서를 파싱하는 클래스 (파서) 선언
class XMLParser implements Parseable{

	@Override
	public void parse(String fileName) {
		System.out.println("XML 구문 분석 메서드 호출");

	}

}


//2020년 A 개발자
//PDF 문서를 파싱하는 클래스 (파서) 선언
class PDFParser implements Parseable{

	@Override
	public void parse(String fileName) {
		System.out.println("PDF 구문 분석 메서드 호출");

	}

}

//2023년 A 개발자
//WORD 문서를 파싱하는 클래스 (파서) 선언
class WORDParser implements Parseable{

	@Override
	public void parse(String fileName) {
		System.out.println("WORD 구문 분석 메서드 호출");

	}

	public void print() { // 오버라이딩 안해도 사용가능
		System.out.println("인쇄 기능 구현된 메소드 추가");
	}

}



// 시간 지남에 따라 무수히 많은 parser 클래스를 선언해서 사용


// parser 4개 -> 1개의 파서를 찾아서 사용할 수 있도록 관리하는 클래스
// ~~Manager // 관리자 역할
class ParserManager{
	
	public static Parseable getParser(String docType) { // 매개변수 다형성
		
		Parseable parser = null;

		switch (docType) {
		case "xml":
			parser = new XMLParser();
			break;
		case "html":
			parser = new HTMLParser();
			break;
		case "pdf":
			parser = new PDFParser();
			break;
		case "word":
			parser = new WORDParser();
			break;

		default:
			parser = null;
			break;
					} // switch


					return parser;
	}
}
				


