import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class zip {
	public static void main(String[] args) throws Exception{
		File file = new File("java.zip");
		FileInputStream fi = new FileInputStream(file);
		ZipInputStream zi = new ZipInputStream(fi);
		
		FileOutputStream fo;
		
		int input;
		ZipEntry entry;
		
		while((entry=zi.getNextEntry()) != null){
			fo = new FileOutputStream(entry.getName());
			while((input=zi.read())!=-1)
				fo.write(input);
			zi.closeEntry();
			fo.close();
		}
		
		zi.close();
	}

}
