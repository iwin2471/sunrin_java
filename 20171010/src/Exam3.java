import java.util.Scanner;

public class Exam3 {
	public static void main(String[] args) {
		int [] arry = new int [3];
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		System.out.print("������ a�� �Է�:"); a = sc.nextInt();
		System.out.print("������ b�� �Է�:"); b = sc.nextInt();
		System.out.print("������ c�� �Է�:"); c = sc.nextInt();
		try {
			arry[c] = a/b;
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("�迭�� �ε����� �����");
		} catch (ArithmeticException ae) {
			// TODO: handle exception
			System.out.println("0���� ������ �����ϴ�.");
		} finally {
			System.out.println("���α׷� ������: �迬��");
		}
		sc.close();
	}
}
