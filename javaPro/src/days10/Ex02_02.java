package days10;

/**
 * @author msg
 * @date 2025. 2. 14. - 오전 10:31:56
 * @subiect
 * @content
 */
public class Ex02_02 {

	public static void main(String[] args) {
		
		int money = 125760;
		int num, unit = 50000;
		boolean sw = false;
		
		while (unit >= 1) {
			num = money /unit ;
			System.out.printf("%d원: %d개\n", unit, num);
			money%= unit;
			unit /= ( sw ? 2 :5);
			sw = !sw;
				
		} //  while
		

	} // main

} // class
