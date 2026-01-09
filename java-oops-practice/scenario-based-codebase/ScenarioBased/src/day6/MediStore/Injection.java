package day6.MediStore;

public class Injection extends Medicine implements ISellable {
	int volume;
	String type;// (IM/IV)
	double needleSize;
	int need;

	public Injection(String name, double price, int expiryDate, int quantity, int volume, String type,
			double needlwSize,int need) {
		super(name, price, expiryDate, quantity, needlwSize);
		this.volume = volume;
		this.type = type;
		this.needleSize = needlwSize;
		this.need = need;
	}
	
	@Override
	public void display() {
		System.out.println("\n3. Injection");
		super.display();
		System.out.println("Volume: "+volume+"ml");
		System.out.println("Type: "+type);
		System.out.println("Needlw Size: "+needleSize+"mm");
	}

}
