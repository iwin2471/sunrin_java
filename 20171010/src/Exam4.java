
public class Exam4 {
	public static void main(String[] args) {
		String str = null;
		try {
			System.out.println("���ڿ�: "+str.length());
		} catch (NullPointerException e) {
			System.out.println("��ü ����"+e.getClass());
		}finally {
			System.out.println("���α׷� ������: �迬��");
		}
	}
}
