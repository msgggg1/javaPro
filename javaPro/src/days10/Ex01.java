package days10;

public class Ex01 {

	public static void main(String[] args) {
		
		int n = 10;
		System.out.println(binaryConvert(n));


	}
	
	public static String binaryConvert(int n) {
	      
		int share = n, rest; // 몫, 나머지 변수
		String binary = "";
		while ( share != 0 ) {
			rest = share % 2;
			share = share / 2;
			binary = rest + binary;
		} // while
			
			// System.out.println( binary );
		//                  1010
		return String.format("%s%s"
				, "0".repeat( 8- binary.length()), binary);
	}
	
	
//	      int share, rest; // 몫, 나머지 변수
//	      String binary = "";
//	      while ( n != 0 ) {
//	         share = n / 2;
//	         rest = n % 2;
//	         System.out.println( rest );
//	         binary = rest + binary;
//	         n = share;
//	      } // while
//	      
//	      // System.out.println( binary );
//	      //                  1010
//	      return String.format("%s%s"
//	            , "0".repeat( 8- binary.length()), binary);
//	   }
	   
	
//	public static String binaryConvert(int dec) {
//	      int [] bin = new int[8];
//	      int s = bin.length-1;
//	      int mok = 0, nmg = 0;
//	      do {
//	         mok = dec/2;
//	         nmg = dec%2;
//	         bin[s--] = nmg;
//	         dec = mok;
//	      } while ( mok != 0 );
//	      System.out.println( Arrays.toString(bin)  );
//	      // return String.join("", String [] bin);
//	      return null;
//	   }

}
