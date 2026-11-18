import java.util.Scanner;

public class IT26102576Lab8Q3{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int myArray[] = new int[6];
        int i = 0;

        while(i < myArray.length){

            System.out.print("Enter a Positive Number (" + (i + 1) + "/6): ");
            int num = input.nextInt();

            if(num <= 0){
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            }
            else{
                myArray[i] = num;
                i++;
            }
        }

        int max = myArray[0];

        for(i = 1; i < myArray.length; i++){
            if(myArray[i] > max){
                max = myArray[i];
            }
        }

        System.out.println();
        System.out.println("Array Contents:");

        for(i = 0; i < myArray.length; i++){
            System.out.print(myArray[i] + " ");
        }

        System.out.println();
        System.out.println("The Maximum Number Entered: " + max);

    }
}