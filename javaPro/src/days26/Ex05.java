package days26;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

/**
 * @author msg
 * @date 2025. 3. 11. - 오후 12:11:48
 * @subject
 * @content
 */
public class Ex05 {

	public static void main(String[] args) {
		
		String parent = "C:\\temp\\";
		
		LocalDate now = LocalDate.now();
		//2025-03-11(화)
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd(E)");
		String strNow = now.format(dtf);
		parent += strNow;
		
		String fileName =".\\src\\days26\\1차_조편성.txt";
		
		String pathname = "";
		
		try (FileReader reader = new FileReader(fileName);
			BufferedReader br = new BufferedReader(reader);){
			String line = null;
			String regex = "\\s*[,:-]\\s*";
			while ((line = br.readLine()) != null) {
				String [] arr = line.split(regex);
				
				File f = null;
				for (int i = 1; i < arr.length - 1; i++) {
					pathname = String.format("%s\\%s(%s)\\%s", parent, arr[0], arr[arr.length-1], arr[i]);
					f= new File(pathname);
					System.out.println(f.mkdirs());
				       
				} // for i
				
			} //  while
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		/*
		String pathname = ".";
		File parent = new File(pathname);    
		
		Calendar c = Calendar.getInstance();
		String pattern ="yyyy년 M월 dd일 (E요일)";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		
		try (FileReader reader = new FileReader(".\\src\\days26\\1차_조편성.txt");
			BufferedReader br = new BufferedReader(reader);){
			
			String line ;
			int no =1;
			while ((line = br.readLine()) != null) {
				String [] group = line.split(":|\\[팀장\\]|,|-");
				//System.out.println(Arrays.toString(group));
				
				for (int i = 1; i < group.length - 1; i++) {
					File f = new File(parent, String.format("%s\\%d조\\%s", sdf.format(c.getTime()) ,no, group[i]) );
				       f.mkdirs();
				} // for i
				no++;
				
			} //  while
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		      
		System.out.println("end");
*/

	} // main

} // class
