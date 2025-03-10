package days25;

import java.io.File;

/**
 * @author msg
 * @date 2025. 3. 10. - 오후 4:31:44
 * @subject File 클래스
 * @content
 */
public class Ex10_03 {

	public static void main(String[] args) {
		// 
		String currentDirectory = System.getProperty("user.dir");
		File parent = new File(currentDirectory);

		// [문제] \\javaPro 폴더 안에 있는 .dat 파일들만 조회
		File[] list = parent.listFiles();
		for (int i = 0; i < list.length; i++) {
			File f = list[i];
			if (f.isFile()) {
				int idx = f.getName().lastIndexOf(".");
			    String ext =  f.getName().substring(idx);
			     if (ext.equals(".dat")) {
					System.out.println(f.getName());
				} // if
			} // if
		} // for i
		
	} // class
	
} // main
