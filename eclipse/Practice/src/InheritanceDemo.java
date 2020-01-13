class FindSum {
	public int add(int i, int j) {
		return i + j;
	}
}

class FindSumDiff extends FindSum{
	public int sub(int i, int j) {
		return i - j;
	}
}

public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindSumDiff obj = new FindSumDiff();
		int result = obj.add(12,  23);
		
		System.out.println(result);
		
		FindSumDiff obj2 = new FindSumDiff();
		int result2 = obj2.sub(12,  3);
		
		System.out.println(result2);
	}
}
