package days28;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author msg
 * @date 2025. 3. 13. - 오전 10:36:46
 * @subject
 * @content
 */
public class Ex04_02 {

	public static void main(String[] args) {
		
		int [] iArr = { 34, 64, 22, 54, 11, 9 , 89, 13, 22, 34, 100 };
		// 배열 -> 스트림
		// 1) Stream.of(T...args), Stream.of(T[] args)
		// 2) Arrays.stream(T [] args), Arrays.stream(T [] args, int startIndex, int endIndex)
		// [기본형스트림]
		// IntStream is = Arrays.stream(iArr);
		// Stream<Integer> is = Arrays.stream(iArr).boxed(); // boxed -> Int, int -> Integer, Integer 스트림으로 바뀐다. 
		IntStream is = IntStream.of(iArr);
		
//		int sum = is.sum();
//		System.out.println(sum); //452
		
		// 3) int [] -> List 변환
		/*
		List<Integer> list = Arrays.stream(iArr).boxed().collect(Collectors.toList()); // 기본형스트림.boxed -> Stream<Integer> / 스트림 모든 요소 collect -> list로 돌려줌
		*/
		
		/*
		// 위 is 스트림을 사용해서 50 이상인 것만 필터링
		IntStream filterIs = is.filter(t -> t>=50);
		filterIs.forEach(System.out::println); // 메서드 참조
		*/
		
		// 5) is 중복 제거 -> 정렬 -> 3개
		/*
		IntStream is2 = is.distinct().sorted().limit(3);
		is2.forEach(System.out::println);
		*/
		
		
		// 6) is	max, min
		// OPtional<Integer>
		OptionalInt oamx = is.max();
		System.out.println(oamx.getAsInt());

		// 7) String [] -> Stream 변환
		String [] strArr = {"aa", "bb", "cc"};
		Stream<String> ss = Stream.of(strArr);
		
		
		
	} // class

} // main
