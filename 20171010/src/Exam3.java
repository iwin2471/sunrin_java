import java.util.Scanner;

public class Exam3 {
	public static void main(String[] args) {
		int [] arry = new int [3];
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		System.out.print("정수형 a값 입력:"); a = sc.nextInt();
		System.out.print("정수형 b값 입력:"); b = sc.nextInt();
		System.out.print("정수형 c값 입력:"); c = sc.nextInt();
		try {
			arry[c] = a/b;
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("배열의 인덱스를 벗어났음");
		} catch (ArithmeticException ae) {
			// TODO: handle exception
			System.out.println("0으로 나눌수 없습니다.");
		} finally {
			System.out.println("프로그램 개발자: 김연준");
		}
		sc.close();
	}
}
