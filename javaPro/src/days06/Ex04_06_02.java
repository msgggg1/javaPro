package days06;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Ex04_06_02 {

	public static void main(String[] args) {
		
		// 람다식과 스트림(Stream)
		int [] m = {10, 31, 98, 38, 68, 91, 95, 76, 27, 29};
			
		//int[] -> int 스트림 변환
		//OptionalInt max = IntStream.of(m).max();
		
		// getAsInt() : OptionalInt -> int
		//if (max.isPresent()) {
		//		System.out.println(max.getAsInt());
		//}

		//[2]
		// max = new Random().ints(0,101).limit(10).max();
		
		System.out.println(Arrays.toString(m));
		
		int max, min;
		max = min = m[0];
		
		for (int i = 1; i < m.length; i++) {
			Math.max(max, m[i]);
			Math.min(min, m[i]);
			
		} // for i
		
		System.out.println(max);
		System.out.println(min);
			
		
		

	} // main

} // class
