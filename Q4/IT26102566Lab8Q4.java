import java.util.Scanner;

public class IT26102566Lab8Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] studentsArray = new int[8];
        int i = 0;

        // read 8 valid student IDs
        while (i < studentsArray.length) {
            System.out.print("Enter Student ID " + (i + 1) + ": ");
            int id = input.nextInt();

            if (id <= 0) {
                System.out.println("Error! Student ID must be a positive number.");
            } else {
                studentsArray[i] = id;
                i++;
            }
        }

        System.out.print("\nEnter the Student ID to search: ");
        int search = input.nextInt();

        boolean found = false;
        for (int j = 0; j < studentsArray.length; j++) {
            if (studentsArray[j] == search) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Student is Available");
        } else {
            System.out.println("Student is Not Available");
        }
    }
}
