public class IT26102787Lab8Q4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] studentsArray = new int[8];

        for (int i = 0; i < 8; i++) {

            System.out.print("Enter Student ID: ");
            studentsArray[i] = input.nextInt();

            if (studentsArray[i] <= 0) {
                System.out.println("Invalid Student ID!");
                i--;
            }
        }

        System.out.print("Enter Student ID to search: ");
        int searchID = input.nextInt();

        boolean found = false;

        for (int i = 0; i < 8; i++) {

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

        input.close();
    }
}