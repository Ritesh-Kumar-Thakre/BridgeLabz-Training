package day6.TourMate;

public class Transport {
    private String type;
    private double cost;

    public Transport(String type, double cost) {
        this.type = type;
        this.cost = cost;
    }

    double getCost() {
        return cost;
    }

    String getType() {
        return type;
    }
}
