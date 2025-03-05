package days22;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * @author msg
 * @date 2025. 3. 5. - 오후 2:48:10
 * @subject 수식괄호검사
 * @content
 */
public class Ex07_04 {

	public static void main(String[] args) {
		
		if (args.length != 1) {
			System.out.println("Usage : java ExpValidCheck \"EXPRESSION\"");
			System.out.println("Example : java ExpValidCheck\"((2+3)*1)+3\"");
			System.exit(0); // 프로그램 종료 매소드
		} // if
		
		Stack st = new Stack(); //LIFO
		String expression = args[0];
		
		System.out.println("expression:"+ expression);
		
		try {
			for (int i = 0; i < expression.length(); i++) {
				char ch = expression.charAt(i);
				
				if (ch =='(') {
					st.push(ch+"");
				} else if (ch == ')') {
					st.pop();
				} // if
			} // for i
			
			if (st.isEmpty()) {
				System.out.println("괄호가 일치합니다.");
			} else {
				System.out.println("괄호가 일치하지 않습니다.");
			}
			
		} catch (EmptyStackException e) { // ) 남는경우
			System.out.println("괄호가 일치하지 않습니다. ");
		}
	}

}
