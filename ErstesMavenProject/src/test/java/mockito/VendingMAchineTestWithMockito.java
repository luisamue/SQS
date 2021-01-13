package mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

import uebung5.BoxEmptyException;
import uebung5.FullBox;
import uebung5.NotEnoughMoneyException;
import uebung5.UnlimitedCashBox;
import uebung5.VendingMachineImpl;

public class VendingMAchineTestWithMockito {

	@Test
	public void testSelectItem() throws NotEnoughMoneyException, BoxEmptyException {
		UnlimitedCashBox ucb = mock(UnlimitedCashBox.class);
		FullBox fb1 = mock(FullBox.class);
		FullBox fb2 = new FullBox();
		FullBox[] boxes = { fb1, fb2 };
		
		VendingMachineImpl vm = new VendingMachineImpl(ucb, boxes);
		
		when(ucb.getCurrentAmount()).thenReturn(1);
		when(fb1.getPrice()).thenReturn(42);
		
		boolean result = vm.selectItem(0);
		assertTrue(result);
		
	}

}
