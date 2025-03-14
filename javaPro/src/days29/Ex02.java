package days29;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author msg
 * @date 2025. 3. 14. - 오전 9:28:44
 * @subject
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
		/* [ 스트림의 최종 연산 ] 
	   *     1) forEach() - peek() 메서드와 달리 스트림의 요소를 소모하면서 처리되는 최종 연산
       *     2) 조건 검사 	- allMatch(), anyMatch(), noneMatch(), findFirst(), findAny()
       *     3) 통계 		- count(), sum(), average(), max(), min()
       *     
       *     4) 리듀싱 - reduce()
       *       (1) 스트림의 요소를 줄여나가면서 연산을 수행하고 최종결과를 반환한다.
       *       (2) 매개변수의 타입 - BinaryOperator<T> 
		 * 
		 * */

		String[] strArr = {
		         "Inheritance", "Java", "Lambda", "stream",
		         "OptionalDouble", "IntStream", "count", "sum"
		      };
		
		// String [] -> Stream 변환
		// Stream<String>
		//Arrays.stream(strArr);
		Stream.of(strArr).forEach(System.out::println);
		// 조건 검사 최종 연산 : allMatch ..       -> true/false boolean
		boolean noEmptyStr = Stream.of(strArr).noneMatch(s->s.length()==0);
		System.out.println(noEmptyStr);
		
		Optional<String> sword = Stream.of(strArr).filter(s ->s.charAt(0)=='s').findFirst();
		System.out.println(sword.get());
		
		// String<String[]> -> IntStream 으로 변환 // 문자열길이를 가지는 Stream 객체 가지겠다는 뜻
		IntStream is1 = Stream.of(strArr).mapToInt(String::length);
		IntStream is2 = Stream.of(strArr).mapToInt(String::length);
		IntStream is3 = Stream.of(strArr).mapToInt(String::length);
		IntStream is4 = Stream.of(strArr).mapToInt(String::length);
		// 스트림의 요소 개수
		//is1.count();
		int count = is1.reduce(0, (a,b) -> a +1); // binaryoperator : 두개 연산. 첫번째 스트림 요소 0초기값과 비교 
		System.out.println(count);
		// 11 4 6 5 
		
		// 문자열 총 길이
		//is1.sum();
		int sum = is2.reduce(0, (a,b) -> a + b); 
		System.out.println(sum);
		//max
		// is3.max();
//		int max = is3.reduce(0, (a,b) -> Math.max(a, b)); 
//		int max = is3.reduce(0, (a,b) -> a>b?a:b); 
//		System.out.println(max);
		OptionalInt max = is3.reduce(Integer::max); 
		System.out.println(max.getAsInt());
		// min
		int min = is4.reduce(Integer.MAX_VALUE, (a,b) -> a>b?b:a); 
		System.out.println(min);
	} // main

} // class
