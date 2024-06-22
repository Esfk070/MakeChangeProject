package com.skilldistillery.makechange;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) 
	{

		
//		User Story #1
//		The user is prompted asking for the price of the item.
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the price: ");
		double price = keyboard.nextDouble();
		System.out.println("Price: " + price);
		
//		User Story #2
//		The user is then prompted asking how much money was tendered by the customer.
		
		System.out.println("How much money did the customer give: ");
		double moneyGiven = keyboard.nextDouble();
		System.out.println("The customer payed  " + moneyGiven);
		
//		User Story #3
//		Display an appropriate message if the customer provided too little 
//		money or the exact amount.	
		
		if (price > moneyGiven)
		{
			System.out.println("Error: Not enough money payed");
						
		}
		
//		User Story #4
//		If the amount tendered is more than the cost of the item, display the number of 
//		bills and coins that should be given to the customer. Denominations that are not 
//		used will not be displayed.
		else 
		{
			System.out.println("Calculate change owed...");
		}

		


		


		
		
		System.out.print("");

		
		keyboard.close();
		
	}	//Main

}
