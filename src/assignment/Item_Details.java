package assignment;

import java.util.Scanner;

public class Item_Details {
	public static void execute() {
	

		Scanner i = new Scanner(System.in);
		System.out.println("Enter item name: ");
		String itemName = i.next();

		System.out.println("Enter item type");
		String itemType = i.next();

		System.out.println("Enter item Price");
		int itemPrice = i.nextInt();

		System.out.println("Enter item Quantity");
		int Quantity = i.nextInt();

		if (itemType.equals("Raw") || itemType.equals("raw")) {
			double RawPrice = (double) ((itemPrice * 15.5) / 100);
			System.out.println("Raw price is : " + RawPrice);
			System.out.println("Total price is " + (itemPrice + RawPrice));
			
		} 
		else if (itemType.equals("Manufactured") || itemType.equals("manufactured")) {

			double ManufacturedPrice = (double) ((itemPrice * 20.5) / 100);
			System.out.println("Manufactured price is : " + ManufacturedPrice);
			System.out.println("Total price is " + (itemPrice + ManufacturedPrice));
		} 
		else {
			System.out.println("Invalidinput type !");
		}
		
		System.out.println("ItemName is : " + itemName);
		System.out.println("Item type is : " + itemType);
		System.out.println("Item price is :" + itemPrice);
		System.out.println("Item quantity is " + Quantity);

	}

}
