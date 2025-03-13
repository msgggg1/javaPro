package days28;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author kenik
 * @date 2025. 3. 13. - 오전 9:40:33
 * @subject 
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		/*
		 * [람다식와 스트림(Stream)]
		 * 1. 자바의 IO(입출력) - 스트림(Stream) X
		 * 2. 스트림 ? 
		 *    많은 데이터 -> 배열, 컬렉션 사용 -> 처리
		 *                                        for
		 *                                        iterator    반복자
		 *                                        enumeration 열거자
		 *   표준화  X ( 중복인 처리 방법 )
		 *   10:03 수업 시작~
		 * 3. 데이터 소스(배열, 컬렉션, 파일)가 무엇이든지 간에 
		 *    스트림을 사용하게 되면 같은 방식으로 처리할 수 있다.
		 * 4. 스트림은 데이터 소스를 변경하지는 않는다.   
		 * 5. 스트림은 일회용이다. 
		 * 6. 스트림은 작업을 내부적으로 반복 처리 한다.    
		 * 7. 스트림은 미리 데이터를 다루는 메서드를 정의해 놓았다.  
		 *    s2
		 *        .sorted()
		 *        .forEach(System.out::println);                                         
		 * */
		
		String [] strArr =  {"aaa", "bbb", "ccc"};
		// for 문 사용 처리       X
		
		List<String> strList = Arrays.asList("aaa", "bbb", "ccc");
		// iterator 반복자로 처리 X
		
		// 배열 -> 스트림 변환
		Stream<String> s1 = Arrays.stream(strArr);
		// 컬렉션 -> 스트림 변환
		Stream<String> s2 = strList.stream();
		
		s1.sorted().forEach(System.out::println);
		// 스트림은 일회성이기 때문에 
		// s1.forEach(System.out::println);
		
		
		s2.sorted().forEach(System.out::println);
		

	}

}
  