package keywords;
//interface #child2
//you can call many interface classes by using extends keywords if parent class is also interface

public interface IN1 extends IN2,IN3 {
default void m2() {
	System.out.println("interface m2");
    } 
  }
