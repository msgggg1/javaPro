package days28;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author msg
 * @date 2025. 3. 13. - 오전 11:53:59
 * @subject
 * @content
 */
public class Ex08 {

	public static void main(String[] args) {
		Student [] stuArr = {
	               new Student("이자바",3,300),
	               new Student("김자바",1, 200),
	               new Student("안자바",2, 100),
	               new Student("박자바",2, 150),
	               new Student("소자바", 1, 200),
	               new Student("나자바", 3, 290),
	               new Student("감자바", 3, 180)
							};
		
		// 2차 정렬 반별로 정렬 - 총점으로 내림차순 정렬
		Stream<Student> st = Stream.of(stuArr);
		st.sorted(
				Comparator.comparing(Student::getBan).thenComparing(Comparator.naturalOrder()));
		
		st= Stream.of(stuArr); // 다시 스트림 객체 생성
		//1. 학생 수
		System.out.println();
		
		// totalScore 만을 가지고 있는 스트림 따로 생성
		//  ㄴ IntStream 기본형 스트림 생성.
		
		// Stream<Student> st -> IntStream< int totalScore > 생성
		// 	1) mapToInt(), mapToLong(), mapToDouble() 기본형스트림 생성
		//	   map() 메서드 : Stream<T>
		IntStream stot = st.mapToInt(Student::getTotalScore);
//		System.out.println(stot.sum()); // 계속 닫힘 -> 불편
		
		//2. 점수의 총합
		//3. 점수의 평균
		//4. 점수의 최고, 최저
		// 최종 연산에 의해서 매번 1,2,3,4 스트림 객체 생성(문제점)
		IntSummaryStatistics iss = stot.summaryStatistics();
		System.out.println(iss.getCount());
		System.out.println(iss.getSum());
		System.out.println(iss.getAverage());
		System.out.println(iss.getMax());
		System.out.println(iss.getMin());
				
	} // main


/*
class Student implements Comparable<Student>{
	   
	   String name;
	   int ban;
	   int totalScore;
	   
	   Student(){}

	   public Student(String name, int ban, int totalScore) { 
	      this.name = name;
	      this.ban = ban;
	      this.totalScore = totalScore;
	   }

	   @Override
	   public String toString() {
	      return "Student [name=" + name + ", ban=" + ban + ", totalScore=" + totalScore + "]";
	   }

	   public String getName() {
	      return name;
	   }

	   public int getBan() {
	      return ban;
	   }

	   public int getTotalScore() {
	      return totalScore;
	   }

	   @Override
	   // 기본정렬 총점
	   public int compareTo(Student o) {      
	      return  Integer.compare(o.totalScore, this.totalScore);
	   }
	   */
	   

} // class
