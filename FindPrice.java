//chapter 8 practice exercise

import javax.swing.*;

public class FindPrice
{
	public static void main(String[] args)
	{
		//variables and constants
		final int NUMBER_OF_ITEMS = 10;
		int[] validValues = {101, 108, 201, 213, 266, 304, 311, 409, 411, 412};
		double[] prices = {0.29, 1.23, 3.50, 0.75, 6.79, 3.19, 0.99, 2.89, 5.26, 8.00};
		String[] itemNames = {"Gumball", "Candy Bar", "Gatorade", "Newspaper", "Ham Sandwich", "Soda", "Coffee", "Bagel", "Wrap", "Large Salad"};
		String strItem;
		String productName = "";
		int itemOrdered;
		double itemPrice = 0.0;
		boolean isValidItem = false;

		//input phase
		strItem = JOptionPane.showInputDialog(null, "Enter the item number you wish to order: ");
		itemOrdered = Integer.parseInt(strItem);

		//processing phase
		for(int x = 0; x < validValues.length; ++x)
		{
			if(itemOrdered == validValues[x])
			{
				isValidItem = true;
				itemPrice = prices[x];
				productName = itemNames[x];
				break;
			}//END if statement
		}//END for loop

		//output phase
		if(isValidItem = true)
		{
			JOptionPane.showMessageDialog(null, "The price for item: " + itemOrdered + " which is " + productName + " is $" + itemPrice);
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Sorry, " + itemOrdered + " is not a valid item number!");
		}//END if/else statement
	}
}