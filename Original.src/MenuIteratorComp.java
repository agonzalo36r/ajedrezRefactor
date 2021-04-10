import java.util.ArrayList;
import java.util.List;

public class MenuIteratorComp implements iMenuIteratorComp{
    protected String label;
    protected List<iMenuIteratorComp> components;

    public MenuIteratorComp() {
        components = new ArrayList<iMenuIteratorComp>();
    }
    
    public MenuIteratorComp(String label) {
    	this.label = label;
    	components = new ArrayList<iMenuIteratorComp>();
    }

    @Override
	public String showLabel() {
        return label;
	}

    @Override
	public void add(iMenuIteratorComp component) {
        components.add(component);
	}

    @Override
    public List<iMenuIteratorComp> getAllComponents() {
        return components;
    }
}
