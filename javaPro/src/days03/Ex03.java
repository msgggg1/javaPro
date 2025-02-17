package days03;

/**
 * @author msg
 * @date 2025. 2. 5. - 오전 10:47:28
 * @subject
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		// [시험] 두 기억공간의 값을 바꾸기
		//     -> 반드시 임시 기억공간 필요 (temp), 처리순서 지켜져야
		int x =10, y = 20;
		System.out.printf("> x=%d, y=%d\n", x,y);
		
		//y=x;
		//x=y;
		
		//System.out.printf("> x=%d, y=%d\n", x,y); // x=10, y=10 //y=x에서 이미 y=10이 됨.
		
		// 처리순서
		// 1)temp =x
		// 2) x=y
		// 3) y=temp
		{
		int temp = x; //10
		x = y;        //20
		y = temp;     //10
		} // temp 기억공간 사라지게 하기 위함
		
		System.out.printf("> x=%d, y=%d\n", x,y);
		
	}// main

}// class
