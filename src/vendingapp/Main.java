package vendingapp;

import java.text.NumberFormat;

public class Main{
	public static void main(String[] args){

		Customer jane = new Customer("Jane", 45.25);
		Customer bob = new Customer("Bob", 33.14);

		Vending food = new Vending("Food");
		Vending drink = new Vending("Drink");
		Vending office = new Vending("Office");


		// Snack(String name, int quantity, double cost, int vendingMachineId, String vendingMachineName)
		Snack chips = new Snack("Chips", 36, 1.75, 1, "Food");
		Snack chocolate = new Snack("Chocolate Bar", 36, 1.00, 1, "Food");
		Snack pretzel = new Snack("Pretzel", 30, 2.00, 1, "Food");

		Snack soda = new Snack("Soda", 24, 2.50, 2, "Drink");
		Snack water = new Snack("Water", 20, 2.75, 2, "Drink");

		jane.spendCash(soda.getCost()*3);
		soda.buySnack(3);
		System.out.println(jane.getName() + " cash on hand " + jane.getCash());
		System.out.println("Quantity of " + soda.getName() + " is " + soda.getQuantity());
		System.out.println("");

		jane.spendCash(pretzel.getCost());
		pretzel.buySnack(1);
		System.out.println(jane.getName() + " cash on hand " + jane.getCash());
		System.out.println("Quantity of " + pretzel.getName() + " is " + pretzel.getQuantity());
		System.out.println("");

		bob.spendCash(soda.getCost()*2);
		soda.buySnack(2);
		System.out.println(bob.getName() + " cash on hand " + bob.getCash());
		System.out.println("Quantity of " + soda.getName() + " is " + soda.getQuantity());
		System.out.println("");

		jane.addCash(10.00);
		System.out.println(jane.getName() + " cash on hand " + jane.getCash());
		System.out.println("");

		jane.spendCash(chocolate.getCost());
		chocolate.buySnack(1);
		System.out.println(jane.getName() + " cash on hand " + jane.getCash());
		System.out.println("Quantity of " + chocolate.getName() + " is " + chocolate.getQuantity());
		System.out.println("");

		pretzel.addQuantity(12);
		System.out.println("Quantity of " + pretzel.getName() + " is " + pretzel.getQuantity());
		System.out.println("");

		bob.spendCash(pretzel.getCost()*3);
		pretzel.buySnack(3);
		System.out.println(bob.getName() + " cash on hand " + bob.getCash());
		System.out.println("Quantity of " + pretzel.getName() + " is " + pretzel.getQuantity());
		System.out.println("");

		// formatter = NumberFormat.getCurrancyInstance();
		System.out.println("Snack: " + chips.getName());
		System.out.println("Vending Machine: " + chips.getVendingMachineName());
		System.out.println("Quantity: " + chips.getQuantity());
		System.out.println("Total Cost: $" + chips.getQuantity()*chips.getCost());
		System.out.println("");

		System.out.println("Snack: " + chocolate.getName());
		System.out.println("Vending Machine: " + chocolate.getVendingMachineName());
		System.out.println("Quantity: " + chocolate.getQuantity());
		System.out.println("Total Cost: $" + chocolate.getQuantity()*chocolate.getCost());
		System.out.println("");

		System.out.println("Snack: " + pretzel.getName());
		System.out.println("Vending Machine: " + pretzel.getVendingMachineName());
		System.out.println("Quantity: " + pretzel.getQuantity());
		System.out.println("Total Cost: $" + pretzel.getQuantity()*pretzel.getCost());
		System.out.println("");

		System.out.println("Snack: " + soda.getName());
		System.out.println("Vending Machine: " + soda.getVendingMachineName());
		System.out.println("Quantity: " + soda.getQuantity());
		System.out.println("Total Cost: $" + soda.getQuantity()*soda.getCost());
		System.out.println("");

		System.out.println("Snack: " + water.getName());
		System.out.println("Vending Machine: " + water.getVendingMachineName());
		System.out.println("Quantity: " + water.getQuantity());
		System.out.println("Total Cost: $" + water.getQuantity()*water.getCost());
		System.out.println("");
	}
}