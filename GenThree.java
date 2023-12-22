/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		double a = Integer.parseInt (args[0]);
		double b = Integer.parseInt (args[1]);
		double random1 = Math.random() * a;
		double random2 = Math.random() * a;
		double random3 = Math.random() * a;

		System.out.println(random1);
		System.out.println(random2);
		System.out.println(random3);

		System.out.print("The minimal number generated was " + Math.min(Math.min(random1, random2), random3));
	}
}
multiply by the range