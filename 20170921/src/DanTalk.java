import java.util.ArrayList;
import java.util.Arrays;

public class DanTalk {
	private ArrayList<mark> array;
	private int index;
	

	public DanTalk(int size){
		array = new ArrayList<>();
		index = 0;
		System.out.println("톡방 생성");
	}
	
	public void enter(Object person){
		if(person instanceof mark){
			array.add((mark) person);
			index++;
			System.out.println(person+": 입장");
		}else System.out.println(person+": 입장불가");
	}
	
	@Override
	public String toString() {
		return "DanTalk [array=" + array + "]";
	}
}
