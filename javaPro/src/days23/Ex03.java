package days23;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author msg
 * @date 2025. 3. 6. - 오후 12:10:48
 * @subject Student 클래스 -> HashSet 컬렉션 클래스 저장.
 * @content [문제점] 파악 -> 해결
 * 						   hashCode() 오버라이딩. - 학번 같으면 같은학생으로 처리 -> 학번을 넘기기
 * 							학생 비교 eqauls() 오버라이딩 - 학번 가지고 비교
 * 							보통 항상 위 두가지 오버라이딩
 */
public class Ex03 {

	public static void main(String[] args) {
		
		HashSet<Student> hs = new HashSet<>();
		
		hs.add(new Student("2020001", "홍길동", 25));
		hs.add(new Student("2020002", "서영학", 25));
		hs.add(new Student("2020003", "최승우", 25));
		hs.add(new Student("2020001", "권태정", 25)); // 학번같으면 안됨// 해시코드값다른값 -> 다른객체, 학생으로 생각 // 학번으로 중복 체크 
		
		Iterator<Student> ir = hs.iterator();
		while (ir.hasNext()) {
			Student s = (Student) ir.next();
			System.out.println(s);
		}
		

	} // main

} // class

class Student{
	
	String no; // 학번 - 학생을 구별할 수 있는 고유한 필드
	String name; 
	int age;

	public Student() {
		super();
	}
	
	public Student(String no, String name, int age) {
		super();
		this.no = no;
		this.name = name;
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		return this.no.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student && obj != null) {
			Student s = (Student)obj;
			return this.no.equals(s.no);
		} // if
		return false;
	} 
	
	
}