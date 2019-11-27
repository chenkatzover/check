import java.util.Comparator;
public class ComparatorByArea implements Comparator<IShape> {

	@Override
	public int compare(IShape arg0, IShape arg1) {
		return (int) arg0.getArea()-(int)arg1.getArea();

	}

}



