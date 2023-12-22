/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		int maximum = Integer.parseInt (args[0]);
		int minimum = Integer.parseInt (args[1]);
		int random1 = ((int)((Math.random() * (maximum - minimum + 1)) + minimum));
		int random2 = ((int)((Math.random() * (maximum - minimum + 1)) + minimum));
		int random3 = ((int)((Math.random() * (maximum - minimum + 1)) + minimum));

		System.out.println(random1);
		System.out.println(random2);
		System.out.println(random3);

		System.out.print("The minimal number generated was " + Math.min(Math.min(random1, random2), random3));
	}
}