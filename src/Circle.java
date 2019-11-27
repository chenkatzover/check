
public class Circle implements IShape{
	
	private double radius;
	public static final double pi = 3.14;
	public Circle(double radius) 
	{
		this.radius = radius;
	}
	public double get_radius() 
	{
		return this.radius;
	}
	public double getPerimeter() { //2p*r 
		double perimeter=((2*pi)*radius);
		return perimeter;
	}
	
	public double getArea() {//pr^2=p*r*r
		double area=(pi*Math.pow(radius, 2));
		return area;
}
}