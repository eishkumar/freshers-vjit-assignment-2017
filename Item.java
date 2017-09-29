package placement.company.app.my_app;

public class Item {
	static private int NoOfItems = 0;
	private String itemName;
	private float itemPrice;
	private String itemCategory;
	private int ItemId;

	public Item(String itemName, float itemPrice, String itemCategory, int itemId) {
		Item.NoOfItems++;
		this.setItemName(itemName);
		this.setItemPrice(itemPrice);
		this.setItemCategory(itemCategory);
		this.setItemId(itemId);
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public float getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(float itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getItemCategory() {
		return itemCategory;
	}

	public void setItemCategory(String itemCategory) {
		this.itemCategory = itemCategory;
	}

	public static int getNoOfItems() {
		return NoOfItems;
	}

	public static void setNoOfItems(int noOfItems) {
		NoOfItems = noOfItems;
	}

	public int getItemId() {
		return ItemId;
	}

	public void setItemId(int itemId) {
		ItemId = itemId;
	}

}
