import java.io.File;

public class ex6 {
	public static void main(String[] args) {
		File f = new File(".");
		int dirC = 0 , fileC = 0;
		
		for(File fs: f.listFiles()){
			if(fs.isDirectory()) dirC++;
			else if(fs.isFile()) fileC++;
		}
		
		System.out.println(dirC +" " + fileC);
	}
}
