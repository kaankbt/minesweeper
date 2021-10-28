import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int row, column;

        System.out.println("Welcome to the minesweeper game !");
        System.out.println("Enter the map sizes !");
        System.out.print("Row :");
        row = scan.nextInt();
        System.out.print("Column :");
        column = scan.nextInt();

        MinesWeeper minesWeeper = new MinesWeeper(row, column);
        minesWeeper.run();
    }
}
