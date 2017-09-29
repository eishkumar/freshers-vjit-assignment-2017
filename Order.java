package placement.company.app.my_app;

import java.util.ArrayList;

public class Order {

	private int orderId;
	private String orderStatus;
	private int billId;
	private ArrayList<Item> order = new ArrayList<Item>();

	public Order(int orderId) {
		this.setOrderId(orderId);
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public ArrayList<Item> getOrder() {
		return order;
	}

	public void setOrder(ArrayList<Item> order) {
		this.order = order;
	}

	public void addItemsToOrder(Item i) {
		this.order.add(i);
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public int getBillId() {
		return billId;
	}

	public void setBillId(int billId) {
		this.billId = billId;
	}

}
