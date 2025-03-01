package days20;


public class Ex02_review {

	public static void main(String[] args) {
		// 2. 문자열 다루는 클래스 및 메소드 문제.
//		  String data = "안녕하세요. 홍길동입니다. 이름은 홍길동입니다. 별명도 홍길동입니다.";
//		  ㄱ. "홍길동"을 찾아서 모든 위치를 출력하고
//		  ㄴ. 두 번째 "홍길동"을 본인이름으로 바꿔서 출력하세요. 
//		   
//		  실행결과)
//		    ㄱ. 결과
//		  	> 1번째 찾은 위치 : 7
//			> 2번째 찾은 위치 : 19
//			> 3번째 찾은 위치 : 31
//			ㄴ. 결과
//			안녕하세요. 홍길동입니다. 이름은 이창익입니다. 별명도 홍길동입니다.
		
		  String data = "안녕하세요. 홍길동입니다. 이름은 홍길동입니다. 별명도 홍길동입니다.";
		  String searchWord = "홍길동";
		  int index = 0;
		  int fromIndex = 0;
		  int no = 0;
		  int secondIndex = 0;
		  
		  while (data.indexOf(searchWord, fromIndex) != -1) {
			  index = data.indexOf(searchWord, fromIndex);
			  System.out.printf("> %d번째 찾은 위치 : %d\n", ++no, index);
			  if (no == 2) secondIndex = index;
			  fromIndex = index + searchWord.length();
		} //while
		  
		  StringBuffer sb = new StringBuffer(data);
		  System.out.println(sb.replace(secondIndex, secondIndex+searchWord.length(), "김민선"));
		  
		  
	} // main

} // class
