
public class Excecption {
	public static void method() throws NumberFormatException{
		int n = Integer.parseInt("number");
		System.out.println(n);
	}
	public static void main(String[] args) {
		try {
			method();
		} catch (NumberFormatException e) {
			System.out.println("NumberFormat예외가 발생함");
		}
	}
}
