import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.StringTokenizer;

public class exam1 {
	static double sum(String s1, String s2){
		int tmp = 0;
		tmp += Integer.parseInt(s1);
		tmp += Integer.parseInt(s2);
		return (double)tmp;
	}
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new FileReader("data.txt"));
		BufferedWriter fw = new BufferedWriter(new FileWriter("result.txt"));
		String input;
		System.out.println("성명    주소    수학    영어   합계    평균");
		while (true) {
			input = br.readLine();
			if(input == null)
				break;
			String arr[] = input.split("\\s");
			double sum = sum(arr[2], arr[3]);
			String result = arr[0]+"    "+arr[1]+"   "+arr[2]+"    "+arr[3]+"    "+(int)sum+"    "+sum/2+"\n";
			System.out.print(result);
			fw.write(result);
		}
		fw.close();
	}

}
