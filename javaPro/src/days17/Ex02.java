package days17;

import days16.Employee;
import days16.Regular;

/**
 * @author msg
 * @date 2025. 2. 25. - 오전 10:02:30
 * @subject
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
		//Employee emp1 = new Employee("권태정", "서울시 강남구", "010-1234-1234", "2020.01.01");//업캐스팅된 클래스만 다운캐스팅 할 수 있음.
		Employee emp1 = new Regular("김도훈", "서울시 당산동", "010-1272-2322", "2018.12.12", 3000000);
		emp1.dispEmpInfo();

		//Type mismatch: cannot convert from Employee to Regular
		// 클래스들 간의 형변화 - 업캐스팅(자동), 다운캐스팅(강제)
		//(변환하고자하는 자료형) cast 연산자로 강제 형변환
		// 업캐스팅된 클래스만 다운캐스팅 할 수 있음.
		Regular emp2 = (Regular) emp1; // 다운캐스팅 자동x
		
		System.out.println("end");
		
		
	} // main

} //class




