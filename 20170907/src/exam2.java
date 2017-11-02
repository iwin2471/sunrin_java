import java.util.StringTokenizer;

public class exam2 {
	public static void main(String[] args) {
		String s = "선린/인터넷/고등학교/웹/운영과";
		StringTokenizer st = new StringTokenizer(s, "/");
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());
	}
}
