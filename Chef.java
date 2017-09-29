package placement.company.app.my_app;

public class Chef {
	
	public void recieveOrder(Order o) {
		System.out.println("I am the Chief chef");
		System.out.println("Receiving the order..");
		System.out.println("Please wait few minutes...");
		o.setOrderStatus("Order Received");
		System.out.println("Your Orde is :");
		for(Item each: o.getOrder()) {
			System.out.println("Item : "+each.getItemName());
		}
	}
	
	public void prepareOrder(Order o) {
		System.out.println("Preparing the Order. Please wait few minutes...");
		o.setOrderStatus("Preparation in Process");
	}

}
