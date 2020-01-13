class Hi implements Runnable{
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println("Hi");
			try { Thread.sleep(1000); } catch(Exception e) {}
		}
	}
}

class Hello implements Runnable{
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println("Hello");
			try { Thread.sleep(1000); } catch(Exception e) {}
		}
	}
}

public class MultithreadingInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hi obj = new Hi();
		Hello obj1 = new Hello();
		
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj1);
		
		t1.start();
		t2.start();
	}

}
