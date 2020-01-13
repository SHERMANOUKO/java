interface Writer{
	void write();
}

class Pen implements Writer{
	public void write() {
		System.out.println("Im a pen");
	}
}

class Pencil implements Writer{
	public void write() {
		System.out.println("Im a pencil");
	}
}

class Kit{
	public void doSomething(Writer p) {
		p.write();
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kit k = new Kit();
		Writer p = new Pen();
		Writer pc = new Pencil();
		
		k.doSomething(p);
		k.doSomething(pc);
	}
}