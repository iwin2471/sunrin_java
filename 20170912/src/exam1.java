import java.io.File;

public class exam1 {
	public static void main(String[] args) {
		File file = new File("./src/exam1.java");
		System.out.println(file.getName());
		System.out.println(file.exists());
		System.out.println(file.isDirectory());
		System.out.println(file.length());
		File dir = new File(".");
		String[] list = dir.list();
		for(String s: list)
			System.out.println(s);
		File[] files = dir.listFiles();
		for(File f: files)
			System.out.println(f);
		
	}
}
