import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Initialize the map with white squares
        String[][] map = {
            {"⬜", "⬜", "⬜"},
            {"⬜", "⬜", "⬜"},
            {"⬜", "⬜", "⬜"}
        };

        // Print the initial map
        printMap(map);

        // Ask the user for the position of the treasure
        System.out.print("Where do you want to put the treasure? (Enter as two digits, e.g., 23): ");
        String position = input.nextLine();

        // Extract the row and column from the input
        int column = Character.getNumericValue(position.charAt(0)) - 1;
        int row = Character.getNumericValue(position.charAt(1)) - 1;

        // Place the treasure on the map
        map[row][column] = "X";

        // Print the updated map
        printMap(map);

        input.close();
    }

    // Method to print the map
    public static void printMap(String[][] map) {
        for (String[] row : map) {
            for (String cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}