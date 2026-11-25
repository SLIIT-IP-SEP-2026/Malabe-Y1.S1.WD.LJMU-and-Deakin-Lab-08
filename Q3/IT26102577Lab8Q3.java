import java.util.Scanner;

public class IT26102577Lab8Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] myArray = new int[6];
        int i = 0;

        while (i < myArray.length) {
            System.out.print("Enter a Positive Number (" + (i + 1) + "/6): ");
            int num = sc.nextInt();
            if (num <= 0) {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            } else {
                myArray[i] = num;
                i++;
            }
        }

        int max = myArray[0];
        System.out.println("\nArray Contents:");
        for (i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
            if (myArray[i] > max) {
                max = myArray[i];
            }
        }
        System.out.println("\nThe Maximum Number Entered: " + max);
        sc.close();
    }
}
