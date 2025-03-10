package days25;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author msg
 * @date 2025. 3. 10. - 오후 3:48:30
 * @subject File 클래스 예제
 * @content
 */
public class Ex10_02 {

	public static void main(String[] args) {
		//파일탐색기 만들기
		String currentDirectory = System.getProperty("user.dir");
//		System.out.println(currentDirectory); // C:\Class\JavaClass\javaPro
		File parent = new File(currentDirectory);
		//System.out.println(parent.isDirectory()); // true
		
		String pattern = "yyyy-MM-dd a h:mm";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		// 파일 목록 + 하위 디렉토리 포함 String[]
		// String [] list = parent.list();
		File [] list = parent.listFiles();
		for (int i = 0; i < list.length; i++) {
//			System.out.println(list[i]);
			File f = list[i];
			String name = f.getName();
			long l = f.lastModified();
			long flength = f.length();
			
			System.out.printf("%s\t%s\t%s\n", f.isDirectory() ? "["+name+"]": name, 
					sdf.format(new Date(l)),f.isDirectory() ? "": (int)(Math.ceil((double)flength/1024))+"(KB)");
		} // for i
		
		

	} // main

} // class
