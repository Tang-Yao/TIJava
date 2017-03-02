package annotations;

import net.mindview.atunit.*;

public class TestTable {
	public void execute() {
		System.out.println("Executing...");
	}
	
	@Test void testExecute() { execute(); }
}
