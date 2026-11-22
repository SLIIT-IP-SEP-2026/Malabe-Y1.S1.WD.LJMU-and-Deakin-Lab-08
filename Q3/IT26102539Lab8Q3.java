import java.util.Scanner;

public class IT26102539Lab8Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[6];

        for (int i = 0; i < 6; i++) {
            while (true) {
                System.out.print("Enter a Positive Number (" + (i + 1) + "/6): ");
                int num = sc.nextInt();
                if (num > 0) {
                    numbers[i] = num;
                    break;
                } else {
                    System.out.println("Error: Please Enter ONLY Positive Numbers");
                }
            }
        }

        System.out.println("\nArray Contents:");
        int max = numbers[0];
        for (int i = 0; i < 6; i++) {
            System.out.print(numbers[i] + " ");
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("\nThe Maximum Number Entered: " + max);
        sc.close();
    }
}
