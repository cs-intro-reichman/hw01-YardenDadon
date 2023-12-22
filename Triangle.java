public class Triangle {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		int check1 = a + b;
		int check2 = b + c;
		int check3 = c + a;
		if (check1 > c && check2 > a) {
			System.out.println(a + ", " + b + ", " + c + ": true");}
		else if (check3 > b && check1 > c){
			System.out.println(a + ", " + b + ", " + c + ": true");}
			else {
			System.out.println(a + ", " + b + ", " + c + ": false");}
	}
}
