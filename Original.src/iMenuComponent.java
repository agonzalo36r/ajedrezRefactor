import java.util.List;

public interface iMenuComponent {
	public String showLabel();
	void add(iMenuComponent component);
	List<iMenuComponent> getAllComponents();
}
