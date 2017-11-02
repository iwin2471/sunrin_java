package tostring;

public class search {
	public static void main(String[] args) {
		SearchMax ref = new SearchMax();
		ref.printMax();
		ref.printMax(34, 3, 3, 2.5, 56);
		ref.printMax(new double[]{1,2,3});
	}
}

class SearchMax{
	public void printMax(){
		System.out.println("점겨받은 숫자없음");
	}

	public void printMax(double... num){
		double max = Double.NEGATIVE_INFINITY;

		 for (double i : num)
		      if (i > max) max = i;

		  System.out.println("가장큰값"+max);
	}
}
