package abstractioncase1;
public class Stardoor extends Door {
	private int numberOfStars;
	
	
	public Stardoor(String doorName, int numberOfStars) {
		// TODO Auto-generated constructor stub
		super(doorName);
		this.numberOfStars = numberOfStars;
	}

	public int getNumberOfStars() {
		return numberOfStars;
	}

	public void setNumberOfStars(int numberOfStars) {
		this.numberOfStars = numberOfStars;
	}
	

	
	public void display() {
		// TODO Auto-generated method stub
		int i,j;
		for(i=1;i<=numberOfStars;i++)
		{
			for(j=numberOfStars;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println("\n");
		}
		
		for(i=1;i<=numberOfStars;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("\n");
		}
	}	
		
	}

