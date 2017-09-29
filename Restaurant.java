package placement.company.app.my_app;

public class Restaurant {
	
	static int NoOfTables;
	static int NoOfChairs;
	static int OccupiedTables=0;
	static int OccupiedChairs=0;
	private String RestaurantName;
	static HostHostess h=new HostHostess();
	public Restaurant(String restaurantName,int noOfTables,int noOfChairs) {
		// TODO Auto-generated constructor stub
		Restaurant.setNoOfTables(noOfTables);
		Restaurant.setNoOfChairs(noOfChairs);
		this.setRestaurantName(restaurantName);
	}
	public void initiateOrder(Manager m) {
		HostHostess.setManager(m);
		h.checkMemberCount(this);
	}
	public static int getNoOfTables() {
		return NoOfTables;
	}
	public static void setNoOfTables(int noOfTables) {
		NoOfTables = noOfTables;
	}
	public static int getNoOfChairs() {
		return NoOfChairs;
	}
	public static void setNoOfChairs(int noOfChairs) {
		NoOfChairs = noOfChairs;
	}
	public static int getOccupiedTables() {
		return OccupiedTables;
	}
	public static void setOccupiedTables(int occupiedTables) {
		OccupiedTables = occupiedTables;
	}
	public static int getOccupiedChairs() {
		return OccupiedChairs;
	}
	public static void setOccupiedChairs(int occupiedChairs) {
		OccupiedChairs = occupiedChairs;
	}
	public String getRestaurantName() {
		return RestaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		RestaurantName = restaurantName;
	}
}
