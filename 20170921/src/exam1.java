
public class exam1 {
	public static void main(String[] args) {
		Student a = new Student("ÀÌÇå¿ì");
		Student b = new Student("ÀÌÀÏÈÆ");
		Tearcher c = new Tearcher("ÀÌÁ¤ÅÂ");
		
		DanTalk room = new DanTalk(24);
		
		room.enter(a);
		room.enter(b);
		room.enter(c);
		System.out.println(room);
	}
}
