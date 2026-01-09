package day6.MediStore;

public class MediStoreApp {
	public static void main(String[] args) {
		Tablet t = new Tablet("PB-04", 50, 30, 100, 2, 4, 10);
		t.display();
		t.stockAdjustments(t.quantity);
		t.checkExpiry(1, t.expiryDate);
		if (!(t.sell(t.quantity, t.need))) {
			if (t.quantity >= 1) {
				t.need = t.quantity;
			} else {
				t.need = 0;
			}
		}
		t.totalprice(t.price, t.need);

		Syrup s = new Syrup("PE-01", 700, 30, 100, 950, "Sweet", 2);
		s.display();
		s.stockAdjustments(s.quantity);
		s.checkExpiry(1, s.expiryDate);
		if (!(s.sell(s.quantity, s.need))) {
			if (s.quantity >= 1) {
				s.need = s.quantity;
			} else {
				s.need = 0;
			}
		}
		s.totalprice(s.price, s.need);

		Injection i = new Injection("PW-I", 10000, 30, 50, 50, "IM", 0.10, 2);
		i.display();
		i.stockAdjustments(i.quantity);
		i.checkExpiry(1, i.expiryDate);
		if (!(i.sell(i.quantity, i.need))) {
			if (i.quantity >= 1) {
				i.need = i.quantity;
			} else {
				i.need = 0;
			}
		}
		i.totalprice(i.price, i.need);

		Bill b = new Bill(t.discount(0.10), s.discount(0.10), i.discount(0.10));
		b.finalBill(t.discount(0.10), s.discount(0.10), i.discount(0.10));
		b.billDisplay();
	}
}
