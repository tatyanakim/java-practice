package day25_Arrays;

public class Shopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] products = { "Timberland Shoes", "H&M Shirts", "Swatch Watch", "Gucci Bag", "Addidas Socks" };
		double[] prices = { 120.0, 5.99, 150.50, 3000.5, 6.99 };
		int[] itemsid = { 12345, 12346, 12347, 12348, 12349 };

		// print count of products
		System.out.println("Product count: " + products.length);

		// check if product prices and ids have same count
		if (products.length == prices.length && products.length == itemsid.length) {
			System.out.println("Shopping list looks good");
		} else {
			System.out.println("Smth is wrong in this list");
			return;
		}

		// loop thru product and print each one in separate line no need certain
		// position

		// For each loop:
		for (String p : products) {
			System.out.println(p);
		}

		// for loop

		for (int i = 0; i < prices.length; i++) {
			System.out.println("Prices of products: " + prices[i]);
		}

		// reversed
		for (int i = prices.length - 1; i >= 0; i--) {

			System.out.println(prices[i]);
		}
		// print wjole items report
		double totalPrices = 0.0;

		for (int i = 0; i < products.length; i++) {

			System.out.println("Item " + (i + 1) + ": " + itemsid[i] + products[i] + "- " + "$ " + prices[i]);
			System.out.println(totalPrices);
		}
		

		// Find out which is more expensive without sorting

		int maxIndex = 0;
		double tempMax = 0.00;
		for (int i = 0; i < prices.length; i++) {

			if (prices[i] > tempMax) {
				tempMax = prices[i];
				maxIndex = i;
				System.out.println(tempMax + " " + products[maxIndex]);

			}
			
			int minIndex = 0;
			double tempMin = 0.00;
			for (int i2 = 0; i2 < prices.length; i2++) {

				if (prices[i2] < tempMin) {
					tempMin = prices[i2];
					minIndex = i2;
					System.out.println(tempMin + " " + products[minIndex]);

			
				} 
				}
		}
	}

	}
