import junit.framework.TestCase;

public class TestMenuComponent extends TestCase{

	public void testLabel() {
		MenuComponent compTest1 = new MenuComponent("Componente1");
		assertTrue(compTest1.showLabel() == "Componente1");
	}
	
	
	public void testHierarchy() {
		MenuComponent compTest2 = new MenuComponent("Componente2");
		MenuComponent hojaTest1 = new MenuComponent("Hoja1");
		MenuComponent hojaTest2 = new MenuComponent("Hoja2");

		compTest2.add(hojaTest1);
		compTest2.add(hojaTest2);
		
		assertTrue(compTest2.getAllComponents().size() == 2);
	}
	
	public void testLeafLabel() {
		MenuComponent compTest3 = new MenuComponent("Componente3");
		MenuComponent hojaTest1 = new MenuComponent("Hoja1");
		MenuComponent hojaTest2 = new MenuComponent("Hoja2");

		compTest3.add(hojaTest1);
		compTest3.add(hojaTest2);
		
		
		assertTrue(compTest3.getAllComponents().size() == 2);
		assertTrue(hojaTest1.showLabel() == "Hoja1");
		assertTrue(hojaTest2.showLabel() == "Hoja2");
	}
}
 