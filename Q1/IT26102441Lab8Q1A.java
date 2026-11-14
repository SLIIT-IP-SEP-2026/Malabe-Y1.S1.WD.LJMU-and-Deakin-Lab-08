import java.util.Scanner;
public class IT26102441Lab8Q1A{
	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		int myArray[] = new int [5];
		System.out.println("Enter 5 Numbers:");
		for(int n=0;n<5;n++){
			System.out.println("Enter Number "+(n+1)+":");
			myArray[n] = obj.nextInt(); 
		}
		System.out.println("Array in Reverse Order:");
		for(int n=4;n>=0;n--){
			System.out.print(myArray[n]+" ");
		}
	}
}