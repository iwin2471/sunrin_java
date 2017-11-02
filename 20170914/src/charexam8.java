import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class charexam8 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("c.txt"));
		BufferedWriter fw = new BufferedWriter(new FileWriter("copy2.txt"));
		
		String input;
		while (true) {
			input = br.readLine();
			if(input == null)
				break;
			fw.write(input);
			fw.newLine();
		}
		br.close();
		fw.close();
	}
}
