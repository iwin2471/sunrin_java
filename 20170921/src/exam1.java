
public class exam1 {
	public static void main(String[] args) {
		Student a = new Student("�����");
		Student b = new Student("������");
		Tearcher c = new Tearcher("������");
		
		DanTalk room = new DanTalk(24);
		
		room.enter(a);
		room.enter(b);
		room.enter(c);
		System.out.println(room);
	}
}
