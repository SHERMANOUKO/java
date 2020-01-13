class Employee{
	int employeeId;
	int salary;
	static String ceo;
	
	public void show() {
		System.out.println(employeeId + " : " + salary + " : " + ceo);
	}
}

public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee sherman = new Employee();
		sherman.employeeId = 12;
		sherman.salary = 23000;
		
		Employee clifford = new Employee();
		clifford.employeeId = 11;
		clifford.salary = 21000;
		
		Employee.ceo = "Michael";
		
		sherman.show();
		clifford.show();
		
	}

}
