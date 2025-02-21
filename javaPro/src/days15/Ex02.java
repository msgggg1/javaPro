package days15;

/**
 * @author msg
 * @date 2025. 2. 21. - 오전 11:02:04
 * @subject
 * @content
 */

public class Ex02 {

	public static void main(String[] args) {
		// [JVM의 메모리 구조]
		// 응용프로그램을 실행하면 JVM이 OS(=시스템)로부터 프로그램을 실행하는 데 필요한 메모리 할당받음. 
		// JVM은 용도에 따라서 여러 영역으로 나누어서 관리
		// 1) Method Area
		//		ㄴ 프로그램 실행 시 클래스 파일(.class) -> 읽어서 클래스에 대한 정보를 Method Area에 저장한다(= 메모리에 올라감)
		// 		ㄴ 클래스 변수 올라감
		// 
		// 2) Call [ Stack ] 호출 스택
		//	  메서드가 호출할 때 메서드에서 사용할 저장 공간. -> 메서드 끝나면 소멸/  메서드 별로 만들어짐 
		// 		ㄴ 지역변수
		// 3) [Heap] 동점영역
		// 		ㄴ new 연산자에 의해서 저장 공간 잡힘.
		// 		배열선언, 객체 생성(new Person();)될 때 공간 할당
		// 						인스턴스(인스턴스 변수)

	} // main

} // class
