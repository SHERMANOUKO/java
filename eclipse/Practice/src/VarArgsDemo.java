class Calculate{
	public int add(int ...y) {
		int sum = 0;
		for(int n: y) {
			sum += n; 
		}		
		return sum;
	}
}


public class VarArgsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculate obj = new Calculate();
		System.out.println(obj.add(1, 2, 3, 4));
		System.out.println(obj.add(1, 2, 4));
	}

}
