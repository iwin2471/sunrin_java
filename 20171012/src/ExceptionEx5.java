import java.util.Scanner;
public class ExceptionEx5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		String op;
		int result = 0;
		
		System.out.println("ù��° ���� �Է��ϼ���:");
		num1 = sc.nextInt();
		System.out.println("����ҿ����� �Է��ϼ���:");
		op = sc.next();
		System.out.println("�ι�° ���� �Է��ϼ���:");
		num2 = sc.nextInt();
		try {
			switch (op) {
			case "+": result = num1+num2;break;
			case "-": result = num1-num2;break;
			case "*": if(num1==0 || num2==0) throw new Exception("0���� ���ϸ� ������ 0�̵�"); result = num1*num2;break;
			case "/": if(num2 ==0) throw new Exception("0���� ������ �ȵ�"); result = num1/num2;break;
			}
			if(result < 0) throw new Exception("������ �߻��߾��.");
			System.out.println(num1 + op + num2 + "=" + result);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("���ܹ߻�");
			System.out.println(e.getMessage());
		}finally {
			sc.close();
		}
	}
}
