package CrExercises;

/*@Phrancis here's a hint, let's implement not
static int not(int a)
{
    // ??
}*/

class NotTest {

	public static int not(int a) {
		int b = 1 - a;
		if (b != 1 && b != 0) {
			System.out.println("Value of 'b' cannot be reconciled to 0 or 1.");
			return b;
		} else { 
			return b;
		}
	}

	public static void main(String[] args) {
		int a = 0;
		System.out.print(not(a));
	}
}