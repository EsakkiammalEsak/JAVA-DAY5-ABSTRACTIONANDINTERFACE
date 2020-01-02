package Interface1;


public class regularCanvas extends Canvas implements ipaint {

	public regularCanvas(String typeOfPaint, int canvassize) {
		super(typeOfPaint, canvassize);
		
	}

	public void paint()
	{
		if(typeOfPaint.equals("water"))
		{
			System.out.println("Paint a flower of CanvasSize "+this.canvassize);
		}
		else
		{
			System.out.println("Cannot paint.Type mismatch. Water Paints required for Regular Canvas");
		}
	}
}
