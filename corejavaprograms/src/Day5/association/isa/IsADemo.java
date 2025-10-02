package Day5.association.isa;

public class IsADemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee("Bhuvanesh", 101, "IT");
		Manager manager = new Manager("Gajendran", 201, "Hr", 8);

		System.out.println(employee);
		System.out.println("---------------------------------------------------------------");
		System.out.println(manager);

	}

}
