package days25;

import java.io.File;
import java.io.IOException;

import com.util.FileUtil;

/**
 * @author msg
 * @date 2025. 3. 10. - 오후 3:23:33
 * @subject
 * @content
 */
public class Ex10 {

	public static void main(String[] args) throws IOException {
		// [File 클래스]
		String pathname = ".\\src\\days25\\Ex01.java"; // 상대경로
		
		//절대경로
//		String pathname= "C:\\Class\\JavaClass\\javaPro";
		File f = new File(pathname);
		
		if (f.exists()) { // 파일 존재 유무 체크
			System.out.println(f.isDirectory()); // false
			System.out.println(f.isFile());
			System.out.println(f.length() + "bytes"); //1681
		} // if
		
		System.out.println(File.separator); // 역슬래쉬( \ )경로 구분자
		System.out.println(File.pathSeparator); //  ; 
		
		// 
		String fileName = f.getName();
		System.out.println(fileName);
		
		//확장자		.java
		// 순수 확장자를 제외한 파일명 Ex01
		int pos = fileName.indexOf(".");
		String ext = fileName.substring(pos);
		System.out.println(ext);
		
		String baseFileName = fileName.substring(0,pos);
		
		//FileUtil.java
		System.out.println("=".repeat(50));
		System.out.println(fileName = FileUtil.getFileName(f));
		System.out.println(FileUtil.getBaseName(fileName));
		System.out.println(FileUtil.getExtension(fileName));
		
		System.out.println("=".repeat(50));
		//파일의 경로를 반환하는 메서드
		System.out.println(f.getPath());			// 경로
		System.out.println(f.getAbsolutePath());	// 절대경로
		System.out.println(f.getCanonicalPath());	// 표준경로   .....?
		
		System.out.println("=".repeat(50));
		
		File pf = f.getParentFile(); // parent: .\\src\\days25
		System.out.println(pf);
		System.out.println(f.getParent()); // ".\\src\\days25"
		
	} // main

} // class
