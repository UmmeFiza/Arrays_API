//Historic Win 1
/*
 * The first line of the input is an integer “n” that specifies the number of batsmen who chased the target successfully.
Next “n” lines contain the scores of the “n” batsmen.

Output Format:
The output should display the scorecard with all the players in the squad, printing the scores of those batted players and zeroes for other players.
If the array size or any of the array elements is negative, print "Invalid Input" and terminate the program. 

Sample Input 1:
5
37
29
17
40
55
Sample Output 1:
37
29
17
40
55
0
0
0
0
0
0

Sample Input 2:
-5
Sample Output 2:
Invalid Input

Sample Input 3:
5
23
34
-19
Sample Output 3:
Invalid Input
 */
//package Arrays_API;
import java.util.*;
public class Historic_Win_1 {
	

	
	    public static void main(String args[]){
	        Scanner s  = new Scanner(System.in);
	        int n = Integer.parseInt(s.nextLine());
	        if(n<0){
	            System.out.println("Invalid Input");
	            System.exit(1);
	        }
	        int[] scard = new int[11];
	        for(int i =0;i<n;i++){
	            scard[i] = Integer.parseInt(s.nextLine());
	            if(scard[i]<0){
	            System.out.println("Invalid Input");
	            System.exit(1);
	            }
	        }
	        Arrays.fill(scard,n,11,0);
	        for(int i=0;i<11;i++){
	            System.out.println(scard[i]);
	        }
	    }
	
}
