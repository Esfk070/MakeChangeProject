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
			double change = moneyGiven - price;
			System.out.println(change);
			int count20;
			int count10;
			int count5;
			int count1;
			int countQuarter;
			int countDime;
			int countNickel;
			int countPenny;
			int coins;
			
			
			if (change >= 20)
			{
				count20 = (int)change/20;
				System.out.println("20: "+count20);
				
				change = change - (count20*20);
				System.out.println(change);
			}
			if (change >=10)
			{
				count10 = (int)change/10;
				System.out.println("10: " + count10);
				
				change = change - (count10*10);
				System.out.println("change: " + change);
				
			}
			
			if (change >=5)
			{
				count5 = (int)change/5;
				
				change = change - (count5*5);
				System.out.println("5: " + count5);

				System.out.println("change: " + change);
			}
			
			if (change >= 1)
			{
				count1 = (int)change/1;
				change = change -count1;
				
				System.out.println("1: " +count1);
				System.out.println("change: " + change);
				
			}
			change = change * 100;
			change = Math.round(change);
			coins = (int)change;
			System.out.println("coins: " + coins);
			
			if(coins >=25)
			{
				countQuarter = coins/25;
				coins = coins - (countQuarter*25);
				System.out.println("countQuarter: " + countQuarter);
			}
			
			if(coins >= 10)
			{
				countDime = coins/10;
				coins = coins - (countDime*10);
				System.out.println("countDime: " + countDime);
			}
			
			if(coins >= 5)
			{
				countNickel = coins/5;
				coins = coins - (countNickel*5);
				System.out.println("countNickel: " + countNickel);
			}
			
			if(coins >= 1)
			{
				countPenny = coins/1;
				coins = coins - countPenny;
				System.out.println("countPenny: " + countPenny);
			}
			
			
		}

		


		


		
		
		System.out.print("");

		
		keyboard.close();
		
	}	//Main

}
