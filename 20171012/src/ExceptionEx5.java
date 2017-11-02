import java.util.Scanner;
public class ExceptionEx5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		String op;
		int result = 0;
		
		System.out.println("첫번째 수를 입력하세요:");
		num1 = sc.nextInt();
		System.out.println("계산할연산자 입력하세요:");
		op = sc.next();
		System.out.println("두번째 수를 입력하세요:");
		num2 = sc.nextInt();
		try {
			switch (op) {
			case "+": result = num1+num2;break;
			case "-": result = num1-num2;break;
			case "*": if(num1==0 || num2==0) throw new Exception("0으로 곱하면 어차피 0이됨"); result = num1*num2;break;
			case "/": if(num2 ==0) throw new Exception("0으로 나누면 안됨"); result = num1/num2;break;
			}
			if(result < 0) throw new Exception("음수가 발생했어요.");
			System.out.println(num1 + op + num2 + "=" + result);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("예외발생");
			System.out.println(e.getMessage());
		}finally {
			sc.close();
		}
	}
}
