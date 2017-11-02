import java.io.FileReader;
import java.io.FilterReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

class MyFilter extends FilterReader{
	protected MyFilter(Reader in) {
		super(in);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int read() throws IOException {
		int input;
		return (input= super.read()) == -1 ? input: Character.toUpperCase((char)input);
	}
}

public class CharExam01 {
	public static void main(String[] args) throws Exception{
		MyFilter my = new MyFilter(new InputStreamReader(System.in));
		int input = (int)Double.NEGATIVE_INFINITY;
		while(input == -1){
			input = my.read();
			System.out.print((char)input);
		}
	}
}
