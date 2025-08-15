import java.util.*;
public class Program1
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First Value : ");	//to take the input
		double a=sc.nextInt();
		System.out.print("Enter Second Value : ");   //to take the input
		double b=sc.nextInt();
		System.out.print("Enter the operation you need to perform: ");
		String operation=sc.next().toLowerCase();  //converting the string into lower case
		double ans;
		switch(operation){
		     case "addition":  // this is for addition
		        ans=a+b;
		        System.out.println(ans);
		        break;
		     case "subraction":  //this is for subraction
		        ans=a-b;
		        System.out.println(ans);
		        break;
		     case "multiplication":   //this is for multiplication
		        ans=a*b;
		        System.out.println(ans);
		        break;
		     case "division":  //this is for division
		        if(b==0){
		            System.out.println("dividing with zero is not possible"); // handling the exceeption
		        }
		        else{
		             ans=a/b;
		             System.out.println(ans);
		        }
		        break;
		     default:
		        System.out.println("Enter a valid Option");   // other than any input
		}
	}
}