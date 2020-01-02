package Interface1;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		String typeOfPaint=s.next();
		int canvassize=s.nextInt();
		
		if(typeOfPaint.equals("water"))
		{
		regularCanvas regular = new regularCanvas(typeOfPaint,canvassize);
		regular.paint();
		}else if(typeOfPaint.equals("glass"))
		{
		GlassCanvas glass = new GlassCanvas(typeOfPaint,canvassize);
		glass.paint();
		}
		else if(typeOfPaint.equals("oil")){
		oilCanvas oil=new oilCanvas (typeOfPaint,canvassize);
		oil.paint();
		}
		else
		{
			System.out.print("Option not available");
		}
	}

}
