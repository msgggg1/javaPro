package days10;

import java.util.Random;

/**
 * @author msg
 * @date 2025. 2. 14. - 오전 9:54:08
 * @subject
 * @content
 */

public class practice {

	public static void main(String[] args) {
		
		int n = 10;
		int share, rest ;
		String binary = "";
		while (share != 0) {
			share = n / 2;
			rest = n % 2;
			n = rest;
			binary = rest + binary;
		} //  while
		
		System.out.println(binary);
		
	} // main
	

} // class
