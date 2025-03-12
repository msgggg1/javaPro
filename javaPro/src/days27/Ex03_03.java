package days27;

import java.util.Arrays;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.IntUnaryOperator;

/**
 * @author msg
 * @date 2025. 3. 12. - 오전 11:26:19
 * @subject
 * @content
 */
public class Ex03_03 {

	public static void main(String[] args) {
		
		IntSupplier s = () -> (int)(Math.random()*100)+1;
		IntConsumer c = i -> System.out.println(i+",");
		IntPredicate p = i -> i%2 == 0;
		IntUnaryOperator op = i -> i/10*10;
				
		int [] arr = new int [10];
		
		makeRandomList(s,arr);
		System.out.println(Arrays.toString(arr));
		

	} // main

	private static void makeRandomList(IntSupplier s, int[] arr) {
		// TODO Auto-generated method stub
		
	}

} // class
