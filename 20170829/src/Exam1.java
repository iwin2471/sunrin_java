
public class Exam1 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) 
			arr[i]=i+1;
		try {
			arr[10]=11;
		} catch (ArrayIndexOutOfBoundsException aro) {
			System.out.println("배열 인덱스 접근 초과");
		}
		System.out.println("still alive");
	}
}
