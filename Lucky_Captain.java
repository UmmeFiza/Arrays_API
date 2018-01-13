//Lucky captain
/*
 * Input Format:
First line of the input is an integer “N” that specifies the scores of Dhoni in all “N” matches of the series.
If the array size or any of the array elements is negative, print "Invalid Input" and terminate the program.
 
Output Format:
Output should display a float value that gives the median of Dhoni's scores in the complete series. 
If the array size or any of the array elements is negative, print "Invalid Input" and terminate the program. 

Sample Input1:
3
6
9
8
Sample Output1:
8.0
 
Sample Input2:
-1
Sample Output2:
Invalid Input
 
Sample Input3:
3
2
-4
Sample Output3:
Invalid Input
 
Sample Input4:
4
2
3
6
5
Sample Output4:
4.0

 */
//Source Code:
//package Arrays_API;
import java.util.*;
public class Lucky_Captain {
	
	
	    public static void main(String args[]){
	        Scanner s = new Scanner(System.in);
	        float avg = 0f;
	        int n = Integer.parseInt(s.nextLine());
	        if(n<0){
	            System.out.println("Invalid Input");
	            System.exit(1);
	        }
	        int[] runs = new int[n+1];
	        for(int i=1;i<=n;i++){
	            runs[i] = Integer.parseInt(s.nextLine());
	            if(runs[i]<0){
	                System.out.println("Invalid Input");
	                System.exit(1);
	            } 
	        }
	        Arrays.sort(runs);
	        int mid = n/2;
	        if(n%2==0){
	           avg = (float)(runs[mid] + runs[mid+1])/2;
	        }
	        else
	            avg = runs[mid+1];
	        System.out.println(avg);
	    }
	
}
