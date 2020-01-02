package Interface1;


public abstract class Canvas {

	
	 String typeOfPaint;
	 int canvassize;
	
	public Canvas(String typeOfPaint, int canvassize) {
		super();
		this.typeOfPaint = typeOfPaint;
		this.canvassize = canvassize;
	}

	public String getTypeOfPaint() {
		return typeOfPaint;
	}

	public void setTypeOfPaint(String typeOfPaint) {
		this.typeOfPaint = typeOfPaint;
	}

	public int getCanvasSize() {
		return canvassize;
	}

	public void setCanvasSize(int canvassize) {
		this.canvassize = canvassize;
	}
	
	
}
