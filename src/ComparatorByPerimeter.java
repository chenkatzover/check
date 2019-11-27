import java.util.Comparator;
public class ComparatorByPerimeter implements Comparator<IShape> {

	@Override
	public int compare(IShape o1, IShape o2) {
		return (int) o1.getPerimeter()-(int)o2.getPerimeter();


	}


}
