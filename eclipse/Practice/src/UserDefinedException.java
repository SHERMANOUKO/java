
public class UserDefinedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 9;
		int j = 20;
		
		try {
			int k = i / j;
			if(k == 0)
				throw new MyException("J should not be zero");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
