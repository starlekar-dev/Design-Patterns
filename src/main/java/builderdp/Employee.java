package builderdp;

class Employee {

	private final String name;
	private final int age;

	private final String gender;
	private final Address address;

	public Employee(EmployeeBuilder builder) {
		super();
		this.name = builder.name;
		this.age = builder.age;
		this.gender = builder.gender;
		this.address = builder.address;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public Address getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", gender=" + gender + ", address=" + address + "]";
	}

	public static class EmployeeBuilder {

		public final String name;
		public final int age;
		public String gender;
		public Address address;

		public EmployeeBuilder(String name, int age) {
			this.name = name;
			this.age = age;
		}
		
		public EmployeeBuilder gender(String gender) {
			this.gender = gender;
			return this;
		}
		
		public EmployeeBuilder address(Address address) {
			this.address = address;
			return this;
		}
		
		public Employee build() {
			return new Employee(this);
		}
		
	}

}
