package placement.company.app.my_app;

import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
	private String managerName;
	private Menu menu = new Menu();
	private static int orderId = 0;
	private static int billId = 0;
	private static ArrayList<CashRegister> cRl=new ArrayList<CashRegister>();
	private Scanner sc = new Scanner(System.in);
	private char response;

	// private Scanner sc2;
	public Manager(String managerName) {
		this.setManagerName(managerName);
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public void createItems() {
		response = 'Y';
		// Menu menuTemp;
		System.out.println("Hello, Welcome! I am " + this.getManagerName());
		System.out.println("Creating Items...");
		for (; !(response == 'N' || response == 'n');) {
			System.out.println("Enter Item Name: ");
			String itemName = sc.next();
			System.out.println("Enter Item Price: ");
			float itemPrice = sc.nextFloat();
			System.out.println("Enter Item Category: ");
			String itemCategory = sc.next();
			System.out.println("Enter Item Id: ");
			int itemId = sc.nextInt();
			Item item = new Item(itemName, itemPrice, itemCategory, itemId);
			menu.addItem(item);
			System.out.println("Do you want to create some more items: (Y/N) :");
			response = sc.next().charAt(0);
			sc.reset();
		}
	}

	public void takeOrder(Customer c) {
		// TODO Auto-generated method stub
		this.getMenu().displayMenu();
		sc = new Scanner(System.in);
		System.out.println("Please Select the Items. Please give input through the No. given on the menu.");
		response = 'Y';
		Order o = new Order(++Manager.orderId);
		c.setOrderId(o.getOrderId());

		for (; !(response == 'N' || response == 'n');) {

			o.addItemsToOrder(this.getMenu().getItem(sc.nextInt()));
			System.out.println("Do you want to add some more items: (Y/N) :");
			response = sc.next().charAt(0);
			if (!(response == 'N' || response == 'n')) {
				System.out.println("Please Select the Items. Please give input through the No. given on the menu.");
			}
		}
		Chef chef = new Chef();
		chef.recieveOrder(o);
		chef.prepareOrder(o);
		BusBoy bb = new BusBoy();
		bb.cleanTables(c);
		bb.layCloth(c);
		bb.serveWater(c);
		bb.bringFood(c);
		bb.serveFood(c);
		bb.greetings(c);
		this.prepareBills(c,o);
	}

	public void takeComplaints() {

	}

	public void prepareBills(Customer c,Order o) {
		float sum=0;
		System.out.println("Generating the Bill....");
		for(Item each:o.getOrder()) {
			System.out.println("Name: "+each.getItemName()+" : "+each.getItemPrice());
			sum=sum+each.getItemPrice();
		}
		System.out.println("Your Bill is : Rs. "+sum);
		Manager.setBillId(++Manager.billId);
		CashRegister cr=new CashRegister(Manager.getBillId(), o.getOrderId(), sum);
		System.out.println("Thank you Mr. / Mrs. "+c.getCustName());
		System.out.println("Bill is registered with Bill Id: "+Manager.getBillId());
		Manager.getcRl().add(cr);		
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public static int getBillId() {
		return billId;
	}

	public static void setBillId(int billId) {
		Manager.billId = billId;
	}

	public static ArrayList<CashRegister> getcRl() {
		return cRl;
	}

	public static void setcRl(ArrayList<CashRegister> cRl) {
		Manager.cRl = cRl;
	}

}
