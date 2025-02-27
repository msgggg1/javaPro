package days19;

/**
 * @author msg
 * @date 2025. 2. 27. - 오후 2:16:10
 * @subject
 * @content
 * 
 * 		String 불변
 * 문자열 수정/삭제/삽입 등 "변경"하고자 할때 
 * 2. StringBuffer
 * 3. StringBuilder
 */
public class Ex05 {

	public static void main(String[] args) {
		// (암기) 불변  
		String s = "TODO Auto-generated method stub";
		
		// 1. 삽입
//		int index = s.indexOf("Auto");
//		int len = "Auto".length();	
//		System.out.println(s.substring(0,index+len) +"[hi]"+s.substring(index+len));
		
		//2. String  s에서 "method" 문자열 찾아서 삭제
//		index = s.indexOf("method");
//		len = "method".length();
//		System.out.println(s.substring(0,index) + s.substring(index+len));
//		StringBuffer sb = new StringBuffer(s); // 차이: 멀티스레드에 안전 O -> 동기화처리되어있다. 
		StringBuilder sb = new StringBuilder(s);//				안전 X 
		
		//3. method -> 메소드 수정
	
		System.out.println(s.replace("method", "메소드"));
		
		//1.삽입
//		sb.insert(index+len, "[hi]");
		// 2. 삭제
//		sb.delete(index, index+len);
		// 3. 수정
		int start = sb.indexOf("method");
		int end = start + "method".length();
		sb.replace(start, end, "메소드");
		
		sb.reverse();
		
		System.out.println(sb);

		// Auto 문자열을 찾아서 [hi] 삽입
		
		
		
	} // main

} // class
