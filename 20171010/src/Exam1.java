
public class Exam1 {
	public static void main(String[] args) {
		System.out.println(1);
		try {
			System.out.println(2);
			System.out.println(1/0);
			System.out.println(3);
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("�������� �ͼ���");
		} catch (ArithmeticException ae) {
			// TODO: handle exception
			System.out.println("0���� ������ �����ϴ�.");
		} finally {
			System.out.println(4);
		}
		System.out.println(4);
	}
}
