import java.util.Scanner;
public class IT26102441Lab8Q1B{
	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		int myArray[] = new int[5];
		int evenArray[] = new int[5];
		System.out.println("Enter 5 Numbers:");
		for (int n=0;n<5;n++){
			System.out.println("Enter Number "+(n+1)+":");
			myArray[n] = obj.nextInt();
		}
		System.out.println("myArray Contents:");
		 for(int n=0;n<5;n++){
			 System.out.print(myArray[n]+" ");
		}
		 System.out.println();
		 System.out.println("evenArray Contents:");
		  int e=0;
		 for(int n=0;n<5;n++){
			 if(myArray[n]%2==0){
				
				 evenArray[e]= myArray[n];
				 e++;
			 }	
		 }
		 for (int n = 0; n < 5; n++) {
			 System.out.print(evenArray[n]+" ");
		 }	 
	}
}