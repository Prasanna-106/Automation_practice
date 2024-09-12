package constructor_scope;

public class Apple {

	public String a;

	// declaring variable 'a' with different access specifier

	public Apple() // public
	{
		a = "public variable with zero argument ";
	}

	Apple(int p)   // default
	{
		a = "default with int argument";
	}

	private Apple(int l, char k) // private with 2 argument
	{
		a = "private with argument";
	}

	protected Apple(String f) // protected
	{
		a = "protected with argument";
	}

	public static void main(String[] args) {

		Apple p = new Apple();
		Apple q = new Apple(25);
		Apple r = new Apple(20, 'j');
		Apple s = new Apple("string");

		System.out.println(p.a);
		System.out.println(q.a);
		System.out.println(r.a);
		System.out.println(s.a);

	}
}
