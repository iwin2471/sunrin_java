import java.io.FileInputStream;

public class test2 {
	public static void main(String[] args) throws Exception {
		FileInputStream fi = new FileInputStream("a.txt");
		
		int inp;
		while((inp=fi.read()) != -1)
			System.out.print(inp);
	}
}
