import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class charExam6 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String arr[] = new String[2];
		
		String input;
		for (int i = 0; i < 2; i++) {
			System.out.print("Enter the String(���� 1��) :");
			input = br.readLine();
			arr[i] = input;
		}
		
		String sum = Integer.parseInt(arr[0])+Integer.parseInt(arr[1])+"";
		String ave = ((double)Integer.parseInt(arr[0])+(double)Integer.parseInt(arr[1]))/2+"";
		System.out.println(arr[0] +"+"+ arr[1] + "=" +sum);
		System.out.println("��� ="+ave);
		br.close();
	}
}
