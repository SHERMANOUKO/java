import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> values = new ArrayList<>();
		values.add(203);
		values.add(401);
		values.add(109);
		values.add(918);
		
//		Comparator<Integer> c = new Comparator<Integer>(){
//			public int compare(Integer i, Integer j) {
//				return i%10>j%10 ? 1 : -1;
//			}
//		};
		
		Comparator<Integer> c = (i, j) -> i%10>j%10 ? 1 : -1;
		
		Collections.sort(values, c);
		System.out.println(values);
	}

}
