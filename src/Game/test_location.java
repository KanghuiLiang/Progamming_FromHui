package Game;

import java.util.Scanner;

public class test_location {
    public static void main(String[] args) {
        String[][] stage = {{"", "", ""}, {"", "", ""}, {"", "", ""}};
        Location location = new Location(stage);
        Scanner scan = new Scanner(System.in);
        while (1 == 1) {
            location.printLocation();
            String move = scan.nextLine();
            switch (move) {
                case "up":
                    location.moveUp();
                    break;
                case "down":
                    location.moveDown();
                    break;
                case "left":
                    location.moveLeft();
                    break;
                case "right":
                    location.moveRight();
                    break;
                default:
                    System.out.println("HAHAHAHAHAHA");
            }
        }
    }
}
