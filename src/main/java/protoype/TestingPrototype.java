package protoype;

public class TestingPrototype {

	public static void main(String[] args) {
		
		
		Employee e1 = new Employee("Sai", 25, new Address("Mumbai", 410206));
		System.out.println(e1);
		System.out.println(e1.hashCode());
		
		
//		Employee e2 = e1.clone();
//		System.out.println(e2);
//		System.out.println(e2.hashCode());
		
		
		
	}

}
