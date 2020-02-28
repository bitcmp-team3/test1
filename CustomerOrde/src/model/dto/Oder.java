package model.dto;

public class Oder {
	private String  orderNo ; 
	private String custNo ;
	private String orderDate ;
	private int orderPrice ;
	private String deliveryCity ;
	private String deliveryOkDate ;
	private int amount ;
	private int discount ; 
	private int earnPoints ;
	
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getCustNo() {
		return custNo;
	}
	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public int getOrderPrice() {
		return orderPrice;
	}
	public void setOrderPrice(int orderPrice) {
		this.orderPrice = orderPrice;
	}
	public String getDeliveryCity() {
		return deliveryCity;
	}
	public void setDeliveryCity(String deliveryCity) {
		this.deliveryCity = deliveryCity;
	}
	public String getDeliveryOkDate() {
		return deliveryOkDate;
	}
	public void setDeliveryOkDate(String deliveryOkDate) {
		this.deliveryOkDate = deliveryOkDate;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public int getEarnPoints() {
		return earnPoints;
	}
	public void setEarnPoints(int earnPoints) {
		this.earnPoints = earnPoints;
	}
	@Override
	public String toString() {
		return "Oder [orderNo=" + orderNo + ", custNo=" + custNo + ", orderDate=" + orderDate + ", orderPrice="
				+ orderPrice + ", deliveryCity=" + deliveryCity + ", deliveryOkDate=" + deliveryOkDate + ", amount="
				+ amount + ", discount=" + discount + ", earnPoints=" + earnPoints + "]";
	}
	
}
