
import java.util.*;
public class Program4
{
	public static void main(String[] args) {
		HashMap<Integer,Integer> hs=new HashMap<>();  //to store the data in the form pairs
		int arr[]={1,2,8,9,12,46,76,82,15,20,30};
		for(int i=0;i<arr.length;i++){
		    for(int j=1;j<=9;j++){
		        if(arr[i]%j==0){   // if it is divide by any number from 0-9 then the count for the oarticular number will increse
		            hs.put(j,hs.getOrDefault(j,0)+1);   //function to put the data
		        }
		    }
		    
		}
		System.out.println(hs);  // printing the hashset
	}
}
