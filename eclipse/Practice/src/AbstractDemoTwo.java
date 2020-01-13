abstract class WriterMaterial{
	public abstract void write();
}

class PenMaterial extends WriterMaterial{
	public void write() {
		System.out.println("Im a pen");
	}
	
}

class PencilMaterial extends WriterMaterial{
	public void write() {
		System.out.println("Im a pencil");
	}
}

class KitMaterial{
	public void doSomething(WriterMaterial p) {
		p.write();
	}
}

public class AbstractDemoTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KitMaterial k = new KitMaterial();
		PenMaterial p = new PenMaterial();
		PencilMaterial pc = new PencilMaterial();
		
		k.doSomething(p);
		k.doSomething(pc);
	}

}
