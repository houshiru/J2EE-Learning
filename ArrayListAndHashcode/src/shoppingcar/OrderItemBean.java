package shoppingcar;

public class OrderItemBean {
	private McBean macbean;
	private int count;
	public McBean getMacbean() {
		return macbean;
	}
	public void setMacbean(McBean macbean) {
		this.macbean = macbean;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public double getTotalPrice() {
		return macbean.getNprice()*count;
	}
}
