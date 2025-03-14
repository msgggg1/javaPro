package days29;

/**
 * @author msg
 * @date 2025. 3. 14. - 오전 10:13:38
 * @subject
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		// [ collect() ]
	  /*     1) 최종 연산 중에서 가장 복잡하면서도 유용하게 활용될 수 있는 것.
       *     2) 스트림의 요소를 수집하는 최종 연산,  리듀싱(reducing)과 유사하다. / 제거하면서 처리
       *     3) collect()가 스트림의 요소를 수집하려면, 어떻게 수집할 것인가에 대한 방법이
       *     정의되어 있어야 하는 데, 이 방법을 정의한 것이 바로 컬렉터( collector )이다. / 수집방법,규칙 정의된것/내가 정의 
       *     4) collect() 최종연산
       *         Collector 인터페이스 
       *         Collectors 클래스  / 자주사용하는 방식
       *     5) 스트림을 컬렉션과 배열로 변환 - toList(), toSet(), toMap(), toCollection(), toArray()
        
       *     6) 통계 - counting(), summingInt(), averagingInt(), maxBy(), minBy() 
       *     7) 리듀싱 - reducing()
       *       (1) 리듀싱 역시 collect()로 가능하다.
       
       *     8) 문자열 결합 - joining()
       *       (1) 문자열 스트림의 모든 요소를 하나의 문자열로 연결해서 반환한다. 
       *       (2) 구분자를 지정 가능.
       *       (3) 접두사, 접미사도 지정 가능.
       *       
       *       // 수집하면서 할 수 있는 모든 기능
               
       *     9) 그룹화 분할 - groupingBy() // 여러그룹 , partitioningBy() // 두 영역 분할 -> 파티션
       *        (1) 그룹화 : 스트림의 요소를 특정 기준으로 그룹화하는 것.
       *        (2) 분할    : 스트림의 요소를 두 가지, 지정된 조건에 일치하는 그룹과 일치하지 않는 그룹으로 분할.
      
		 * 
		 * */ 

	} // main

} // class
