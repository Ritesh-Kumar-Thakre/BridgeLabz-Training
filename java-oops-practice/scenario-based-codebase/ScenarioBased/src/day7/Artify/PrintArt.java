package day7.Artify;

public class PrintArt extends Artwork {
	String  printSize;
	String paperType;
	
	public PrintArt(String title, String artist, double price, String licenseType,String printSize,String paperType) {
		super(title, artist, price, licenseType);
		this.printSize=printSize;
		this.paperType=paperType;
	}

	@Override
	public void display() {
		super.display();
		System.out.println("Print Size: "+printSize);
		System.out.println("Paper Type: "+paperType);
	}

}
