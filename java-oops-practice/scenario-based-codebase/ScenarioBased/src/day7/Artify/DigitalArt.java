package day7.Artify;

public class DigitalArt extends Artwork {
	int resolution;
	String fileFormat;
	
	public DigitalArt(String title, String artist, double price, String licenseType,int resolution,String fileFormat) {
		super(title, artist, price, licenseType);
		this.resolution=resolution;
		this.fileFormat=fileFormat;
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("Resolution: "+resolution+"px");
		System.out.println("File Format: "+fileFormat);
	}

}
