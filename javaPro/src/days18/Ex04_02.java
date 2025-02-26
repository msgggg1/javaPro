package days18;

import days16.Employee;
import days17.Car;
import days17.Engine;

/**
 * @author msg
 * @date 2025. 2. 26. - 오전 11:24:28
 * @subject
 * @content
 */
public class Ex04_02 {

	public static void main(String[] args) {
		  // Y_Engine -> Car 
	      Y_Engine engine = new Y_Engine();
	      Car tCar = new Car(engine);
	      // tCar.~~~
	      tCar.speedDown(100);
	      tCar.speedDown(10);
	      tCar.stop();
	      
	      System.out.println(" end ");
	      
	      Car tcar = new Car(new Engine() {
			
			@Override
			public void stop() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void moreFuel(int fuel) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void lessFuel(int fuel) {
				// TODO Auto-generated method stub
				
			}
		}); // 이 객체가 사라지면 무명 클래스 사라짐. 
	 
	    		  
	    //2.
	      Employee newTemp = new Employee() {
			
			@Override
			public int getPay() {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		
		
		
	     
	      

	   } // main

	} // class


	class Y_Engine implements Engine{
	    int speed;
	   
	   @Override
	   public void moreFuel(int fuel) {
	      speed += fuel * 0.5;
	   }

	   @Override
	   public void lessFuel(int fuel) {
	      speed -= fuel * 0.5;
	   }

	   @Override
	   public void stop() {
	       speed = 0;
	   }
	   
	}


