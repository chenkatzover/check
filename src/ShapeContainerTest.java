import java.util.Iterator;
public class ShapeContainerTest {

	public static void main(String[] args) {
		ShapeContainer s=new ShapeContainer();
		Circle c1=new Circle(3);
		Circle c2=new Circle(5);
		Square s1=new Square(2);
		s.add(c1);
		s.add(c2);
		s.add(s1);
		s.sortByArea();
		Iterator <IShape> it=s.l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().getArea());
		}
		it=s.l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().getPerimeter());




		}}}


