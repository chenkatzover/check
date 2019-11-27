import java.util.LinkedList;
public class ShapeContainer  {
	LinkedList <IShape> l=new LinkedList<IShape>();
	public ShapeContainer() {
		LinkedList <IShape> temp=new LinkedList<IShape>();
		this.l=temp;
	}
	public void add(IShape s) {
		l.add(s);
	}
	public void sortByArea() {
		ComparatorByArea a=new ComparatorByArea();
		l.sort(a);
	}
	public void sortByPerimeter() {
		ComparatorByPerimeter b=new ComparatorByPerimeter();
		l.sort(b);
	}


}
