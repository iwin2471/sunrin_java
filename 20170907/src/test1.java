import java.io.FileOutputStream;

public class test1 {
	public static void main(String[] args) throws Exception{
		FileOutputStream fo = new FileOutputStream("exam.txt");
		
		int inp;
		while((inp=System.in.read()) != -1)
			fo.write(inp);
		fo.close();
   }
}
