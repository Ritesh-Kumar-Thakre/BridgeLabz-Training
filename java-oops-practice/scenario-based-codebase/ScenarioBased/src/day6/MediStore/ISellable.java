package day6.MediStore;

public interface ISellable {
	public boolean sell(int quantity,int need);

	public void checkExpiry(int date, int expiryDate);
}
