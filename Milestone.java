//Milestone of Indian cricket 
/*
 * Input Format:
The first line of the input is an integer “N” that specifies the number of batsmen  batted in the first innings.
Next “N” lines contain each the score of these batsmen who batted in the first innings.
N+1th line contains an integer “M” that specifies the number of batsmen batted in the second innings.
Next “M” lines contain each the score of these batsmen who batted in the second innings.
 
Output Format:
Output should display the merged array in ascending order line after line.
If the array size or any of the array elements is negative, print "Invalid Input" and terminate the program.

Sample Input 1: 
3
150
250
310
4
125
200
225
325 
Sample Output1: 
125
150
200
225
250
310
325 
 
Sample Input2: 
3
200
-150 
Sample Output2: 
Invalid Input 

Sample Input3: 
-1 
Sample Output3: 
Invalid Input 
 */
//package Arrays_API;
import java.util.*;
public class Milestone {
	public static void main(String args[]){
	    Scanner s = new Scanner(System.in);
	    
	    int n = Integer.parseInt(s.nextLine());
	    if(n<0){
	        System.out.println("Invalid Input");
	        System.exit(1);
	    }
	    int[] an = new int[n];
	    for(int i = 0;i<n;i++){
	        an[i] = Integer.parseInt(s.nextLine());
	        if(an[i]<0){
	        System.out.println("Invalid Input");
	        System.exit(1);
	        }
	    }
	    int m = Integer.parseInt(s.nextLine());
	    if(m<0){
	        System.out.println("Invalid Input");
	        System.exit(1);
	    }
	    int[] am = new int[m];
	    for(int i = 0;i<m;i++){
	        am[i] = Integer.parseInt(s.nextLine());
	        if(am[i]<0){
	        System.out.println("Invalid Input");
	        System.exit(1);
	        }
	    }
	    int[] ac = new int[n+m];
	    for(int i = 0;i<n;i++){
	        ac[i] = an[i];
	    }
	    for(int i = 0;i<m;i++){
	        ac[n+i] = am[i];
	    }
	    Arrays.sort(ac);
	    for(int i = 0;i<(n+m);i++){
	        System.out.println(ac[i]);
	    }
	    }
	
}
