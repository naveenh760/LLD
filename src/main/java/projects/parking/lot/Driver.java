package projects.parking.lot;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot();
        System.out.println("Select 1.Park 2. Pay and Exit ");
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int option = sc.nextInt();
            switch (option){
                case 1:
                    System.out.println("Parking vehicle");
                    parkingLot.park();
                    break;
                case 2:
                    System.out.println("Exiting vehicle");
                    parkingLot.exit();
                    break;
            }
        }
    }

}
