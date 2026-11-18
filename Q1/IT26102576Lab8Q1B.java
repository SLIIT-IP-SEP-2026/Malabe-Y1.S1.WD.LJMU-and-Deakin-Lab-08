import java.util.Scanner;

public class IT26102576Lab8Q1B{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int myArray[] = new int[5];
		int i;
		
		int evenArray[] = new int[5];
		int j = 0;
		
		System.out.println("Enter 5 Numbers:");
		
		for(i = 0; i < myArray.length; i++){
			System.out.print("Enter Number " + (i+1) +" : ");
			myArray[i] = input.nextInt();
		}
		
		for(i = 0; i < myArray.length; i++){
			if(myArray[i] % 2 == 0){
				evenArray[j] = myArray[i];
				j++;
			}
		}
		
		System.out.println();
		System.out.println();
		System.out.println("myArray contents are: ");
		
		for(i = 0; i < evenArray.length; i++){
			System.out.print(myArray[i] + " ");
		}
		
		System.out.println();
	System.out.println();
		System.out.println("evenArray contents are: ");
		
		for(i = 0; i < evenArray.length; i++){
			System.out.print(evenArray[i] + " ");
		}
	}
}