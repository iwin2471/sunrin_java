import java.util.ArrayList;
import java.util.Arrays;

public class DanTalk {
	private ArrayList<mark> array;
	private int index;
	

	public DanTalk(int size){
		array = new ArrayList<>();
		index = 0;
		System.out.println("��� ����");
	}
	
	public void enter(Object person){
		if(person instanceof mark){
			array.add((mark) person);
			index++;
			System.out.println(person+": ����");
		}else System.out.println(person+": ����Ұ�");
	}
	
	@Override
	public String toString() {
		return "DanTalk [array=" + array + "]";
	}
}
