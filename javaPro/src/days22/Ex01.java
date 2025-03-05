package days22;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

import days22.Ex01.Person;

/**
 * @author msg
 * @date 2025. 3. 5. - 오전 10:02:35
 * @subject
 * @content
 */
public class Ex01 {

	public static void main(String[] args) {
		
		/*[5]
		 * 
		 * 
		 * */
		
		//[6]
		ArrayList list = new ArrayList();
		Person p1 = new Person();
		p1.name ="홍";
		p1.age = 20;
		Person p2 = new Person("김",	25);
		Person p3 = new Person("이",	27);
		
		// String <- comparable : 이미 정렬 기능 구현되어있음.
		/*[6-1]    익명클래스
		list.sort( new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.name.compareTo(o2.name);
				// return o1.age - o2.age;
			}
		});
		*/
		
		//[2] Person 기본 정렬 기능: 오름차순 정렬
//		list.sort(null);
		System.out.println(list);
		
	} // main
}// 침ㄴㄴ

	class Person implements Comparable<Person>{ // 비교, 정렬 기능 포함되어있는 클래스라는 뜻
		
		String name;
		int age;
		
		public Person(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}

		public Person() {
		}

		@Override
		public String toString() {
			return "Person [name=" + name + ", age=" + age + "]";
		}

		// 기본 정렬 구현
		@Override
		public int compareTo(Person o) {

			return this.name.compareTo(o.name);
		}
		
		
		
	} // class
