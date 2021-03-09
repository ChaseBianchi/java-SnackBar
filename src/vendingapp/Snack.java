package vendingapp;

public class Snack{
	private static int maxId = 0;
	private int id;
	private String name;
	private int quantity;
	private double cost;
	private int vendingMachineId;
	private String vendingMachineName;

	public Snack(String name, int quantity, double cost, int vendingMachineId, String vendingMachineName){
		maxId++;
		id=maxId;

		this.name = name;
		this.quantity = quantity;
		this.cost = cost;
		this.vendingMachineId = vendingMachineId;
		this.vendingMachineName = vendingMachineName;
	}
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getQuantity(){
		return quantity;
	}
	public void addQuantity(int quantity){
		this.quantity += quantity;
	}
	public double getCost(){
		return cost;
	}
	public void setCost(){
		this.cost=cost;
	}
	public void buySnack(int quantity){
		this.quantity -= quantity;
	}
	public int getVendingMachineId(){
		return vendingMachineId;
	}
	public void setVendingMachineId(){
		this.vendingMachineId = vendingMachineId;
	}
	public double getTotalCost(int quantity){
		return this.cost * quantity;
	}
	public String getVendingMachineName(){
		return this.vendingMachineName;
	}
}