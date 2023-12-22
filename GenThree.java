public class GenThree {
	public static void main(String[] args) {
		int b = Integer.parseInt (args[0]);
		int a = Integer.parseInt (args[1]);
		int random1 = ((int)((Math.random() * (b - a + 1)) + a));
		int random2 = ((int)((Math.random() * (b - a + 1)) + a));
		int random3 = ((int)((Math.random() * (b - a + 1)) + a));

		System.out.println(random1);
		System.out.println(random2);
		System.out.println(random3);

		System.out.print("The minimal number generated was " + Math.min(Math.min(random1, random2), random3));
	}
}