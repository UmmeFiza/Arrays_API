//Catches Record
/*
 * Given there are “n” matches and an array in which each element contains the number of catches by Dhoni in the “n” matches, write a program to sort the matches based on the number of catches in ascending order. Use Sort method.
 * Input Format:
First line of the input is an integer “n” that specifies the number of matches that Dhoni has played.
Next “n” lines contain the number of catches in the “n” matches.

Output Format:
Output should display the sorted array based on the number of catches, line after line.
If the array size or any of the array elements is negative, print "Invalid Input" and terminate the program.

Sample Input1:
3
0
5
3
Sample Output1:
0
3
5

Sample Input2:
-3
Sample Output2:
Invalid Input

Sample Input3:
4
6
9
-1
Sample Output3:
Invalid Input
 */

//Source Code:
//package Arrays_API;
import java.util.*;
public class Catches_Record {
	    public static void main(String args[]){
	        Scanner s = new Scanner(System.in);
	        
	        int n = Integer.parseInt(s.nextLine());
	        if(n < 0){
	            System.out.println("Invalid Input");
	            System.exit(1);
	        }
	        int[] catches = new int[n];
	        for(int i = 0 ; i<n;i++){
	            catches[i] = Integer.parseInt(s.nextLine()); 
	            if(catches[i] < 0){
	            System.out.println("Invalid Input");
	            System.exit(1);
	            }
	        }
	        Arrays.sort(catches);
	        for(int i =0;i<n;i++)
	          System.out.println(catches[i]);  
	    }
	
}
