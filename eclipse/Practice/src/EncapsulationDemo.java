class Student{
	private int admNo;
	private String name;
	
	// Getters and setters
	
	public void setAdmNo(int r) {
		admNo = r;
	}
	
	public int getAdmNo() {
		return admNo;
	}
	
	public void setName(String r) {
		name = r;
	}
	
	public String getName() {
		return name;
	}
}


public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.setAdmNo(16122);
		
		System.out.println(s1.getAdmNo());
	}

}
