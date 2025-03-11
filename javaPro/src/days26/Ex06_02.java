package days26;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 * @author msg
 * @date 2025. 3. 11. - 오후 2:17:04
 * @subject 1) 직렬화 	( Serialization)
 * 			     ㄴ 객체(Object)를 입출력하기 위해서 스트림으로 만드는 것.
 * @content	2) 역직렬화	( Deserialization)
 * 			     ㄴ 스트림 -> 객체 만드는 것.

 */
public class Ex06_02 {

	public static void main(String[] args) {
		
		String name = ".\\src\\days26\\UserInfo.ser";
		
		try (FileInputStream fis = new FileInputStream(name);
			ObjectInputStream ois = new ObjectInputStream(fis)){
			//u1
			UserInfo u1 = (UserInfo)ois.readObject();
			UserInfo u2 = (UserInfo)ois.readObject();
			ArrayList<UserInfo> list = (ArrayList<UserInfo>)ois.readObject();
			
			System.out.println(u1);
			System.out.println(u2);
			System.out.println(list);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	} // main

} // class
