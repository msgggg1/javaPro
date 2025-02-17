package days09;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * @author msg
 * @date 2025. 2. 13. - 오후 12:34:02
 * @subject
 * @content
 */
public class Ex04_04 {

	public static void main(String[] args) {

		//830412-2700001
		Scanner scanner = new Scanner(System.in);
		String rrn = getRrn(scanner);
		System.out.println(rrn);
		
	}
		
		//1) 출생지역 해보기
//		‘ㅍ’은 주민등록번호에 오류가 없는지 확인하는 검증번호로, 아래와 같은 특수한 규칙으로 만든다.
//		ㅍ = 11-{(2×ㄱ+3×ㄴ+4×ㄷ+5×ㄹ+6×ㅁ+7×ㅂ 6//8+8×ㅅ+9×ㅇ+2×ㅈ+3×ㅊ+4×ㅋ+5×ㅌ) mod 11}
//																	   %
//
//		즉, 소괄호 안에 있는 것을 계산한 값을 11로 나눠서 나온 나머지를 11에서 뺀 값이 ㅍ이다. (단, 10은 0, 11은 1로 표기한다.)
		
		
//		int core = check(rrn);
//		int effectiveness = 0;
//		
//		if ((core % 11 - 11) == 10) {
//			effectiveness = 0;
//		} // if
//		if ((core % 11 - 11) == 11) {
//			effectiveness = 1 ;
//		} else effectiveness = core % 11 - 11 ;
//		
//		System.out.println(effectiveness);

		  /*
	      
	      int ㅍ = Integer.parseInt( rrn.substring(13, 14) );
	      
	      int ㄱ = Integer.parseInt( rrn.substring(0, 1) );
	      int ㄴ = Integer.parseInt( rrn.substring(1, 2) );
	      int ㄷ = Integer.parseInt( rrn.substring(2, 3) );
	      int ㄹ = Integer.parseInt( rrn.substring(3, 4) );
	      int ㅁ = Integer.parseInt( rrn.substring(4, 5) );
	      int ㅂ = Integer.parseInt( rrn.substring(5, 6) );
	      // - 6,7
	      int ㅅ = Integer.parseInt( rrn.substring(7, 8) );
	      int ㅇ = Integer.parseInt( rrn.substring(8, 9) );
	      int ㅈ = Integer.parseInt( rrn.substring(9, 10) );
	      int ㅊ = Integer.parseInt( rrn.substring(10, 11) );
	      int ㅋ = Integer.parseInt( rrn.substring(11, 12) );
	      int ㅌ = Integer.parseInt( rrn.substring(12, 13) );
	      
	      int checkSum = 11-((2*ㄱ+3*ㄴ+4*ㄷ+5*ㄹ+6*ㅁ+7*ㅂ+8*ㅅ+9*ㅇ+2*ㅈ+3*ㅊ+4*ㅋ+5*ㅌ) % 11);
	      
	      if (checkSum == 10) {
	         checkSum = 0;
	      }else if ( checkSum == 11) {
	         checkSum = 1;
	      } // if // if
	      
	      if (ㅍ == checkSum) {
	         System.out.println("검증 주민번호 O");
	      } else {
	         System.out.println("검증 실패된 주민번호 X");
	      } // if
	       
	   } // main


	

//private static int check(String rrn) {
//	
//	int sum = 0;	
//	
//	int index = 0;
//	String StrRrnEachValue = rrn.substring(index, index+1);
//	int rrnEachValue = Integer.parseInt(StrRrnEachValue);
//	
//	for (index = 0; index < 6; index++) {
//		sum += (index+1)*rrnEachValue;	
//	} // for i
//	if (index ==  8 || index == 9) {
//		sum += (index)*rrnEachValue;
//	} // for i
//	for (index = 10; index <= 12 ; index++) {
//		sum += (index-7)*rrnEachValue;	
//	} // for i
//	
//		return sum;
//	}
 * */
 





private static int getAmericanAge(String rrn) {   
	// 만나이 = 올해년도 - 생일년도   ( 생일지나지않은 경에만 -1  ) 
	int americanAge = getCountingAge(rrn)-1;
	// 생일의 월/일 - 0412
	// 올해의 월/일 - 3 13
	/*
       if (!(올해월>=생일월  && 올해일>=생일일))   age--;
	 */      
	//  0412 
	int birthMD = Integer.parseInt( rrn.substring(2, 6) );
	// 올해 월일
	Date d = new Date();
	int currMD = ( d.getMonth()+1)*100 +   d.getDate();
	if( birthMD > currMD ) americanAge--;       
	return americanAge;

}

private static int getCountingAge(String rrn) {
	//       [1]
	//		Date d = new Date();
	//		System.out.println(d.getYear()+1900);

	//[2]
	//		Calendar c = Calendar.getInstance();
	//		System.out.println(c.get(Calendar.YEAR));

	LocalDate d = LocalDate.now();
	int currentYear = d.getYear(); // 올해년도

	Integer.parseInt(getBirthday(rrn).substring(0, 4));
	int birthYear = getYear(rrn);

	return currentYear - birthYear + 1;
}


private static int getYear(String rrn) {
	int year = getCentury(rrn) + Integer.parseInt( rrn.substring(0, 2) );
	return year;
}



private static String getBirthday(String rrn) {

	int year = getCentury(rrn) + Integer.parseInt( rrn.substring(0, 2) );
	int month = Integer.parseInt( rrn.substring(2, 4) );
	int day = Integer.parseInt( rrn.substring(4, 6) ); 
	String birthday = String.format("%d년 %d월 %d일", year, month, day);
	return birthday;
}

private static boolean getNationality(String rrn) {
	char gender = rrn.charAt(7);  // rrn.charAt - '0'
	switch (gender) {
	case '0' : case '9':
	case '1' : case '2' : case '3' : case '4':
		return true ;

	default:
		return false;
	}
}

private static int getCentury(String rrn) {

	char gender = rrn.charAt(7);  // rrn.charAt - '0'
	switch (gender) {
	case 0 : case 9:
		return 1800;

	case 1 : case 2 : case 5 : case 6:
		return 1900 ;

	default:
		return 2000;
	}
}


private static String getRrn(Scanner scanner) {
	// 유효성 검사 숫자6-숫자7
	//		String regex = "[0-9]{6}-[0-9]{7}";
	String regex = "\\d{6}-\\d{7}";
	String rrn ;

	// [알림], 실패횟수
	do {
		System.out.print("주민번호 14자리 입력");
		rrn = scanner.next();
	} while (!rrn.matches(regex));

	return rrn;
}

private static boolean getGender(String rrn) { 

	//[2] String rrn .substring(0,0)
	String strGender = rrn.substring(7, 8); // "2"
	int gender = Integer.parseInt(strGender); // 2
	return  gender%2==1 ? true:false;


}


} // class
