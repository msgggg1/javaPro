package days22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex04_review {

	public static void main(String[] args) {
		
		String [] names = {"박예진", "양희동", "박정현", "김대원", "주정호", "이찬희"};
		// 1. String [] -> ArrayList 변환 

		//[1]
//		ArrayList list = new ArrayList();
//		for (int i = 0; i < names.length; i++) {
//			list.add(names[i]);
//		} //for
//		System.out.println(list);
		
		//[2]
		List list = Arrays.asList(names);
		System.out.println(list);
		ArrayList arrayList = new ArrayList(list);
		System.out.println(arrayList);
		
		// [ArrayList -> String[] 변환.]
		//[1]
//		String [] sArr = new String [arrayList.size()];
//		for (int i = 0; i < sArr.length; i++) {
//			sArr[i] = (String) arrayList.get(i);
//		} //for
//		System.out.println(Arrays.toString(sArr));

		Object [] objArr = arrayList.toArray();
		for (Object obj : objArr) {
			String name = (String) obj;
					System.out.println(name);
		}
		//[3]
//		String [] arr = (String[]) arrayList.toArray(String[]::new);
//		System.out.println(Arrays.toString(arr));
		
	} // main

} // class
