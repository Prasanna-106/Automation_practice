package constructor_scope;

public class Nokia {
	
	public static void main(String[] args) {
		Apple p = new Apple(); //apple class object created for public
		
		Apple q = new Apple(25);//apple class object created for default variable
		
	//	Apple r = new Apple(20,'j'); //private scope for same class
		
		Apple s = new Apple("string"); //protected

		System.out.println(p.a);
		System.out.println(q.a);
	//	System.out.println(r.a);
		System.out.println(s.a);
	}

}
