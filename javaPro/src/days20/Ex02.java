package days20;

/**
 * @author msg
 * @date 2025. 2. 28. - 오전 10:31:39
 * @subject
 * @content
 */

public class Ex02 {

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
		 String word = "홍길동";
		 int wordLength = word.length(); //3
		 int index = -1; // 홍길동 찾은 위치 저장 변수
		 int fromIndex = 0; // 찾기 시작할 위치 저장 
		 int count = 0;
		 
		 int [] findArr = new int[data.length()/wordLength];
//		 int twoIndex = -1;
		 
		 while ((index = data.indexOf(word, fromIndex))!= -1) {
			 findArr[count] = index;
			 
			System.out.printf("> %d번째 찾은 위치 : %d\n", ++count , index);
//			if (count == 2) twoIndex = index;
			fromIndex = index + wordLength;
		} //  while
		 
		 StringBuilder sb = new StringBuilder(data);
		 int start = findArr[1];
		 int end = start +word.length();
		 sb.replace(start, end, word);
		 
		 System.out.println(sb.toString());
		 
		System.out.println("end");
		 /*
		 //ㄱ. "홍길동"을 찾아서 모든 위치를 출력하고
		 int index = 0;
		 int indexName = 0;
		 int no = 1;
		 while ((data.indexOf("홍길동")) != -1) {
	
				index = data.indexOf("홍길동");
				index != 0 ? indexName += index : indexName += (index+3);
				System.out.printf("> %d번째 찾은 위치 : %d\n", no++, indexName );
				data = data.substring(index + "홍길동".length());
				index = 0;
			
		} //  while
			 
//		  ㄴ. 두 번째 "홍길동"을 본인이름으로 바꿔서 출력하세요.
		 StringBuffer sb = new StringBuffer();
		 System.out.println( sb.replace(data.indexOf("홍길동"), data.indexOf("홍길동")+4, "김민선"));
	*/
	
		
		 

	} // main

} // class
