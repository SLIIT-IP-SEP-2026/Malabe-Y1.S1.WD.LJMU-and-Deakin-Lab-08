import java.util.Scanner;

public class IT26102581Lab8Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] studentsArray = new int[8];
        int studentID,searchID,
        boolean found = false;

        for (int i = 0; i < studentsArray.length; i++) {

            System.out.print("Enter Student ID " + (i + 1) + " : ");
            studentID = input.nextInt();

            if (studentID > 0) {
                studentsArray[i] = studentID;
            }
            else {
                System.out.println("Error : Invalid Student ID");
                i--;
            }
        }

        System.out.print("\nEnter Student ID to Search : ");
        searchID = input.nextInt();

        for (int i = 0; i < studentsArray.length; i++) {

            if (studentsArray[i] == searchID) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Student is Available");
        }
        else {
            System.out.println("Student is Not Available");
        }
    }
}