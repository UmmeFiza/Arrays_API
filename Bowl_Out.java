//Bowl-out 
/*
 * Assume a bowl-out situation between two teams A and B. Both the teams bowled out same number of wickets for the first “n” balls. Given the bowl-out sequence of team A for “n” balls, (if a wicket is hit, it is denoted by a “1” or if a bowler misses, it is denoted by a “0”), write a program to print the bowl-out sequence of team B using copyOf method.

Input Format:
First line of the input is an integer “n” that specifies the number of balls in the bowl-out.
Next “n” lines contain each either 0 or 1 based on the scoring of the bowl-out.

Output Format:
Output should display the scoring of bowl-out of team B, line by line.
If the array size is negative or any of the array elements is other than 0 or 1, print "Invalid Input" and terminate the program. 


Sample Input 1:
5
0
0
1
1
0
Sample Output 1:
0
0
1
1
0

Sample Input 2:
-5
Sample Output 2:
Invalid Input

Sample Input 3:
5
0
1
2
Sample Output 3:
Invalid Input
 */
//Source Code:
//package Arrays_API;
import java.util.*;
public class Bowl_Out {
	    public static void main(String args[]){
	        Scanner s = new Scanner(System.in);
	        int n = Integer.parseInt(s.nextLine());
	        if(n<0){
	            System.out.println("Invalid Input");
	            System.exit(1);
	        }
	        int[] Ateam = new int[n];
	        int[] Bteam = new int[n];
	        for(int i=0;i<n;i++){
	            Ateam[i] = Integer.parseInt(s.nextLine());
	             if(Ateam[i]<0 || Ateam[i]>1){
	            System.out.println("Invalid Input");
	            System.exit(1);
	            }
	        }
	        Bteam = Arrays.copyOf(Ateam,n);
	        for(int i=0;i<n;i++){
	        System.out.println(Bteam[i]);
	        }
	    }
	
}
