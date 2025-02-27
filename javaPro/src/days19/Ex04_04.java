package days19;

/**
 * @author msg
 * @date 2025. 2. 27. - 오후 12:07:49
 * @subject
 * @content
 */
public class Ex04_04 {

	public static void main(String[] args) {
		String path = "c:\\temp\\src\\days01\\Sample.java";
		
		String fileName ; //Sample.java	확장자를 포함한 파일명
		String ext; 		//.java		확장자만
		String baseFileName; //Sample 	확장자를 제거한 파일명

		int index = path.lastIndexOf("\\");
		System.out.println(index);
		fileName = path.substring(index+1);
		System.out.println(fileName);
		
		// split (String regex)
		// . : 임의의 모든 문자 -> \\.
		baseFileName = fileName.split("\\.")[0];
		ext = fileName.split("\\.")[1];
		
		System.out.println(baseFileName);
		System.out.println(ext);
	} // main

} // class
