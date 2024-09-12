package constructor_access;

import constructor_scope.Apple;


public class Vivo extends Apple { 
	
	public static void main(String[] args) {
		
	// Creating Object of apple class to call the variable 'a'
		
	 Apple p = new Apple(); //only this will get called bcoz it is public
	 //	Apple q = new Apple(25); //default
	//Apple r = new Apple(20,'j'); //private
	//Apple s = new Apple("hello"); // inheritance condition will not work in constructor
	
	
	 System.out.println(p.a);
	//System.out.println(q.a);
	//System.out.println(r.a);
	//System.out.println(s.a); 

	}
}
