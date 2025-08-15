import java.util.*;
public class Program2
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter the Input: "); // taking the input
		int n=sc.nextInt();
		int count=0;
		int i=1;
		while(count<n){
		    if(i%2!=0){    //printing the odd numbers
		        System.out.print(i);
		        count++;
		        if (count < n) { // printing the commas
                System.out.print(", ");
                }
		    }
		    i++;
		}
	}
}