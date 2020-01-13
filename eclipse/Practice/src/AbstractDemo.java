abstract class Human{
	public abstract void eat();
	
	public abstract void walk();
}

class Man extends Human{
	public void eat() {
		
	}
	
	public void walk() {
		
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human obj = new Man();
	}

}
