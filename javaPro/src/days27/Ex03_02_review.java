package days27;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class Ex03_02_review {
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
	
		list.forEach(t-> System.out.print(t + "/"));
		System.out.println();
		list.removeIf(t->t%2==0||t%3==0);
		list.forEach(t-> System.out.print(t + "/"));
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("one", "1");
		map.put("two", "2");
		map.put("three", "3");
		
		map.forEach((s,t)->System.out.println(s+"\n" + t));
	} // main

} // class
