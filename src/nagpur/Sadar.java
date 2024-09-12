package nagpur;

import mumbai.Dadar;

public class Sadar extends Dadar {

	public static void main(String[] args) {

		System.out.println(Dadar.a); // PUBLIC called
		// System.out.println(Dadar.b); // DEFAULT not called
		// System.out.println(Dadar.c); // PRIVATE not called
		System.out.println(Dadar.d); // PROTECTED called bcoz of inheritance
		System.out.println(Sadar.a); // can be called by subclass name

	}

}
