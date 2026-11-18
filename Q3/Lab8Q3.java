import java.util.Scanner;

public class IT26102753Lab8Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[6];
        int count = 0;

        while (count < 6) {
            System.out.print("Enter a positive number: ");
            int num = sc.nextInt();

            if (num <= 0) {
                System.out.println("Invalid Input");
            } else {
                arr[count] = num;
                count++;
            }
        }

        int max = arr[0];

        for (int i = 1; i < 6; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Maximum Number = " + max);
    }
}