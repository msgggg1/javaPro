package days26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("> 막대기의 수");
		int n = Integer.parseInt(br.readLine());
		System.out.print("> 각 막대기의 길이");
		String [] leng = br.readLine().split("\\s");
		//System.out.println(Arrays.toString(leng));
		
		int [] intLeng = new int [leng.length];
		for (int i = 0; i < leng.length; i++) {
			intLeng[i] = Integer.parseInt(leng[i]);
		} // for i
		
		cutting(intLeng);

	} // main

	private static void cutting(int[] intLeng) {
		int cnt = -1;
		while (cnt != 0) {
			cnt = 0;
			Arrays.sort(intLeng);
			int min = intLeng[0];
				for (int j = 1; j < intLeng.length; j++) {
				intLeng[j-1] = intLeng[j] - min;
				if (intLeng[j-1] != 0) {
					cnt++;
				} // if
				} // for j
				min = intLeng[0];
				System.out.println(cnt);
			
		} //  while
		
	}



} // class
