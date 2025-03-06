package days23;

import java.util.TreeSet;

/**
 * @author msg
 * @date 2025. 3. 6. - 오후 2:31:40
 * @subject
 * @content
 */
public class Ex05_02 {

	public static void main(String[] args) {

		TreeSet<String> ts = new TreeSet<String>();
		ts.add("abc");      ts.add("alien");   	ts.add("bat");
		ts.add("car");      ts.add("Car");      ts.add("disc");  // Car ascii 68
		ts.add("dance");  	ts.add("dzzz");     ts.add("dzzzz");
		ts.add("elephant"); ts.add("elevator"); ts.add("fan");
		ts.add("flower");
		
		System.out.println(ts);
		
		// [abc, alien, bat, car]
		System.out.println(ts.subSet("a", "d"));
		
		// [car, dance, disc]
		System.out.println(ts.subSet("c", "dzzz")); // 빠르다.

	} // main

} // class
