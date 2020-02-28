package model.dto;

public class CustomerOder {
	private String custNo ;
	private String  orderNo ; 
	private int amount ;
	public CustomerOder() {
		// TODO Auto-generated constructor stub
	}
	public CustomerOder(String custNo, String orderNo, int amount) {
		super();
		this.custNo = custNo;
		this.orderNo = orderNo;
		this.amount = amount;
	}
	public String getCustNo() {
		return custNo;
	}
	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "CutomerOder [custNo=" + custNo + ", orderNo=" + orderNo + ", amount=" + amount + "]";
	}
	
}
