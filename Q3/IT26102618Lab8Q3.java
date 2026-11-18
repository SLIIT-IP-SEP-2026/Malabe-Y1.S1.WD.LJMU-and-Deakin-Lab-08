import java.util.Scanner;

public class IT26102618Lab8Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[6];

        int i = 0;
        while (i < numbers.length) {
            System.out.print("Enter a Positive Number (" + (i + 1) + "/6): ");
            int num = input.nextInt();

            if (num <= 0) {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            } else {
                numbers[i] = num;
                i++;
            }
        }

        System.out.println();
        System.out.println("Array Contents:");
        for (int j = 0; j < numbers.length; j++) {
            System.out.print(numbers[j] + " ");
        }
        System.out.println();

        
        int max = numbers[0];
        for (int j = 1; j < numbers.length; j++) {
            if (numbers[j] > max) {
                max = numbers[j];
            }
        }
        System.out.println("The Maximum Number Entered: " + max);
    }
}
