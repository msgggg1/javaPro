package days14;

/**
 * @author msg
 * @date 2025. 2. 20. - 오후 3:31:23
 * @subject 클래스(객체) 배열
 * @content		ㄴ 배열? 
 */

public class Ex08_02 {

	public static void main(String[] args) {
		// 클래스 배열(=객체 배열) 선언 ****** (자료형이 클래스)
		
		
		Person [] pArr = new Person[5]; // 객체 생성x, 배열 생성
		
		pArr[0] = new Person();
		
		// 5 명의 사람
		pArr[0].name = "권태정";
		pArr[1].name = "권태정";
		pArr[2].name = "권태정";
		pArr[3].name = "권태정";
		pArr[4].name = "권태정";
		
		for (int i = 0; i < pArr.length; i++) {
			pArr[i].work();
			
		} // for i
	} // main

} // class
