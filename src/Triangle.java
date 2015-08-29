
final class Triangle {
	private Point p1;
	private Point p2;
	private Point p3;
	
	public Triangle(Point p1, Point p2, Point p3){
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}
	
	private int position(Point p, Point p1, Point p2){
		double detVector =  (p2.getX()-p1.getX())*(p.getY()-p1.getY()) - (p2.getY()-p1.getY())*(p.getX()-p1.getX());
		return Integer.signum((int) Math.signum(detVector));	
	}
	
	private int min3(int a, int b, int c){
		return Integer.min(Integer.min(a, b), Integer.min(b, c));
	}
	
	private int max3(int a, int b, int c){
		return Integer.max(Integer.max(a, b), Integer.max(b, c));
	}
	
	public boolean pointInside(Point p){
		int position1 = position(p, p1, p2);
		int position2 = position(p, p2, p3);
		int position3 = position(p, p3, p1);
		
		int positionMin = min3(position1, position2, position3);
		int positionMax = max3(position1, position2, position3);
		
		if(positionMin == -1 && positionMax == 1){
			return false;
		}
		return true;
	}
}
