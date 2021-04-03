import java.util.ArrayList;
import java.util.List;

public class MenuComponent implements iMenuComponent{
    protected String label;
    protected List<iMenuComponent> components;

    public MenuComponent() {
        components = new ArrayList<iMenuComponent>();
    }
    
    public MenuComponent(String label) {
    	this.label = label;
    	components = new ArrayList<iMenuComponent>();
    }

    @Override
	public String showLabel() {
        return label;
	}

    @Override
	public void add(iMenuComponent component) {
        components.add(component);
	}

    @Override
    public List<iMenuComponent> getAllComponents() {
        return components;
    }
}
