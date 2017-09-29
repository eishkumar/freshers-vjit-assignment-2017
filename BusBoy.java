package placement.company.app.my_app;

public class BusBoy {
	public void serveWater(Customer c) {
		System.out.println("Serving the water to Mr. / Mrs. "+c.getCustName());
	}
	
	public void cleanTables(Customer c) {
		System.out.println("Hi! I am the bus boy.");
		System.out.println("Cleaning the table to Mr. / Mrs. "+c.getCustName());
	}
	
	public void bringFood(Customer c) {
		System.out.println("Bringing the food from chef to Mr. /Mrs. "+c.getCustName());
	}
	
	public void layCloth(Customer c) {
		System.out.println("Laying the cloth to Mr. / Mrs. "+c.getCustName());
	}
	
	public void serveFood(Customer c) {
		System.out.println("Serving the Food to Mr. / Mrs. "+c.getCustName());
	}
	public void greetings(Customer c) {
		System.out.println("Thank you for having food here sir.."+c.getCustName());
	}

}
