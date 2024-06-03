package protoype;

public class Employee implements Prototype<Employee> {

	private String name;
	private int age;
	private Address address;

	public Employee(Employee employee) {
		this.name = employee.name;
		this.age = employee.age;
		this.address = new Address(address);
	}

	public Employee(String name, int age, Address address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public Employee() {
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Address getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", address=" + address + "]";
	}

	public Employee clone() {

		return new Employee(this);
	}

}
