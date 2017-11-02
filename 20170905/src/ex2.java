import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ex2 {
	public static void main(String[] args) {		
		int inp = 0;
		while(inp != -1){
			inp = fi.read();
			fo.write(inp);
		}
		
		fo.close();
		fi.close();
	}
}
