package swapping;

public class Reverse_swap {
	public static void main(String[] args) {

		int a[] = { 22, 45, 87, 69, 34, 75, 57};

		for (int i = 0; i < a.length; i++) {
			System.out.print( a[i] + "," );
		}
		System.out.println();

		int half = (a.length) / 2;
		int size = (a.length-1);
		
		for (int i = 0; i<= half; i++) {

			int c = a[i];
			a[i] = a[size  - i];
			a[size - i] = c;

		}

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ",");
		}
	}
}
