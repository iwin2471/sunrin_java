import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class fa {
	public static void main(String[] args) throws Exception{
		File file = new File("a.txt");
		FileWriter fw = new FileWriter(file);
		PrintWriter pw = new PrintWriter(fw);
		pw.printf("%d + %d = %d", 1, 2, (1+2));
		pw.println("�������� �ڰ� �־�� �ݿ�....");
		pw.print("��찡 ������ �����.");
		pw.close();		
	}
}