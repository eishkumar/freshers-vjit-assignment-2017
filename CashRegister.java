package placement.company.app.my_app;

public class CashRegister {
	private int billId;
	private int orderId;
	private float billAmount;
	
	public CashRegister(int billId,int orderId,float Amount) {
		this.setBillAmount(Amount);
		this.setBillId(billId);
		this.setOrderId(orderId);
	}

	public int getBillId() {
		return billId;
	}

	public void setBillId(int billId) {
		this.billId = billId;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public float getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(float billAmount) {
		this.billAmount = billAmount;
	}

}
