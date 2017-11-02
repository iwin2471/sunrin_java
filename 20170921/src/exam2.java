import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class exam2 {
	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("out.data");
		ObjectOutputStream out = new ObjectOutputStream(os);
		
		out.writeObject(new Member("김연준"));
		out.writeObject(new Member("이일훈"));
		out.writeObject(new String("문자열은 될까요?"));
		out.close();
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("out.data"));
		System.out.println(in.readObject());
		System.out.println(in.readObject());
		System.out.println(in.readObject());
		in.close();
	}

}
