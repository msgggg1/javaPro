package days12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class practice {

	public static void main(String[] args) {
		
		int [] m = { 3,5,2,4,1 };

		
//		List<Integer> list = List.of(3,5,2,4,1,6);
//		int index = list.indexOf(2);
//		System.out.println("> index = " + index);
		// [2] 2 가 있는 위치를 찾아서 100을 삽입
			
//		// 3. (암기) 람다와 스트림
		int index = Arrays.stream(m).boxed().collect(Collectors.toList()).indexOf(2);
		System.out.println("> index = " + index);

		
//		m = Arrays.copyOf(m, m.length+1);
//		System.out.println(Arrays.toString(m));
//		
//		for (int i = m.length-2; i >= index; i--) {
//			m[i+1] = m[i];
//		} //for
//		m[2] = 100;
//		System.out.println(Arrays.toString(m));
		
		int [] temp = new int [m.length+1];
		System.arraycopy(m, 0, temp, 0, index);
		System.arraycopy(m, index, temp, index+1, m.length-index);
		m = temp;
		m[index] = 100;
		System.out.println(Arrays.toString(m));
		
		index = 2;
		temp = new int [m.length - 1];
		System.arraycopy(m, 0, temp, 0, index);
		System.arraycopy(m, index+1, temp, index, m.length-1-index);
		m = temp;
		System.out.println( Arrays.toString(m) );
		
		
		
//		// [문제]  다시 100 삭제
//		// [3, 5, 2, 4, 1, 6]
//		index = 2 ;  // 위치가 2인 100정수를 삭제 
//		temp = new int[m.length-1];
//		System.arraycopy(m, 0, temp, 0, index);
//		System.arraycopy(m, index+1, temp, index, m.length-1- index);
//		// System.arraycopy(m, index+1, temp, index, temp.length - index);
//		m = temp;
//		System.out.println( Arrays.toString(m) );

	} // main

} // class
