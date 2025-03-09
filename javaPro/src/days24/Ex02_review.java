package days24;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Ex02_review {
		
	public static void main(String[] args) {
			
		HashMap<String, HashMap<String, String>> phoneBook = new HashMap<String, HashMap<String,String>>();
		
			
			
			
			
		} // main
		
} // class

	
	/*
	static HashMap<String, HashMap<String, String>> phoneBook = new HashMap<>();

	public static void main(String[] args) {
		
		addPhoneNo("친구", "사쿠야", "010-0221-1118");
		addPhoneNo(null, "성한빈", "010-0221-0606");
		
		printList();

	} // main

	private static void printList() {
		
		Set<Entry<String, HashMap<String, String>>> es = phoneBook.entrySet();
		Iterator<Entry<String, HashMap<String, String>>> it = es.iterator();
		while (it.hasNext()) {
			Entry<String, HashMap<String, String>> entry =  it.next();
			
			String groupName = entry.getKey();
			HashMap<String, String> groupMap = entry.getValue();
			System.out.printf("* %s [%d]\n",  groupName, groupMap.size() );
			
			Iterator<Entry<String, String>> ir2 = groupMap.entrySet().iterator();
			while (ir2.hasNext()) {
				Entry<String, String> entry2 = ir2.next();
				String tel = entry2.getKey();
				String name = entry2.getValue();
				System.out.printf("\t%s : %s\n", name, tel);
			} //while
			
		} //while
	}

	private static void addPhoneNo(String groupName, String name, String phoneNumber) {
		
		groupName = (groupName == null)? "기타":groupName;
		
		addGroup(groupName);
		HashMap<String, String> group = phoneBook.get(groupName);
		group.put(phoneNumber, name);
	}

	private static void addGroup(String groupName) {
		
		if (!phoneBook.containsKey(groupName)) {
			phoneBook.put(groupName, new HashMap<String, String>());
		} // if
		
	}

} // class
*/