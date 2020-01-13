class Outer{
	int a;
	
	public void show() {
		System.out.println("In outer");
	}
	
	class Inner{
		public void display() {
			System.out.println("IN display");
		}
	}
	
	static class Inner2{
		public void display() {
			System.out.println("In display static");
		}
	}
}


public class InnerClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer obj = new Outer();
		obj.show();
		
		Outer.Inner obj2 = obj.new Inner();
		obj2.display();
		
		Outer.Inner2 obj3 = new Outer.Inner2();
		obj3.display();
	}

}
