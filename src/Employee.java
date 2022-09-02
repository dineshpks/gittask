

public class Employee {

	private void empId(String Name) {
		System.out.println("Employee Name : "+Name);
	}
	
	private void empId(int Id) {
		System.out.println("Employee Id : "+Id);
	}
	
	private void empId(long age) {
		System.out.println("Employee Age : "+age);
	}
	
	public static void main(String[] args) {
		
		Employee E = new Employee ();
		E.empId(31576l);
		E.empId("Dinesh");
		E.empId(25);

		
	}
}
