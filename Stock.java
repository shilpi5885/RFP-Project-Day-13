/*Stock Account Management Program*/

package com.bridgelabz.demo;

public class Stock {

	private String stockName;
	private int numberOfShares;
	private double sharePrice;

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public int getNumberOfShares() {
		return numberOfShares;
	}

	public void setNumberOfShares(int numberOfShares) {
		this.numberOfShares = numberOfShares;
	}

	public double getSharePrice() {
		return sharePrice;
	}

	public void setSharePrice(double sharePrice) {
		this.sharePrice = sharePrice;
	}

	public double calculateEachStockValue() {
		return numberOfShares * sharePrice;
	}
}
