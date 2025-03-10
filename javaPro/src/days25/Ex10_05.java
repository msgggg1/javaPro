package days25;

import java.io.File;

/**
 * @author msg
 * @date 2025. 3. 10. - 오후 5:22:03
 * @subject
 * @content
 */
public class Ex10_05 {

	public static void main(String[] args) {
		// [문제] 
		//days25 폴더 안에 upload 폴도 유무 확인하고
		// 없으면 폴더 생성
		String pathname =".\\src\\days25";
		File parent = new File(pathname);
		
		File upload = new File(parent, "upload");
		
		// .\\src\\days25\\temp\\upload
		if (!upload.exists()) {
			// upload 폴더 생성
			//upload.mkdir();
			System.out.println(upload.mkdirs());
			 // 부모폴더까지/ temp도 없는 경우 
		} 
		else {
			System.out.println(upload.delete());
		}

	} // main

} // class
