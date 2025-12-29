import java.util.Scanner;

public class ParkingLotGateSystem {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int parkingSpace = 10;
        int occupancy = 0;
    
        while (true) {
            System.out.println("1. Park 2. Exit 3. Show Occupancy");
            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    if (occupancy<parkingSpace) {
                        occupancy++;
                        System.out.println("Car Parked");
                    } else{
                        System.out.println("Parking Full");
                    }
                    break;
                case 2:
                    if(occupancy>0){
                        occupancy--;
                        System.out.println("Car Exited");
                    }else{
                        System.out.println("Parking Empty");
                    }
                    break;
                case 3:
                    System.out.println("Current Occupancy: "+occupancy);
                    break;
                default:
                    System.out.println("Invalid choice");
            }

            if (occupancy == parkingSpace) {
                System.out.println("Parking Lot Full. No more cars can be parked.");
            }
        }
    }
}
