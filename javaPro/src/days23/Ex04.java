package days23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * @author msg
 * @date 2025. 3. 6. - 오후 12:25:00
 * @subject
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {
		int [] a = {1,2,3,4,5};
		int [] b = {4,5,6,7,8};

		// (문제2) a - b  차집합
		// (문제3) a ∩ b  교집합

		//(문제1) a U b 합집합 : 12345678
		//int [] c = new int[a.length + b.length];

		/*
		ArrayList<Integer> al = new ArrayList<Integer>();
		int i ; 
	    for ( i = 0; i < a.length; i++) {
	         //c[i] = a[i];
	         al.add(a[i]);
	      } // for i

//		 List<int[]> bt= Arrays.asList(b);
//	    ArrayList<Integer> bl = new ArrayList<Integer>(bt);
		 ArrayList<Integer> bl = new ArrayList<Integer>();
		 for (int j = 0; j < b.length; j++) {
	         //  b[j];
	         //if( Arrays.binarySearch(a, b[j]) < 0 )  c[i++] = b[j];
	         if( Arrays.binarySearch(a, b[j]) < 0 )  al.add( b[j] );
	      } // for i

	      // System.out.println( Arrays.toString( c ) );
	      System.out.println( al );
	}
		 */
		List<Integer> list = Arrays.stream(b)  // intStream
				.boxed()        // Stream<Integer>
				.collect(Collectors.toList()); // List<Integer>
		ArrayList<Integer> bl = new ArrayList<>(list);

		ArrayList<Integer> al = new ArrayList<Integer>();
		for ( int i = 0; i < a.length; i++) {
			al.add(a[i]);
		}
		ArrayList<Integer> bl = new ArrayList<Integer>();

		HashSet<Integer> hs = new HashSet<Integer>();
		hs.addAll(al);
		hs.addAll(bl);
		System.out.println(hs);

		//[1]
		//		ArrayList<Integer> al = new ArrayList<Integer>();
		//		int i ;
		//		for ( i = 0; i < a.length; i++) {
		////			c[i] = a[i];
		//			al.add(a[i]);
		//		} // for i
		//		for (int j = 0; j < b.length; j++) {
		//			if (Arrays.binarySearch(a, b[j])<0) {
		//				c[i++] = b[j];
		//			} // if
		//		} // for i
		//
		//		System.out.println(Arrays.toString(c));


		//		//(문제1) a U b 합집합 : 12345678
		//		int [] c = new int[a.length + b.length];
		//		int i ;
		//		for ( i = 0; i < a.length; i++) {
		//			c[i] = a[i];
		//		} // for i
		//		for (int j = 0; j < b.length; j++) {
		//			if (Arrays.binarySearch(a, b[j])<0) {
		//				c[i++] = b[j];
		//			} // if
		//		} // for i
		//
		//		System.out.println(Arrays.toString(c));

	} // main

} // class

//			for (int j = 0; j < a.length; j++) {
//				if (b[i] - a[j] == 0) c[a.length+i] = b[i];