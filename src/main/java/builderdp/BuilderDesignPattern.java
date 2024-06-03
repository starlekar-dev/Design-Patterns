package builderdp;


public class BuilderDesignPattern{
	public static void main(String[] args) {
		
		
		Address address1 = new Address.AddressBuilder("Maharashtra").build();
		Employee emp1 = new Employee.EmployeeBuilder("Sai", 25).address(address1).build();
		
		System.out.println(emp1);
		
		
		
	}
}



