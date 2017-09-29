package placement.company.app.my_app;

import java.util.ArrayList;

public class Menu {
	private static ArrayList<Item> menuItemList=new ArrayList<Item>();
	
	public Menu() {
		
	}

	public ArrayList<Item> getMenuItemList() {
		return menuItemList;
	}

	public void setMenuItemList(ArrayList<Item> menuItemList) {
		Menu.menuItemList = menuItemList;
	}
	
	public String addItem(Item i) {
		Menu.menuItemList.add(i);
		return "Item hads been added to the Menu Succesfully.";
	}
	public ArrayList<Item> getStarters() {
		ArrayList<Item> starters=new ArrayList<Item>();
		ArrayList<Item> menuItemList2 = Menu.menuItemList;
		for (int i = 0; i < menuItemList2.size(); i++) {
			Item each = menuItemList2.get(i);
			if(each.getItemCategory().trim().replace(" ", "").equalsIgnoreCase("starters")) {
				starters.add(each);
			}
		}
		return starters;
	}
	public ArrayList<Item> getMainCourse() {
		ArrayList<Item> mainCourse=new ArrayList<Item>();
		ArrayList<Item> menuItemList2 = Menu.menuItemList;
		for (int i = 0; i < menuItemList2.size(); i++) {
			Item each = menuItemList2.get(i);
			if(each.getItemCategory().trim().replace(" ", "").equalsIgnoreCase("maincourse")) {
				mainCourse.add(each);
			}
		}
		return mainCourse;
	}
	public ArrayList<Item> getDesserts() {
		ArrayList<Item> desserts=new ArrayList<Item>();
		ArrayList<Item> menuItemList2 = Menu.menuItemList;
		for (int i = 0; i < menuItemList2.size(); i++) {
			Item each = menuItemList2.get(i);
			if(each.getItemCategory().trim().replace(" ", "").equalsIgnoreCase("desserts")) {
				desserts.add(each);
			}
		}
		return desserts;
	}
	public void displayMenu() {
		System.out.println("Welcome!");
		System.out.println("Starters:");
		ArrayList<Item> starters=getStarters();
		for(int i=0;i<starters.size();i++) {
			Item each=starters.get(i);
			System.out.println("No. : "+each.getItemId()+", Name: "+each.getItemName()+" Price: "+each.getItemPrice());
		}
		starters=getMainCourse();
		for(int i=0;i<starters.size();i++) {
			Item each=starters.get(i);
			System.out.println("No. : "+each.getItemId()+", Name: "+each.getItemName()+" Price: "+each.getItemPrice());
		}
		starters=getDesserts();
		for(int i=0;i<starters.size();i++) {
			Item each=starters.get(i);
			System.out.println("No. : "+each.getItemId()+", Name: "+each.getItemName()+" Price: "+each.getItemPrice());
		}
	}
	public Item getItem(int itemId) {
		Item item = null;
		for(Item each: Menu.menuItemList) {
			if(each.getItemId()==itemId) {
				item=each;
				break;
			}
		}
		return item;
	}
}
