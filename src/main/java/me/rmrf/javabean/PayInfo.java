package me.rmrf.javabean;

import java.util.Date;

public class PayInfo {
	private Date buyMoment = null;
	private String buyItemName = null;
	private double buyItemPrice = 0D;
	public Date getBuyMoment() {
		return buyMoment;
	}
	public void setBuyMoment(Date buyMoment) {
		this.buyMoment = buyMoment;
	}
	public String getBuyItemName() {
		return buyItemName;
	}
	public void setBuyItemName(String buyItemName) {
		this.buyItemName = buyItemName;
	}
	public double getBuyItemPrice() {
		return buyItemPrice;
	}
	public void setBuyItemPrice(double buyItemPrice) {
		this.buyItemPrice = buyItemPrice;
	}
}
