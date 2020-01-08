package createtype.l5prototypepattern;

public class ProtoTypeTest {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setAddress(new Address("wojia"));
		Customer customer1 = customer.clone();
		customer1.getAddress().setAddress("nijia");
		System.out.println(customer == customer1);
		System.out.println(customer.getAddress() == customer1.getAddress());
		System.out.println(customer.getAddress().getAddress()+":"+customer1.getAddress().getAddress());
	}

}
