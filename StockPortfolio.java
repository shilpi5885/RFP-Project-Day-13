/*Stock Account Management Program*/

package com.bridgelabz.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StockPortfolio {

	public static void calculateTotalStockValue(List<Stock> stocks) {
		double totalStockValue = 0;
		for (Stock stock : stocks) {
			double eachStockValue = stock.calculateEachStockValue();
			System.out.println("Stock value for " + stock.getStockName() + "  : " + eachStockValue);
			totalStockValue += eachStockValue;
		}
		System.out.println("Total stock value : " + totalStockValue);
	}

	public static void main(String[] args) {
		List<Stock> stocks = new ArrayList<Stock>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total number of stocks of different companies");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			Stock stock = new Stock();
			System.out.println("\nEnter stock name: ");
			stock.setStockName(sc.next());
			System.out.println("Enter number of shares: ");
			stock.setNumberOfShares(sc.nextInt());
			System.out.println("Enter price of each share");
			stock.setSharePrice(sc.nextDouble());
			stocks.add(stock);
		}
		calculateTotalStockValue(stocks);
		sc.close();
	}
}
