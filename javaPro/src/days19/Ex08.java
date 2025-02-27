package days19;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.IntStream;

/**
 * @author msg
 * @date 2025. 2. 27. - 오후 4:27:17
 * @subject java.util 패키지
 * @content   ㄴ 자주 사용되는 유용한 유틸리티(클래스)
 */
public class Ex08 {

	public static void main(String[] args) {
		//[1] java.util.Arrays 클래스
		int [] m = {3,5,2,4,1};
		
		System.out.println(Arrays.toString(m));
		
//		Arrays.fill(m, -1);
//		System.out.println(Arrays.toString(m));
		//Arrays.sort(m);
		//내림차순정렬
		// int [] m => Integer [] 변환
		IntStream is = Arrays.stream(m);
		Integer [] n = is.boxed().toArray(Integer[]::new);
		
		//Arrays.sort(n, Collections.reverseOrder());
		/*
		Arrays.sort(n, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2); //0
			}
		});*/
		
		Arrays.sort(n, (o1,o2) -> o2.compareTo(o1));
		
		System.out.println(Arrays.toString(n));
		
		//Arrays.copyOf(m, m.length+3);
		//Arrays.copyOfRange(m, int from, int to);
		
		//Arrays.binarySearch(m, 100);
		
		// 두 배열 같은지 여부
		//Arrays.compare(int [] m, int [] n);
		
		// int[] -> List 변환
		//List<int[]> Arrays.asList(m);
		
		
	} // main

} // class
