import java.util.Scanner;

public class Assignment_4 {
    public static void main(String[] args) {
        int[] nums = new int[10];
        Scanner input = new Scanner(System.in);

        System.out.println("ENTER 10 NUMBERS:");
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Enter the number for index " + i + ": \n");
            nums[i] = input.nextInt();
        }

        System.out.println("ENTERED INPUTS:");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        input.close();
    }
}
