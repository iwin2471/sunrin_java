import java.io.IOException;
import java.util.Scanner;

public class StringSpeedcheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(">>");
		String line = sc.nextLine();
		
		while (true) {
			System.out.print("����: ");
			try {
				System.in.skip(System.in.available());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String sub = sc.nextLine();
			
			if(sub.trim().equals("�׸�")){
				System.out.println("�����մϴ�");
				break;
			}
				
			String subArr[] = sub.split(" ");
			if(subArr.length < 2)
				System.out.println("�߸��� ���ɾ��Դϴ�");
			
			if(subArr[1].substring(0, 1).equals("!")){
				subArr[1] = subArr[1].replace("!", "");
				System.out.println(subArr[0] + subArr[1]);
				line = line.replace(subArr[0], subArr[1]);
				System.out.println(line);
			}else System.out.println("�߸��� ���ɾ��Դϴ�");			
		}
	}
}