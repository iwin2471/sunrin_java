import java.io.File;

public class FileExam2 {
	public static void main(String[] args) {
		File f = new File("c:/windows/system.ini");
		String res = null;
		if(f.isFile()) res="����";
		else if(f.isDirectory()) res="���丮";
		System.out.println(f.getName()+"�� "+res+"�Դϴ�");
	}
}
