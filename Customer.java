package placement.company.app.my_app;

public class Customer {
	int customerId;
	private String CustName;
	private int OrderId;
	
	public Customer(int customerId,String custName) {
		// TODO Auto-generated constructor stub
		setCustomerId(customerId);
		setCustName(custName);
	}
	public String getCustName() {
		return CustName;
	}
	public void setCustName(String custName) {
		CustName = custName;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getOrderId() {
		return OrderId;
	}
	public void setOrderId(int orderId) {
		OrderId = orderId;
	}

}
