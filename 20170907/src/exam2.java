import java.util.StringTokenizer;

public class exam2 {
	public static void main(String[] args) {
		String s = "����/���ͳ�/����б�/��/���";
		StringTokenizer st = new StringTokenizer(s, "/");
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());
	}
}
