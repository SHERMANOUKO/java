// CHILD CLASS METHOD OVERIDES PARENT CLASS METHOD

class A{
	public void show() {
		System.out.println("In A");
	}	
}

class B extends A{
	
	@Override
	public void show() {
		System.out.println("In B");
	}
}

class C extends A{
	
	@Override
	public void show() {
		System.out.println("In C");
	}
}

public class OveridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj1 = new B();
		obj1.show();
		
		obj1 = new C();
		obj1.show();
	}

}
