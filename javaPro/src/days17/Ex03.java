package days17;

import days16.Employee;
import days16.SalesMan;
import days16.Temp;

/**
 * @author msg
 * @date 2025. 2. 25. - 오전 10:25:38
 * @subject
 * @content
 */

public class Ex03 {

	public static void main(String[] args) {
		/*
		Employee emp3 = new SalesMan("박지웅","경기도 수원","010-","2015.1.15",5000000, 20 ,100000);
		
		// 1. 확인: 업캐스팅을 해도 실제 영업직 사원 객체의 사원 정보 출력하는 dispEmpInfo()메소드가 호출된다.
		emp3.dispEmpInfo();
		//emp3.getPay(); // 접근 못함
	*/
		
		//4. 임시직(Temp)객체 생성
		Temp emp4 = new Temp("박지웅","경기도 수원","010-","2015.1.15",15,200000);
		emp4.dispEmpInfo();
		
	} // main

} // class
