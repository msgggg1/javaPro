package days02;

public class Ex05_05 {

	public static void main(String[] args) {
		// 실수 : float(4), double(8)
		
		//float avg = 78.99;
		// Type mismatch: cannot convert from double to float ->자료형 double로 잡힘
		// float avg = 78.99F; // 리터럴 + 접미사(F or f)
		
		//float avg = 0.; // 리터럴 + 접미사(F or f)
		//Type mismatch: cannot convert from double to float
		//float avg = 0.f; // 리터럴 + 접미사(F or f)
		//float avg = 0f; // 실수 float형 0 -----> 같은 0이여도 저장된 값이 다 다름. 다른값으로 생각
		
		// Type mismatch: cannot convert from long to int
		//int i =10L; // 접미사 L or l --> long형 10이라는 뜻
		//Type mismatch: cannot convert from double to int
		//int i = 10D; // d,D 접미사 ---> double형 10
		
		// 0 0L 0F 0D (저장된 용량,방식 다 다름)

	}//main

}//class
