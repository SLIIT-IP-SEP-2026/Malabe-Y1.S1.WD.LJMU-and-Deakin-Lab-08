import java.util.Scanner;

public class IT26102576Lab8Q4{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int studentsArray[] = new int[8];
        int i = 0;

        while(i < studentsArray.length){

            System.out.print("Enter Student ID for Student " + (i + 1) + ": ");
            int num = input.nextInt();

            if(num <= 0){
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            }
            else{
                studentsArray[i] = num;
                i++;
            }
        }

        System.out.println();

        System.out.print("Enter a Student ID to Search: ");
        int searchID = input.nextInt();

        boolean found = false;

        for(i = 0; i < studentsArray.length; i++){

            if(studentsArray[i] == searchID){
                found = true;
                break;
            }
        }
		
		System.out.println();

        if(found == true){
            System.out.println("Student is Available");
        }
        else{
            System.out.println("Student is Not Available");
        }

    }
}