class Ab{
	public void show() {
		System.out.println("In A show");
	}
}

public class AnonymousClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ab obj = new Ab() {
			public void show() {
				System.out.println("Im the best");
			}
		};
		
		obj.show();
	}

}
