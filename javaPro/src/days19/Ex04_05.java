package days19;

/**
 * @author msg
 * @date 2025. 2. 27. - 오후 12:38:58
 * @subject
 * @content
 */
public class Ex04_05 {

	public static void main(String[] args) {
		String team1 = "권용범,   김대원   , 김민곤  ,   김하은,  박세훈";  
		String regex = "\\s*,\\s*"; // split 구분자로 사용할 정규표현식 / 공백 여러개 있던없던 상관x
		String [] nameArr = team1.split(regex);
//		String [] nameArr = team1.split(regex, 3);
		System.out.println(Arrays.toString(nameArr));
		
		String content = String.join("<\li>\n  ", nameArr);

	} // main

} // class
