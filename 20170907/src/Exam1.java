import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Exam1 {
	public static void main(String[] args) throws Exception{
		FileInputStream fi = new FileInputStream("a.txt");
		FileOutputStream fo = new FileOutputStream("copy.txt");
		
		int inp;
		while((inp=fi.read()) != -1)
			fo.write(inp);
		fo.close();
		fi.close();
	}
}
