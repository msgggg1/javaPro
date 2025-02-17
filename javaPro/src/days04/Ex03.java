package days04;

/**
 * @author msg
 * @date 2025. 2. 6. - 오전 11:19:28
 * @subject [문제] 연산자
 * @content [] 인덱스(index) 연산자
 */
public class Ex03 {

	public static void main(String[] args) { // String 배열 args
		// 한 학생의 국어점수를 저장할 변수를 선언.
		int kor ;
		// 100명 학생의 국어점수를 저장할 변수를 선언.(전제조건: 자료형 모두 같다)
		// int kor001, 002, 003 ---
		
		// 1. 배열(array) : 동일한 자료형을 메모리상에 연속적으로 놓이게 한 것(정의)
		//  ㄴ 참조형(reference type)
		// 2. 배열 선언 및 생성 형식
		//	  자료형 [] 변수명;  ==  자료형 [] 배열명;
		//	  (자료형 변수명 [];) 가능하나 안 씀
		// 	  new -> heap(동점영역) 생성 (실제 기억공간 할당하라)
		//	  new 자료형[배열크기];
		// 자료형 [] 배열명 = new 자료형[배열크기];
		// 
		
		int [] kors; // int 배열 kors
		//new int[100];
		kors = new int[100];
		// 배열 크기
		// 배열명.length
		int size = kors.length;
		System.out.println(size);
		
		kors[0] = 90;
		kors[1] = 80;
		
		System.out.println(kors[0]);
		System.out.println(kors[1]);
		
		/*
		 	heap
		 	 0       1      2 ----99  : 첨자값(index) 
		 아래첨자값(LowerBound)=0    윗첨자값(Upperbound)	
		                               배열크기 - 1  
		                               배열명.length    		   stack (기억공간)
		 	[4바이트][4바이트][4바이트] 100개			               [주소값] -> 주소기억할만큼 잡힘, 값저장x, 주소값 저장
		 	 0번째 요소(Element) 1번째 ---- : 배열명[첨자값]: 기억공간 이름
		 	0x100번지 104   108					                kors 변수, 참조변수, 배열명
		 * 맨 앞: 배열의 시작주소                                     [0x100] 시작 주소
		 * 
		 * */
		

	} // main

} // class
