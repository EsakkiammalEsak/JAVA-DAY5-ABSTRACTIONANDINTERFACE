package interface3;
import java.util.Scanner;
public class main {
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	float cash;
	int energy;
	String itemToBuy;
	int price;
	float hours;
	System.out.print("cash:");
	cash=s.nextFloat();
	System.out.print("energy:");
	energy=s.nextInt();
	System.out.print("itemToBuy:");
	itemToBuy=s.next();
	System.out.print("price:");
	price=s.nextInt();
	System.out.print("hours:");
	hours=s.nextFloat();
	KutchiController k=new KutchiController(cash,energy);
	k.displayStatus();
	k.performMaintenance(hours);
	k.paintAndSell(hours);
	k.restFor(hours);
	k.buyStuff(itemToBuy, price);
	k.socialize(hours);
	
	
	
	}	
}
