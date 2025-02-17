package days09;

/**
 * @author msg
 * @date 2025. 2. 13. - 오후 12:04:21
 * @subject
 * @content
 */
public class Ex03_02 {

	public static void main(String[] args) {
		// 주민등록번호 resident registration number
		String rrn = "830412-1700001";
//		1)    -*******
		String [] rrnArr = rrn.split("-");
		// + 문자열 연결 연산자
		System.out.println(rrnArr[0]+"-*******");
		// String.concat
		System.out.println(rrnArr[0].concat("-*******"));
		
//		2) -1******
		System.out.println(rrnArr[0]+"-"+rrnArr[1].charAt(0)+"******");
		rrnArr[0].concat("-").concat(rrnArr[1].charAt(0)+"").concat("******");
		
//
	} // main

} // class
