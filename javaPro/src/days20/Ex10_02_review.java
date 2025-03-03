package days20;

import java.text.DecimalFormat;
import java.text.ParseException;

public class Ex10_02_review {

	public static void main(String[] args) {
		String strMoney = "₩3,257,600.00";	
		String pattern = "\u00A4#,###.00";
		DecimalFormat df = new DecimalFormat(pattern)	;
		try {
			Number n = df.parse(strMoney);
			int money = n.intValue();
			System.out.println(money);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	} // main

} // class
