//Historic Win 2 
/*
 * Input Format:
First line of the input is an integer “n” that specifies the number of batsmen who chased the target successfully.
Next “n” lines contain the scores of the “n” batsmen.
n+1th line of the input is an integer “m” that specifies the number of bowlers who bowled for the innings.
Next “m” lines contain the  number of wickets picked by “m” bowlers.

Output Format:
Output should display the contributions of all the players in the squad, by printing the scores of those batted players in the first “n” places, number of wickets picked by “m” bowlers in the last “m” places and fill the contributions of the remaining middle order players as 0.

If the array size or any of the array elements is negative, print "Invalid Input" and terminate the program. 

Sample Input 1:
4
34
27
19
45
2
3
1
Sample Output 1:
34
27
19
45
0
0
0
0
0
3
1

Sample Input 2:
-5
Sample Output 2:
Invalid Input

Sample Input 3:
5
32
45
-32
Sample Output 3:
Invalid Input
 */
//Source Code:

//package Arrays_API;
import java.util.*;
public class Historic_Win_2 {
	
	
	    public static void main(String args[]){
	        Scanner s = new Scanner(System.in);
	        int n = Integer.parseInt(s.next());
	        if(n<0){
	            System.out.println("Invalid Input");
	            System.exit(1);
	        }
	        int[] an = new int[11];
	        for(int i =0;i<n;i++){
	            an[i] = Integer.parseInt(s.next()); 
	            if(an[i]<0){
	            System.out.println("Invalid Input");
	            System.exit(1);
	            }
	        }
	        
	        int m = Integer.parseInt(s.next());
	        if(m<0){
	            System.out.println("Invalid Input");
	            System.exit(1);
	        }
	        int[] am = new int[m];
	        for(int i =0;i<m;i++){
	            am[i] = Integer.parseInt(s.next()); 
	            if(am[i]<0){
	            System.out.println("Invalid Input");
	            System.exit(1);
	            }
	        }
	        int last = 11-m;
	        Arrays.fill(an,n,last,0);
	        for(int i=0;i<m;i++){
	            an[last+i] = am[i];
	        }
	        for(int i=0;i<11;i++)
	            System.out.println(an[i]);
	    }
	
}
