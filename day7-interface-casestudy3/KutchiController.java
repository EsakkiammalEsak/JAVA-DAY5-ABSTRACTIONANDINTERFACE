package interface3;

public class KutchiController implements iHumanActions,iRobotActions {
	
	float cash;
	int energy;
	
	public KutchiController(float cash, int energy) {
		super();
		this.cash = cash;
		this.energy = energy;
	}
	
	@Override
	public void performMaintenance(float hours) {
		// TODO Auto-generated method stub
		System.out.println("Consumes"+((hours/1.5)*3)+"Cash"+((hours/1.5)*7));
		
	}
	@Override
	public void paintAndSell(float hours) {
		float cal=hours/2;
		if(cal>=1 && cal<2)
		{
			System.out.println("Consumes "+(hours*5)+" energy and creates 1 painting every 2 hours which are sold for 7 cash each");
		}else if(cal>=2 && cal<3)
		{
			System.out.println("Consumes "+(hours*5)+" energy and creates 2 paintings every 2 hours which are sold for 8 cash each");
		}else if(cal>=3 && cal<4)
		{
			System.out.println("Consumes "+(hours*5)+" energy and creates 3 paintings every 2 hours which are sold for 9 cash each");
		}
		
	}
	@Override
	public void restFor(float hours) {
		// TODO Auto-generated method stub
		System.out.println("Consumes"+((hours/2.5)+7)+"Cash"+((hours/2.5)-3));
		
	}
	@Override
	public void buyStuff(String itemToBuy, int price) {
		// TODO Auto-generated method stub
		System.out.println("Item"+itemToBuy+"Price"+price);
		
	}
	@Override
	public void socialize(float hours) {
		// TODO Auto-generated method stub
		
		
		float consume=(((hours*60)/20)*2);
		System.out.println("Consumes"+consume);
		
		
	}
	@Override
	public void workFor(float hours) {
		// TODO Auto-generated method stub
		System.out.print("enery consumed"+(hours*5)+"cash earns"+(hours*15));
		
		
	}
	public void displayStatus() {
		// TODO Auto-generated method stub
		System.out.print("CURRENT ENERGY LEVEL AND CASH");
		System.out.print("ENERGY:"+energy);
		System.out.print("CASH:"+cash);
		
	}
}
	
	