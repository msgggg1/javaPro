package days08;


/**
 * @author msg
 * @date 2025. 2. 12. - 오후 4:45:36
 * @subject 두 기억공간의 값 바꾸기
 * 			매개변수를 가지고 메서드를 호출하는 방법
 * 			1) Call By Name : 이름만 가지고 호출 ex) drawLine()
 * 			2) Call By Value : 값만 넘김
 * 			3) Call By Reference: 참조타입자료형(배열,클래스, 인터페이스)
 * 
 * 
 * @content
 */
public class Ex10 {

	public static void main(String[] args) {
		
		int x =10, y = 20;
		System.out.printf("> x=%d, y=%d\n", x,y);

		/* swap 메서드 선언 + 호출
		{
			int temp = x; //10
			x = y;        //20
			y = temp;     //10
		} 
		*/
		swap(x,y);
		System.out.printf("> x=%d, y=%d\n", x,y); 

	} // main

	// Call By Value // 기억공간X, 실제 값만 넘김(10,20만) -> 매개변수를 참조타입으로 넘김
	private static void swap(int x, int y) {
		
		int temp = x; 
		x = y;        
		y = temp;     
		return ;
		
		
	}

} // class
