//Best Wicket Keeper
/*
 * Input Format:
First 4 lines of the input are integers that contain the statistics of Dhoni, the Total number of Wins, number of losses, Number of stumpings and number of catches.
Next 4 lines of the input are integers that contain the statistics of Sangakkara, the Total number of Wins, number of losses, Number of stumpings and number of catches.

Output Format:
If the statistics of the players in the both the arrays are same print “Same”. Else print “Different”.
If the array size or any of the array elements is negative, print "Invalid Input" and terminate the program.

Sample Input1:
100
200
300
400
100
200
300
400
Sample Output1:
Same

Sample Input2:
500
600
800
900
100
200
400
700
Sample Output2:
Different

Sample Input3:
200
150
300
20
20
-2
Sample Output2:
Invalid Input
 */

//Source Code:
package Arrays_API;

import java.util.*;
public class Wicket_Keeper {
	    public static void main(String args[]){
	        Scanner s = new Scanner(System.in);
	        boolean flag = false;
	        int[] dhoni = new int[4];
	        int[] sanga = new int[4];
	        for(int i = 0;i<4;i++){
	            dhoni[i] = Integer.parseInt(s.nextLine());
	            if(dhoni[i]<0){
	                System.out.println("Invalid Input");
	                System.exit(1);
	            }
	        }
	        
	        for(int i = 0;i<4;i++){
	            sanga[i] = Integer.parseInt(s.nextLine());
	            if(sanga[i]<0){
	                System.out.println("Invalid Input");
	                System.exit(1);
	            }
	        }
	        flag = Arrays.equals(dhoni,sanga);
	        if(flag)
	            System.out.println("Same");
	        else
	            System.out.println("Different");
	    }
	
}
