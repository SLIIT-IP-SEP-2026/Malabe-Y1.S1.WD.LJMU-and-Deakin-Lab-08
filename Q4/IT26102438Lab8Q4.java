import java.util.Scanner;

public class IT26102438Lab8Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] studentsArray = new int[8];
        int count = 0;

        while (count < studentsArray.length) {
            System.out.print("Enter Student ID for Student " + (count + 1) + ": ");
            int studentId = input.nextInt();

            if (studentId <= 0) {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            } else {
                studentsArray[count] = studentId;
                count++;
            }
        }

        System.out.println();
        System.out.print("Enter a Student ID to Search: ");
        int searchId = input.nextInt();

        boolean found = false;

        for (int i = 0; i < studentsArray.length; i++) {
            if (studentsArray[i] == searchId) {
                found = true;
                break;
            }
        }

        System.out.println();

        if (found) {
            System.out.println("Student is Available");
        } else {
            System.out.println("Student is Not Available");
        }
    }
}
