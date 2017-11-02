import java.io.FileReader;
import java.io.FileWriter;

public class exam2 {
		public static void main(String[] args) throws Exception{
		    FileReader fr = new FileReader("a.txt");
			FileWriter fw = new FileWriter("copy.txt");
			
			int inp;
			while((inp=fr.read()) != -1)
				fw.write(inp);
			fr.close();
			fw.close();
		}
}
