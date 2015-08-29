final class Rectangle{
	private Point lowerLeft;
	
	private Point upperRight;
	
	public Rectangle(Point ll, Point ur){
		this.lowerLeft = ll;
		this.upperRight = ur;
	}
	
	public boolean pointInside(Point p){
		if(		p.getX() >= this.lowerLeft.getX() 
				&& p.getX() <= this.upperRight.getX()
				&& p.getY()<= this.lowerLeft.getY() 
				&& p.getY()>= this.upperRight.getY())
		{
			return true;
		}
		return false;
	}
}
