package days29;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author msg
 * @date 2025. 3. 14. - 오전 10:22:20
 * @subject
 * @content
 */
public class Ex03_02 {
	public static void main(String[] args) {
		/*
		// 클래스 배열 초기화
		Student[] stuArr = {
		         new Student("이자바", 3, 300),
		         new Student("김자바", 1, 200),
		         new Student("안자바", 2, 100),
		         new Student("박자바", 2, 150),
		         new Student("소자바", 1, 200),
		         new Student("나자바", 3, 290),
		         new Student("감자바", 3, 180)   
		      };
		
		// 1. 학생들의 이름만 뽑아서 List<String> 에 저장
		// of() ; Student[] -> Stream<Student> -> Stream<String> -> List<String>변환
		List<String> names = Stream.of(stuArr).map(Student::getName).collect(Collectors.toList());
		System.out.println(names); // [이자바, 김자바, 안자바, 박자바, 소자바, 나자바, 감자바]
		
		// 2. 스트림을 Student[] 배열 변환
		// 스트림이라고 가정
		//Object [] objArr = Stream.of(stuArr).toArray();
		Student [] stuArr2 = Stream.of(stuArr).toArray(Student[]::new); // student 배열로 변환
		for (Student s : stuArr2) System.out.println(s);
		
		// 3. Student[] -> Stream -> Map 변환
		 Map<String, Student> stuMap = Stream.of(stuArr).collect(Collectors.toMap(s->s.getName(), s->s));
		 Set<Entry<String, Student>>  se = stuMap.entrySet();
		 Iterator<Entry<String, Student>> ir =  se.iterator();
		 while (ir.hasNext()) {
			Map.Entry<String, Student> entry = ir.next();
			String name = entry.getKey();
			Student s = entry.getValue();
//			System.out.println(name + Arrays.toString(s));
			System.out.printf("%s : %s\n", name, s); 
		}
		 
		 // 1조: 학생 수 출력
		 // 2조: 총 totalScore 출력
		 // 3조: totalScore 최고점인 학생 정보 출력
		 // 4조: 학생 이름만 출력
		// 1조 : 학생수  출력
	      long count = Stream.of(stuArr).collect( Collectors.counting());
	      System.out.println("count="+count);
	      
	      // 2조 : 총 totalScore  출력
	      // [1]
	      long totalScoreSum = Stream.of(stuArr)
	                .collect(Collectors.summingInt(Student::getTotalScore));
	      System.out.println("총 totalScore: " + totalScoreSum);
	      // [2]
	      totalScoreSum = Stream.of(stuArr)
	                  .collect(Collectors.reducing(0, Student::getTotalScore, Integer::sum));
	      System.out.println("totalScore="+totalScoreSum);

	      // 3조 : totalScore 최고점인 학생 정보 출력
	      //[1]
	         System.out.println(
	        		  Stream.of(stuArr)
	                  .max((o1, o2) -> o1.totalScore - o2.totalScore)
	                  .get().name);
	       //[2]
	         Optional<Student> maxStu = Stream.of(stuArr).collect(Collectors.maxBy(Comparator.comparingInt(Student::getTotalScore)));
	         
	      // 4조 : 학생이름만 출력 
	         //[1]
	         List<String> name2 = Arrays.stream(stuArr)
	                 .map(Student::getName).collect( Collectors.toList());
	         System.out.println(name2);
	         //[2]
	         String nameConcat = Stream.of(stuArr).map(Student::getName).collect(Collectors.joining("</li><li>","<ol><li>","</li></ol>"));
	         System.out.println(nameConcat);
	         
	         // 모든 정보 얻어옴.
	         IntSummaryStatistics stat = Stream.of(stuArr)
                     .collect(Collectors.summarizingInt(Student::getTotalScore));
	         System.out.println(stat);
		 */
		
		
	} // main
} // class

/*
class Student implements Comparable<Student> {
	   String name;
	   int ban;
	   int totalScore; // 국어 + 영어 + 수학 0~300

	   Student(String name, int ban, int totalScore) { 
	      this.name =name;
	      this.ban =ban;
	      this.totalScore =totalScore;
	   }
	   
	   @Override
	   public String toString() { 
	      return String.format("[%s, %d, %d]", name, ban, totalScore).toString(); 
	   }
	   
	   // default -> 없어도됨.
	   String getName() { return name;}
	   int getBan() { return ban;}
	   int getTotalScore() { return totalScore;}

	   @Override
	   public int compareTo(Student s) {
	      return s.totalScore - this.totalScore;
	   }
	}
	*/
