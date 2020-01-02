package Interface1;


public class oilCanvas extends Canvas implements ipaint {
	
		public oilCanvas(String typeOfPaint, int canvassize) {
		super(typeOfPaint, canvassize);
		
	}

		public void paint()
		{
			if(this.typeOfPaint.equals("oil" ))
			{
				System.out.println("Paint a windmill of CanvasSize "+this.canvassize);
			}
			else
			{
				System.out.println("Cannot paint.Type mismatch. OilPaints required for Oil Canvas");
			}
		}
	}
