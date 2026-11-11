import java.util.Scanner;

public class IT26102761Lab8Q3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[6];
        int i = 0;
        int max;

        while (i < 6) {

            System.out.print("Enter a Positive Number (" + (i + 1) + "/6): ");
            int num = sc.nextInt();

            if (num <= 0) {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            } else {
                arr[i] = num;
                i++;
            }
        }

        max = arr[0];

        for (i = 1; i < 6; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("\nArray Contents:");

        for (i = 0; i < 6; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nThe Maximum Number Entered: " + max);

        sc.close();
    }
}
