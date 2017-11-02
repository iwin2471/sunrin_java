import java.io.BufferedReader;
import java.io.FileReader;

public class exam5 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new FileReader("a.txt"));
		
		String input;
		while (true) {
			input = br.readLine();
			if(input == null)
				break;
			System.out.println(input);
			
		}
	}
}
