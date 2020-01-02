package Interface1;


public class GlassCanvas extends Canvas implements ipaint  {

	public GlassCanvas(String typeOfPaint, int canvassize) {
		super(typeOfPaint, canvassize);
		
	}

	public void paint()
	{
		if(typeOfPaint.equals("glass"))
		{
			System.out.println("Paint an hourglass of CanvasSize "+this.canvassize);
		}
		else
		{
			System.out.println("Cannot paint.Type mismatch. Glass Paints required for Glass Canvas");
		}
	}
}
