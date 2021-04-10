import java.util.List;

public interface iMenuIteratorComp {
	public String showLabel();
	void add(iMenuIteratorComp component);
	List<iMenuIteratorComp> getAllComponents();
}
