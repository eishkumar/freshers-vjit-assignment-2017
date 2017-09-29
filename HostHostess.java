package placement.company.app.my_app;

//import java.lang.reflect.Member;
import java.util.Scanner;

public class HostHostess {
	private int Members;
	private int AvailableChairs;
	private int AvailableTables;
	private int TableOccupied;
	private int ChairOccupied;
	static int CustomerId=0;
	private static Manager manager;
	Scanner sc = new Scanner(System.in);
	static CustomerQueue cq=new CustomerQueue();

	public HostHostess() {

	}
	public void checkMemberCount(Restaurant r) {
		System.out.println("Please Share your name: ");
		Customer c=new Customer(HostHostess.CustomerId+1, sc.next() );
		System.out.println("Can you please share the number of persons:");		
		Members = sc.nextInt();
		setAvailableChairs(Restaurant.getNoOfChairs());
		setAvailableTables(Restaurant.getNoOfTables());
		setOccupiedTables(Restaurant.getOccupiedTables());
		setChairOccupied(Restaurant.getOccupiedChairs());
		checkTableAvailability(r,c);
	}

	public void checkTableAvailability(Restaurant r,Customer c) {

		if (Members < AvailableChairs && ChairOccupied < AvailableChairs && TableOccupied < AvailableTables) {
			if (Members % 4 == 0) {
				for (int i = Members; i % 4 == 0 && i > 0; i -= 4) {
					Restaurant.setOccupiedTables(Restaurant.getOccupiedTables() + 1);
					Restaurant.setOccupiedChairs(Restaurant.getOccupiedChairs() + 4);
				}
			} else if (Members < 4) {
				Restaurant.setOccupiedTables(Restaurant.getOccupiedTables() + 1);
				Restaurant.setOccupiedChairs(Restaurant.getOccupiedChairs() + Members);
			} else {
				for (int i = Members; i % 4 != 0 && i > 0; i -= 4) {
					Restaurant.setOccupiedTables(Restaurant.getOccupiedTables() + 1);
					Restaurant.setOccupiedChairs(Restaurant.getOccupiedChairs() + 4);
					if (i > 0 && i < 4) {
						Restaurant.setOccupiedTables(Restaurant.getOccupiedTables() + 1);
						Restaurant.setOccupiedChairs(Restaurant.getOccupiedChairs() + (i % 4));
					}
				}
			}
		} else {
			System.out.println("No Available Tables and Chairs. Please wait..!");
			cq.addQueue(c);
		}
		if(Restaurant.getOccupiedChairs()>AvailableChairs && Restaurant.getOccupiedTables()>AvailableTables) {
			System.out.println("No Available Tables and Chairs. Please wait..!");
			cq.addQueue(c);
			Restaurant.setOccupiedChairs(ChairOccupied);
			Restaurant.setOccupiedTables(TableOccupied);
		}
		else {
			Manager m=HostHostess.getManager();
			m.takeOrder(c);
		}
		// r.setOccupiedTables(TableOccupied+1);
		// r.setOccupiedChairs(ChairOccupied+Members);

		// return null;

	}

	public int getAvailableChairs() {
		return AvailableChairs;
	}

	public void setAvailableChairs(int availableChairs) {
		AvailableChairs = availableChairs;
	}

	public int getAvailableTables() {
		return AvailableTables;
	}

	public void setAvailableTables(int availableTables) {
		AvailableTables = availableTables;
	}

	public int getOccupiedTables() {
		return TableOccupied;
	}

	public void setOccupiedTables(int tableOccupied) {
		TableOccupied = tableOccupied;
	}

	public int getChairOccupied() {
		return ChairOccupied;
	}

	public void setChairOccupied(int chairOccupied) {
		ChairOccupied = chairOccupied;
	}
	public static Manager getManager() {
		return manager;
	}
	public static void setManager(Manager manager) {
		HostHostess.manager = manager;
	}

}
