package day8.GameBox;

public abstract class Game implements IDownloadable {
    protected String title;
    protected String genre;
    protected double price;
    protected double rating;

    protected Game(String title, String genre, double price, double rating) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.rating = rating;
    }

    public void applySeasonalOffer(String season) {
        if (season.equalsIgnoreCase("winter")) {
            price = price - (price * 0.10);
        } else if (season.equalsIgnoreCase("summer")) {
            price = price - (price * 0.20);
        }
    }

    @Override
    public void download() {
        System.out.println("\n"+title + " is downloading...");
        System.out.println("Download complete!");
    }

    @Override
    public String toString() {
        return title + " | " + genre + " | ₹" + price + " | Rating: " + rating;
    }
}
