package days06;

import java.util.Arrays;
import java.util.Random;

public class Ex02 {

	public static void main(String[] args) {
	
		// [암기] 람다와 스트림
		// Math.random()
		// Random 클래스
		new Random().ints(1, 46).distinct().limit(6).forEach(System.out::println);
		
		    

	} //main

} //class
