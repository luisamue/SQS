package mockito;

import static org.junit.Assert.*;

import javax.swing.Box;

import org.junit.Before;
import org.junit.Test;

import uebung5.BoxEmptyException;
import uebung5.FullBox;
import uebung5.NotEnoughMoneyException;
import uebung5.UnlimitedCashBox;
import uebung5.VendingMachineImpl;

public class VendingMachineTest {
	VendingMachineImpl vm;
	boolean result;

	@Before
	public void setUp() {
		UnlimitedCashBox ucb = new UnlimitedCashBox();
		FullBox fb1 = new FullBox();
		FullBox fb2 = new FullBox();
		FullBox[] boxes = { fb1, fb2 };
		vm = new VendingMachineImpl(ucb, boxes);
	}

	@Test
	public void testSelectItem() {
		try {
			result = vm.selectItem(0);
			assertTrue(result);
		} catch (NotEnoughMoneyException e) {

			e.printStackTrace();
		} catch (BoxEmptyException e) {

			e.printStackTrace();
		}
	}

}
