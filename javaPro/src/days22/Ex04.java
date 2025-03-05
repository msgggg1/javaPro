package days22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author msg
 * @date 2025. 3. 5. - 오전 11:16:52
 * @subject String [] -> ArrayList 변환
 * @content ArrayList -> String[] 변환		
 */
public class Ex04 {

	public static void main(String[] args) {
		// 1. String [] -> ArrayList 변환
		String [] names = {"박예진", "양희동", "박정현", "김대원", "주정호", "이찬희"};
		/*[1]
		ArrayList list = new ArrayList();
		for (int i = 0; i < names.length; i++) {
			list.add(names[i]);
		} // for i
		System.out.println(list);
		*/
		
		//[2]			T...a 가변인자 -> 배열 넣어도 됨
		// String [] -> List<String> // 쓸 수 있으면 쓰면됨
		List list = Arrays.asList(names);
		System.out.println(list);
		//List -> ArrayList 변환
		ArrayList list2 = new ArrayList(list); // 매개변수 다형성
		System.out.println(list2);
		
		//ArrayList -> String[] 변환
		//[1]
//		String [] sArr = new String[list2.size()];
//		for (int i = 0; i < list2.size; i++) {
//			sArr[i] = (String) list2.get(i);
//		} // for i
//		System.out.println( Arrays.toString(sArr) );
		//[2]
		/*
		Object [] oArr = list2.toArray();
		for (Object obj : oArr) {
			String name = (String) obj;
			System.out.println(name);
		}
		*/
		
		//[3] Object[] -> String[] 변환
		//String [] sArr = (String[]) list2.toArray(); -> 오류
		//[암기]
//		String [] sArr = (String[]) list2.toArray(new String[list2.size()]); // 가능
		String [] sArr = (String[]) list2.toArray(String[]::new); // 가능
		System.out.println(Arrays.toString(sArr));
		
		
	} // main

} // class
