Import java.util.Scanner;

public class IT26102662Lab8Q1B {
	
    public static void main(String[] args) {
		
        Scanner value = new Scanner(System.in);

        int myArray[] = new int[5];
		
        int evenArray[] = new int[5];
		
        int j = 0;

        System.out.println("Enter 5 Numbers:");

        
        for (int num = 0; num < 5; num++) {
			
            System.out.print("Enter Number : " + (num + 1) );
			
            myArray[num] = value.nextInt();
        }

        System.out.println("myArray Contents:");

        
        for (int num = 0; num < 5; num++) {
			
            System.out.print(myArray[i]);
        }

        
        for (int num = 0; num < 5; num++) {
			
            if (myArray[num] % 2 == 0) {
				
                evenArray[j] = myArray[num];
				
                j++;
            }
        }
        
		System.out.println("evenArray Contents:");

        
        for (int num = 0; num < 5; num++) {
			
            System.out.print(evenArray[num]);
        }
    }
}