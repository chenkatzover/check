//import Circle;

public class CircleTest {

	public static void main(String[] args) {
		
		
		double[] r = {4,7,2,8};
		for(int i=0;i<r.length;i++) {
			Circle c = new Circle(r[i]);
			double q = c.get_radius();
			System.out.println(q);
			System.out.println(c.getPerimeter());
			System.out.println(c.getArea());
		}

	}
}
