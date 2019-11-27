
public class Square implements IShape {
	private double rib;
	
	public Square(double rib) {
		this.rib=rib;
	}
	public double get_rib() {
		return this.get_rib();
	}
	public double getPerimeter() {
		double perimeter=rib*4;
		return perimeter;
	}
	
	public double getArea() {
		double area=rib*rib;
		return area;
	}


}
