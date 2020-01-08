package interface2;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Choose the place to buy or sell Paintings :\n1.ArtExpo\n2.Museum\n3.BlackMarket");
		n=s.nextInt();
		switch(n)
		{
		   case 1:
			   int ch;
			   ArtExpo art=new ArtExpo();
			   art.displayPaintings();
			   System.out.println("Buy(1) or sell(0)");
			   ch=s.nextInt();
			   if(ch==1)
				   System.out.println("You can buy @ Rs: "+art.buyPainting());
				else
				{
					Painting p=new Painting();
					p.typeOfPainting=s.nextLine();
					System.out.println("You can sell @ Rs:"+art.sellPainting(p));
				}
			   break;
					   
		   case 2:
			   int ch1;
			   Museum m=new Museum();
			   m.displayPaintings();
			   System.out.println("Buy(1) or sell(0)");
			   ch1=s.nextInt();
			   if(ch1==1)
				   System.out.println("You can buy @ Rs: "+m.buyPainting());
				else
				{
					Painting p=new Painting();
					p.typeOfPainting=s.nextLine();
					System.out.println("You can sell @ Rs:"+m.sellPainting(p));
				}
			   break;	   
		   case 3:
			   int ch2;
			   BlackMarket b=new BlackMarket();
			   b.displayPaintings();
			   System.out.println("Buy(1) or sell(0)");
			   ch2=s.nextInt();
			   if(ch2==1)
				   System.out.println("You can buy @ Rs: "+b.buyPainting());
				else
				{
					Painting p=new Painting();
					p.typeOfPainting=s.nextLine();
					System.out.println("You can sell @ Rs:"+b.sellPainting(p));
				}
			   break;
		}
		
		
	}

}
