package mumbai;

public class Dadar {
	
public    static int a = 10;  // can be called through out project
		  static int b = 20;  // can be called within same package // DEFAULT  
private   static int c = 30;  // can be called within same class
protected static int d = 40;  // within same package & with inheritance outside package 
     

         public static void main(String[] args) {
        	 System.out.println(Dadar.a);
        	 System.out.println(b);
        	 System.out.println(c);
        	 System.out.println(d);
}

}
