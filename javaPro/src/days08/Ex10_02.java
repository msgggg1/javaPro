package days08;


/**
 * @author msg
 * @date 2025. 2. 12. - 오후 4:45:36
 * @subject 두 기억공간의 값 바꾸기
 * 			매개변수를 가지고 메서드를 호출하는 방법
 * 			1) Call By Name : 이름만 가지고 호출 ex) drawLine()
 * 			2) Call By Value : 값만 넘김
 * 			3) Call By Reference: 참조타입자료형(배열,클래스, 인터페이스)/매개변수타입이 참조타입
 * 
 * 
 * @content
 */
public class Ex10_02 {

	public static void main(String[] args) {
		/*
	       *  heap                           stack
	       *                             
	       *                              main(){
	       *                                [10] [20]
	       *                                 x    y      지역변수
	       *  m[0] m[1]                             
	       *  [10][20]                          [ 0x100 ] 
	       *  0x100                              m  배열선언
	       *                              }                   
	       *                              
	       *                              swap(int [] m){
	       *                                 [0x100]
	       *                                   m
	       *                              }
	       * */ 

		
		int x =10, y = 20;
		int [] m = {x,y};
		 
		System.out.printf("> x=%d, y=%d\n", m[0],m[1]);

		
		swap(m); // call by reference
		System.out.printf("> x=%d, y=%d\n", m[0],m[1]); 

	} // main

	
	private static void swap(int [] m) {
		
		System.out.printf("> swap x=%d, y=%d\n",  m[0], m[1]);

		int temp = m[0]; 
		m[0] = m[1];        
		m[1] = temp;     
		System.out.printf("> swap x=%d, y=%d\n",  m[0], m[1]);

		
	}

} // class
