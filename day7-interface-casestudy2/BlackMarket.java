package interface2;
import java.util.Scanner;
public class BlackMarket extends Expo implements iTrade{

	public float buyPainting()
	{
		float ans=0;
		 /*for(int i=0;i<3;i++)
		 {
		    	System.out.printf("\n%s",this.listOfPaintings[i].typeOfPainting);
		    	
		 }*/
		 this.listOfPaintings[0].typeOfPainting="Water";
		 this.listOfPaintings[1].typeOfPainting="Glass";
		 this.listOfPaintings[2].typeOfPainting="Oil";
		
		System.out.println("1.Water\t2.Glass\t3.Oil");
		int n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		switch(n)
		{
		case 1:
			ans=(float)(this.listOfPaintings[0].value*0.5);
			break;
		case 2:
		ans=(float)(this.listOfPaintings[1].value*1.75);
		break;
		case 3:
			ans=(float)(this.listOfPaintings[1].value*2.75);
			break;
	}
		return ans;
		
		
	}
	 BlackMarket()
	{
		super();
	}
	public float sellPainting(Painting paintingToSell)
	{
		float price=0;
		if(paintingToSell.typeOfPainting.equals(listOfPaintings[0].typeOfPainting))
		{
			price=(float)(this.listOfPaintings[0].value*0.25);
		}
		else if(paintingToSell.typeOfPainting.equals(listOfPaintings[1].typeOfPainting))
		{
			price=(float)(this.listOfPaintings[1].value*1.35);
		}
		else if(paintingToSell.typeOfPainting.equals(listOfPaintings[2].typeOfPainting))
		{
			price=(float)(this.listOfPaintings[2].value*2.25);
		}
		return price;
	
	}
	
}
