package days18;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author msg
 * @date 2025. 2. 26. - 오전 11:48:50
 * @subject
 * @content
 */
public class Ex04_03 {

	public static void main(String[] args) {
		String [] s = {"kbs", "sbs", "mbc", "jtbc"};
		System.out.println(Arrays.toString(s));
		//내림차순 정렬
		//[1]
		//Arrays.sort(s, Collections.reverseOrder()); T -> 타입. 클래스 타입
		
		//[2]
//		StringCompartor c = new StringCompartor()
		Arrays.sort(s, /*비교하고자 하는 잣대*/new StringCompartor());
		System.out.println(Arrays.toString(s));

		/*
		String a = "abC";
		String b = "abD";
		
		System.out.println(a.equals(b)); //equals -> true/false 반환
		
		System.out.println(a.compareTo(b)); // -1
		System.out.println(b.compareTo(a)); // +1
		*/
		
		//[3] 익명 클래스 사용해서 처리
		/*
		Arrays.sort(s, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return -1 * o1.compareTo(o2);
			}
		});
		*/
		
		//[4] 암기 -> [3]과 100% 동일
		// 람다식과 스트림
		Arrays.sort(s, (o1, o2) -> -1 * o1.compareTo(o2));
			
		
		System.out.println(Arrays.toString(s));
		
	} // main

} // class


class StringCompartor implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = (String)o1;
		String s2 = (String)o2;
		return -1*s1.compareTo(s2);
	}
	
}
