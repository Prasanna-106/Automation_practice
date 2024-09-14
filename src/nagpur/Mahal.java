package nagpur;

import mumbai.Dadar;

public class Mahal extends Dadar {

	public static void main(String[] args) {

		Dadar x = new Dadar(); // object created with Dadar class

		System.out.println(Dadar.a); // can be called by class name also

		System.out.println(x.a); // public called
//		 System.out.println(x.b); //DEFAULT not called
//		System.out.println(Dadar.c); //PRIVATE not called

		System.out.println(Mahal.d); // can be called bcoz it is static property
		Mahal m = new Mahal(); // objected created with same class name
		System.out.println(m.a); // PROTECTED not called no inheritance
 		System.out.println(Mahal.d); // can be called bcoz mahal class inherited

	}

}
