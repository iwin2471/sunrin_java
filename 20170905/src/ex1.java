import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ex1 {
	public static void main(String[] args) throws Exception{
		FileInputStream fi = new FileInputStream("a.jpg");
		FileOutputStream fo = new FileOutputStream("b.jpg");
		int inp = 0;
		while(inp != -1){
			inp = fi.read();
			fo.write(inp);
		}
		
		fo.close();
		fi.close();
	}
}
