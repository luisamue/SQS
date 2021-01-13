package mockito;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;


import org.junit.Test;

import uebung5.BoxEmptyException;
import uebung5.FullBox;
import uebung5.NotEnoughMoneyException;
import uebung5.UnlimitedCashBox;
import uebung5.VendingMachineImpl;

public class VendingMachineTestSpy {


	@Test
	public void testSelectItem() throws NotEnoughMoneyException, BoxEmptyException {
		
		UnlimitedCashBox ucb = new UnlimitedCashBox();
		UnlimitedCashBox spyucb = spy (ucb);
		
		FullBox fb1 = new FullBox();
		FullBox spyfb1 = spy(fb1);
		
		FullBox fb2 = new FullBox();
		FullBox[] boxes = { spyfb1, fb2 };

		VendingMachineImpl vm = new VendingMachineImpl(spyucb, boxes);

		/*when(spyucb.getCurrentAmount()).thenReturn(1);
		when(spyfb1.getPrice()).thenReturn(42);*/

		boolean result = vm.selectItem(0);
		
		verify(spyucb, times(1)).getCurrentAmount();
		verify(spyfb1, times(1)).getPrice();
		
		assertTrue(result);

	}
}
