package days19;

import java.util.StringTokenizer;

/**
 * @author msg
 * @date 2025. 2. 27. - 오후 3:22:56
 * @subject
 * @content 4. StringTokenizer 클래스 == String.split()
 */
public class Ex05_04 {

	public static void main(String[] args) {
		
		String team1 = "박정현, 김하은, 김민곤, 박예진, 양희동";
		//				[Token], [Token]..
		//[1] 권장
//		String [] teamArr = team1.split("\\s*,\\s*)
		
		//[2]
		StringTokenizer st = new StringTokenizer(team1, ",");
		
//		System.out.println(st.countTokens()); //5
//		st.hasMoreTokens(); //true, false
		st.nextToken();
		while (st.hasMoreTokens()) {
			String name = st.nextToken();
			System.out.println(name);
		} //  whileil
	}

}
