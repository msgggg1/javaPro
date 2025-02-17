package days07;

public class Ex04_04 {

	public static void main(String[] args) {
		// 2 3 4   k=1   d=2
		// 5 6 7   k=2   d=5
		// 8 9     k=3   d=8
		   for (int k = 1; k <=3 ; k++) {
		         for (int i = 1; i <= 9; i++) {
		            for (int d = 3*k-1; d <= 3*k-1+2 && d < 10; d++) {  
//		               if (d==10) break;
		               System.out.printf("%d*%d=%2d ", d, i, d*i);
		            } // for d
		            System.out.println();
		         } // for i   
		         System.out.println();
		      } // for k
		   
//		   int n =3;
//		   if (n>3 && n <10) {
//			//if(n < 10) {}
//		} // if

	} // main

} // class
