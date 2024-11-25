import java.util.Scanner;
public class CinemaWithScanner09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row, column;
        String name, next;
        String[][] audience = new String[4][2];

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input audience data");
            System.out.println("2. Show audience list");
            System.out.println("3. Exit");
            System.out.print("Choose an option (1/2/3): ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter a name: ");
                name = sc.nextLine();

                boolean seatOccupied = false;
                while (true) {
                    System.out.print("Enter row number (1 to 4): ");
                    row = sc.nextInt();
                    if (row < 1 || row > 4) {
                        System.out.println("Invalid row number. Please enter a row between 1 and 4.");
                        continue;
                    }

                    System.out.print("Enter column number (1 or 2): ");
                    column = sc.nextInt();
                    if (column < 1 || column > 2) {
                        System.out.println("Invalid column number. Please enter a column between 1 and 2.");
                        continue;
                    }

                    if (audience[row - 1][column - 1] != null) {
                        System.out.println("Warning: This seat is already occupied! Please choose another seat.");
                        seatOccupied = true;
                    } else {
                        audience[row - 1][column - 1] = name;
                        System.out.println("Audience added successfully!");
                        seatOccupied = false;
                        break;
                    }
                }
            } else if (choice == 2) {
                System.out.println("\nCurrent audience seating arrangement:");
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 2; j++) {
                        if (audience[i][j] == null) {
                            System.out.print("***\t");
                        } else {
                            System.out.print(audience[i][j] + "\t");
                        }
                    }
                    System.out.println();
                }
            } else if (choice == 3) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
