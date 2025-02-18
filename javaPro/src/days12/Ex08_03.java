package days12;

import java.security.DrbgParameters.NextBytes;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex08_03 {

	public static void main(String[] args) {
		//[문제] 3반 30명 학생 이름/국/영/수 입력받아서 출력
		
		
		String [][] names = new String [3][30];
		int [][] kors = new int [3][30];
		int [][] engs = new int [3][30];
		int [][] mats = new int [3][30];
		
		for (int i = 0; i < mats.length; i++) {
			System.out.printf("[%d반]\t[이름]\t[국어]\t[영어]\t[수학]\n", i+1);
			for (int j = 0; j < mats[i].length; j++) {
				names[i][j] = getName();
				kors[i][j]	= getScore();
				engs[i][j]	= getScore();
				mats[i][j]	= getScore();
				
				System.out.printf("[%d번]\t%s\t%d\t%d\t%d\n"
						,j+1, names[i][j], kors[i][j],engs[i][j],mats[i][j]);
			} //for
			System.out.println();
		} //for
		
	} // main

	private static int getScore() {
		int score = (int)(Math.random()*101);
		return score;
	}

	private static String getName() {
		char [] nameArr = new char [3];
		for (int i = 0; i < nameArr.length; i++) {
			nameArr[i]=(char)
					(Math.random()*('힣'-'가'+1)+'가');		
		} //for
		String name = new String(nameArr);
		
		return name;
	} // getName

} // class
