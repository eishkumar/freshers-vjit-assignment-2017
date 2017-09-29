package placement.company.app.my_app;

import java.util.ArrayList;

public class CustomerQueue {
	private static int Queue=0;
	private static ArrayList<Customer> CustQue=new ArrayList<Customer>();
	public CustomerQueue() {
	}
	public void addQueue(Customer e) {
		CustomerQueue.getCustQue().add(e);
		CustomerQueue.setQueue(CustomerQueue.getQueue() + 1);
	}
	public void removeQueue() {
		CustomerQueue.setQueue(CustomerQueue.getQueue() - 1);
		CustomerQueue.getCustQue().remove(0);
		System.out.println("Available Customers in the Queue:"+CustomerQueue.getCustQue().size());
	}
	public static ArrayList<Customer> getCustQue() {
		return CustQue;
	}
	public static void setCustQue(ArrayList<Customer> custQue) {
		CustQue = custQue;
	}
	public static int getQueue() {
		return Queue;
	}
	public static void setQueue(int queue) {
		Queue = queue;
	}

}
