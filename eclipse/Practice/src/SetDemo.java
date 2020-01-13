import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> values = new HashSet<>();
		values.add(62);
		values.add(93);
		values.add(52);
		values.add(93);
		
		for(int i: values) {
			System.out.println(i);
		}
		
		Set<Integer> treeValues = new TreeSet<>();
		treeValues.add(62);
		treeValues.add(93);
		treeValues.add(52);
		treeValues.add(93);
		
		for(int i: treeValues) {
			System.out.println(i);
		}
		
	}

}
