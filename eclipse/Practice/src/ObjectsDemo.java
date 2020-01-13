class Calc{
	int num1;
	int num2;
	int result;
	
	public Calc() {
		num1 = 2;
		num2 = 3;
	}
	
	public Calc(int n) {
		num1 = n;
		num2 = n;
	}
	
	public Calc(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void perfom(){
		result = num1 + num2;
	}
}


public class ObjectsDemo {
	
	public static void main(String[] args) {
		Calc obj = new Calc();
		obj.perfom();
		System.out.println(obj.result);
		
		Calc obj2 = new Calc(6);
		obj2.perfom();
		System.out.println(obj2.result);
		
		Calc obj3 = new Calc(7, 8);
		obj3.perfom();
		System.out.println(obj3.result);
	}
}
