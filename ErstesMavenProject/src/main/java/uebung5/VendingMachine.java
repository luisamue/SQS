package uebung5;

public interface VendingMachine {
	 public boolean selectItem(int boxIndex) throws
	  NotEnoughMoneyException,
	  BoxEmptyException;
}
