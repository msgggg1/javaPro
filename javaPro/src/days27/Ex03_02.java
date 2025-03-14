package days27;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

/**
 * @author msg
 * @date 2025. 3. 12. - 오전 11:05:03
 * @subject 함수형 인터페이스 + 컬렉션 프레임워크(JCF)
 * @content
 */
public class Ex03_02 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		} // for i
		// list 모든 요소를 출력.
//		list.forEach(new Consumer<Integer>() {
//			@Override
//			public void accept(Integer t) {
//				System.out.print(t + " / ");			
//			}
//		});
		
		list.forEach((t) -> System.out.print(t + " / "));
		System.out.println();
		// list 2의 배수 또는 3의 배수 제거
		// c -> l ->al 사용
		// (t) 괄호는 매개변수 1개일 경우 생략 가능
		list.removeIf(t -> t%2 == 0 || t%3 == 0);
		list.forEach((t) -> System.out.print(t + " / ") );
		
		//
		Map<String, String> map = new HashMap<String, String>();
		map.put("one", "1");
		map.put("two", "2");
		map.put("three", "3");
		
		// forEach() 메서드 사용해서 출력	
		map.forEach((k,v)->System.out.print("{"+k+", "+ v+"}, "));
		System.out.println();
		
	} // main

} // class
