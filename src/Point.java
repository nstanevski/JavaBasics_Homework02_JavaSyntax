final class Point{
	
	private double x;
	
	private double y;
	
	public Point(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public double getX(){
		return this.x;
	}
	
	public double getY(){
		return this.y;
	}
	
	public double distanceTo(Point p1){
		return Math.sqrt((this.x - p1.x)*(this.x - p1.x) + (this.y - p1.y)*(this.y - p1.y));
	}
}