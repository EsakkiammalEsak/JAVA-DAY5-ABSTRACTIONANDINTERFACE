package interface2;
import java.util.*;
public class Museum extends Expo implements iTrade {
	Museum()
	{
		super();
	}
	public float buyPainting()
	{
		float ans=0;
		/* for(int i=0;i<3;i++)
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
			ans=(float)(this.listOfPaintings[0].value*1.5);
		
		case 2:
		
			ans=(float)(this.listOfPaintings[1].value*3.75);
		
		case 3:
		
		ans=(float)(this.listOfPaintings[1].value*1.25);
		}
		return ans;
		
		
	}
	
	public float sellPainting(Painting paintingToSell)
	{
		float price=0;
		if(paintingToSell.typeOfPainting.equals(listOfPaintings[0].typeOfPainting))
		{
			price=(float)(this.listOfPaintings[0].value*1);
		}
		else if(paintingToSell.typeOfPainting.equals(listOfPaintings[1].typeOfPainting))
		{
			price=(float)(this.listOfPaintings[1].value*2.35);
		}
		else if(paintingToSell.typeOfPainting.equals(listOfPaintings[2].typeOfPainting))
		{
			price=(float)(this.listOfPaintings[1].value*0.75);
		}
		return price;
	
	}
	
}
