import java.io.FileReader;
import java.io.FileWriter;

public class charexam3 {
	public static void main(String[] args) throws Exception{
	    FileReader fr = new FileReader("duke1.jpg");
		FileWriter fw = new FileWriter("copy.jpg");
		
		int inp;
		while((inp=fr.read()) != -1)
			fw.write(inp);
		fr.close();
		fw.close();
	}
}
