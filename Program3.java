import java.util.*;
public class Program3
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Input: ");  // taking the input
		int n=sc.nextInt();
		if(n%2==0){  // if it is even number subtracting 1 from it
		    n=n-1;
		}
		int i=1;
		int count=0;
		while(count<n){
		    if(i%2!=0){  // if it is odd printing it
		        System.out.print(i); 
		        count++;
		        if (count < n) {  // printing commas
                		System.out.print(", ");
		    }
		  }
		    i++;
	}
}
}