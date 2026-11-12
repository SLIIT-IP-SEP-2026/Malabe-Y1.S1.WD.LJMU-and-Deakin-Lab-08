import java.util.Scanner;

public class IT26102661Lab8Q3 {
	
    public static void main(String[] args) {
		
        Scanner value = new Scanner(System.in);

        int numbers[] = new int[6];
		
        int i = 0;
		
        int max;

        
        while (i < 6) {
			
            System.out.print("Enter a Positive Number (" + (i + 1) + "/6): ");
			
            int num = value.nextInt();

            if (num <= 0) {
				
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            } else {
				
                numbers[i] = num;
				
                i++;
            }
        }

        System.out.println("\nArray Contents:");

        
        for (i = 0; i < 6; i++) {
			
            System.out.print(numbers[i] + " ");
        }

        
		
        max = numbers[0];
		
        for (i = 1; i < 6; i++) {
			
            if (numbers[i] > max) {
				
                max = numbers[i];
            }
        }

        System.out.println("\nThe Maximum Number Entered: " + max);
    }
}