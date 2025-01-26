import java.util.Scanner;

public class Two_Dimension {
    public static void main(String[] args) {
        int[][] array = new int[11][11];
        Scanner input = new Scanner(System.in);

        System.out.println("INPUT 100 NUMBERS FOR 2D ARRAY");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Enter a number for row " + i + ", and column " + j + ": ");
                array[i][j] = input.nextInt();
            }
        }

        System.out.println("\nYou entered the following numbers");
        for (int[] row : array) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        input.close();
    }
}
