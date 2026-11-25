import java.util.Scanner;

public class IT26102577Lab8Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] studentsArray = new int[8];
        int i = 0;

        while (i < studentsArray.length) {
            System.out.print("Enter Student ID for Student " + (i + 1) + ": ");
            int id = sc.nextInt();
            if (id <= 0) {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            } else {
                studentsArray[i] = id;
                i++;
            }
        }

        System.out.print("\nEnter a Student ID to Search: ");
        int searchID = sc.nextInt();
        while (searchID <= 0) {
            System.out.println("Error: Please Enter ONLY Positive Numbers");
            System.out.print("Enter a Student ID to Search: ");
            searchID = sc.nextInt();
        }
        boolean found = false;
        for (i = 0; i < studentsArray.length; i++) {
            if (studentsArray[i] == searchID) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("\nStudent is Available");
        } else {
            System.out.println("\nStudent is Not Available");
        }
        sc.close();
    }
}
