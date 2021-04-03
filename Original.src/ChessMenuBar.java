import java.awt.Component;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;



// -------------------------------------------------------------------------
/**
 * Represents the north menu-bar that contains various controls for the game.
 *
 * @author Ben Katz (bakatz)
 * @author Myles David II (davidmm2)
 * @author Danielle Bushrow (dbushrow)
 * @version 2010.11.17
 */



public class ChessMenuBar
    extends JMenuBar implements iMenuComponent {
    
    protected String label;
    protected List<iMenuComponent> components;
    // ----------------------------------------------------------
    public ChessMenuBar() {
        components = new ArrayList<iMenuComponent>();

        SubMenu fileMenu = new SubMenu("File");

        fileMenu.add(new NewGameR(this));
        fileMenu.add(new Exit(this));

        SubMenu optionsMenu = new SubMenu("Options");
        optionsMenu.add(new ToggleGraveyard(this));
        optionsMenu.add(new ToogleGameLog(this));

        SubMenu helpMenu = new SubMenu("Help");
        helpMenu.add(new About(this));

        add(fileMenu);
        add(optionsMenu);
        add(helpMenu);

        createVisualElements();
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

    private void createVisualElements() {
        for(iMenuComponent menuComponent : getAllComponents()) {
            SubMenu subMenu = (SubMenu)menuComponent;
            JMenu subMenuPrinter = new JMenu(subMenu.showLabel());

            for(iMenuComponent subMenuComponent : subMenu.getAllComponents()) {
                iButton button = (iButton)subMenuComponent;
                JMenuItem buttonItem = new JMenuItem(button.showLabel());
                buttonItem.addActionListener(event -> button.onClick(event));
                //buttonItem.addActionListener(new MenuListener());
                subMenuPrinter.add(buttonItem);
            }
            this.add(subMenuPrinter);
        }
    }
}
