interface Demo{
	void abc();
	
	default void show() {
		System.out.println("SHow stuff");
	}
	
	static void show2() {
		System.out.println("Show 2");
	}

}

class Implementor implements Demo{
	public void abc() {
		System.out.println("abc method");
	}
}

public class DefaultDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo obj = new Implementor();
		obj.show();
		obj.abc();
		
		Demo.show2();
	}

}
