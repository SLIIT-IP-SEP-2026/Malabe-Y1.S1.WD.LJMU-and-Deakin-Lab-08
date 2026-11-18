import java.util.Scanner;
public class IT26102582Lab8Q4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int studentsArray[] = new int[8];
        int studentID;

        for (int count = 0; count < 8; count++) {

            System.out.print("Enter Student ID for Student "+ (count + 1) + ": ");
            studentID = input.nextInt();

            if (studentID <= 0) {

                System.out.println("Error: Please Enter ONLY Positive Numbers");
				count--;
			}

            else {
                studentsArray[count] = studentID;
            }
        }

        System.out.println();

        System.out.print("Enter a Student ID to Search: ");
        int searchID = input.nextInt();
		
		System.out.println();

        boolean found = false;

        for (int count = 0; count < 8; count++) {

            if (studentsArray[count] == searchID) {
                found = true;
            }
        }

        if (found == true) {
            System.out.println("Student is Available");
			}
			
		else {
            System.out.println("Student is Not Available");
        }
    }
}