package sample.programs.immutableExample;

public class MainClass {

	public static void main(String[] args) throws Exception {
	      Employee emp = new Employee("Chetan", 34, new Address("Anurup", "Old Sangvi", "Pune"));
	      Address address = emp.getAddress();
	      System.out.println(address);
	      address.setAddress("Eon IT park");
	      address.setAddressType("Office");
	      address.setCity("Pune");
	      System.out.println(emp.getAddress());
	   }

}
