package days24;

import java.util.ArrayList;

/**
 * @author msg
 * @date 2025. 3. 7. - 오후 2:24:02
 * @subject
 * @content
 */
public class Ex08_02 {

	public static void main(String[] args) {
		
		/*
		Box box = new Box();
		box.setItem(100);
		int item = box.getItem();
		System.out.println(item);
		
		Box2 box2 = new Box2();
		box2.setItem(3.14);
		double item2 = box2.getItem();

		Box3 box3 = new Box3();
		box3.setItem("문자열");
		String item3 = box3.getItem();
		*/
		
		/* Object item
		Box box = new Box();
		box.setItem(100);
		int item = (int) box.getItem();        // 다운캐스팅
		System.out.println(item);
		
		Box box3 = new Box();
		box.setItem("문자열");
		String item3 = (String) box.getItem(); // 다운캐스팅
		*/
		
		Box<Integer> box1 = new Box<>();
		box1.setItem(100);
		int item = box1.getItem(); //다운캐스팅 필요없다. 
		System.out.println(item);
		
		Box<String>	box2 = new Box<>();
		box2.setItem("문자열");
		String item2 = box2.getItem(); //다운캐스팅 필요없다. 
	    System.out.println(item2);
	    
	    /*
	    ArrayList list = new ArrayList(); // 제네릭 지우면 기본형으로 Object 잡힘
	    list.add(100);
	    list.add("문자열");
	    list.add(3.14);
	    list.add('A');
	    list.add(true);
	    
	    int a = (int) list.get(0); // 다운캐스팅해야함.
		*/
	    
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    // -> int 값만 줄 수 있음. 
		
	} // main

} // class

//제네릭 클래스 선언 - 컴파일 시에 타입 확인
// ㄴ 클래스 명 뒤에 <T>을 붙이면 된다. 
// ㄴ  T : 타입변수 도는 타입 매개변수라고
//	 Type == 자료형
//   key
//   Value
//   Element 등 아무거나 대문자 쓰면됨
// Box		원시타입
// Box<T> 	제네릭 클래스, T의 Box, T Box라고 읽으면 된다. 
class Box<T>{
	
	private T item; // 쓸때마다 다운캐스팅
	
	public T getItem() {
		return item;
	}
	
	public void setItem(T item) {
		this.item = item;
	}
	/*
class Box{
	
	private Object item; // 쓸때마다 다운캐스팅
	
	public Object getItem() {
		return item;
	}
	
	public void setItem(Object item) {
		this.item = item;
	}
	*/

/* 자료형 하나하나 box 만듦 ex) char  short float   Person 등등
class Box{
	
	private int item;
	
	public int getItem() {
		return item;
	}
	
	public void setItem(int item) {
		this.item = item;
	}
	
}
class Box2{
	
	private double item;

	public double getItem() {
		return item;
	}

	public void setItem(double item) {
		this.item = item;
	}
	
}
class Box3{
	
	private String item;
	
	public String getItem() {
		return item;
	}
	
	public void setItem(String item) {
		this.item = item;
	}
	*/
	
}
