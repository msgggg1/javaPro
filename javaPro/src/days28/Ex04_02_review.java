package days28;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author msg
 * @date 2025. 3. 15. - 오후 9:08:45
   @subject
   @content
 */
public class Ex04_02_review {

	public static void main(String[] args) {
		int [] iArr = { 34, 64, 22, 54, 11, 9 , 89, 13, 22, 34, 100 };

		// 배열 -> 스트림
		// [1]
//		Stream<int[]> siArr= Stream.of(iArr);
//		siArr.forEach(s -> System.out.println(Arrays.toString(s)));
		
		// [기본형스트림]
		//[2]
//		IntStream is = Arrays.stream(iArr, 1,5);
//		is.forEach(System.out::println);
		
		//[3]
//		Stream<Integer> s = Arrays.stream(iArr).boxed();
//		s.forEach(System.out::println);

		//[4]
		IntStream s = IntStream.of(iArr);
		
		
		//sum
//		int sum = s.sum();
//		System.out.println(sum);
		
		
		// 3) int [] -> List 변환
		List<Integer> list = Arrays.stream(iArr).boxed().collect(Collectors.toList());
		System.out.println(list);
		

		// 위 is 스트림을 사용해서 50 이상인 것만 필터링
//		IntStream filteris = s.filter(i -> i>= 50);
//		filteris.forEach(System.out::println);
		
		// 5) is 중복 제거 -> 정렬 -> 3개
//		IntStream is = s.distinct().sorted().skip(2).limit(3);
//		is.forEach(System.out::println);;
		
		// 6) is	max, min
		OptionalInt omax = s.max();
		System.out.println(omax.getAsInt());
		
		// 7) String [] -> Stream 변환
		String [] strArr = {"aa", "bb", "cc"};
		Stream<String> ss = Stream.of(strArr);
		ss.forEach(System.out::println);
	} // main

} // class
