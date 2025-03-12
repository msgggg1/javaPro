package days27;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author msg
 * @date 2025. 3. 12. - 오전 9:45:41
 * @subject
 * @content
 */
public class Ex02_02 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("kbs","mbc", "sbs", "jtbc");
		System.out.println(list);
		// 내림차순으로 정렬
//		Collections.sort(list, new Comparator<String>() {
//
//			@Override
//			public int compare(String o1, String o2) {
//				return o2.compareTo(o1);
//			}
//		});
		Collections.sort(list, new Comparator<String>() {
			
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});

		//functionalInterface : static default여러개 상관 X 추상메서드는 1개
		System.out.println(list);

	} // main

} // class
