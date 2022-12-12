 
  public class Car {
  public static void main(String[] args) {
	Car name = new Car();                                      // object
	name.colour();
	name.Company();
   }

public void colour() {
	String colour1 = "black";
	String colour2 = "white";
	System.out.println("available colours are " + colour1 + " and "+colour2);
  }

static void Company() {
	String Brand = "Creta";
	int Launch = 2022;
	System.out.println(" my dream car is for now " + Brand + " which was launched in " + Launch );
    }

  }
