import junit.framework.TestCase;

public class TestIterator extends TestCase{

	public void testLabel() {
		MenuIteratorComp compTest1 = new MenuIteratorComp("Componente1");
		assertTrue(compTest1.showLabel() == "Componente1");
	}
	
	
	public void testHierarchy() {
		MenuIteratorComp compTest2 = new MenuIteratorComp("Componente2");
		MenuIteratorComp hojaTest1 = new MenuIteratorComp("Hoja1");
		MenuIteratorComp hojaTest2 = new MenuIteratorComp("Hoja2");

		compTest2.add(hojaTest1);
		compTest2.add(hojaTest2);
		
		assertTrue(compTest2.getAllComponents().size() == 2);
	}
	
	public void testLeafLabel() {
		MenuIteratorComp compTest3 = new MenuIteratorComp("Componente3");
		MenuIteratorComp hojaTest1 = new MenuIteratorComp("Hoja1");
		MenuIteratorComp hojaTest2 = new MenuIteratorComp("Hoja2");

		compTest3.add(hojaTest1);
		compTest3.add(hojaTest2);
		
		
		assertTrue(compTest3.getAllComponents().size() == 2);
		assertTrue(hojaTest1.showLabel() == "Hoja1");
		assertTrue(hojaTest2.showLabel() == "Hoja2");
	}
}
 