import java.io.BufferedWriter;
import java.io.FileWriter;

public class exam7 {
	public static void main(String[] args) throws Exception {
		BufferedWriter fw = new BufferedWriter(new FileWriter("c.txt"));
		fw.write("�������ͳݰ���б�");
		fw.newLine();
		fw.write("�����");
		fw.newLine();
		fw.write("2�г�");
		fw.newLine();
		fw.close();
	}

}
