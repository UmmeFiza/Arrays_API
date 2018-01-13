//Selected Squad 
/*
 * Input Format:
First line of the input is an integer “n” that specifies the number of players.
Next “n” lines each contains the names of the “n” players.

Output Format:
Output should display the string array with the names of “n” players.
If the array size is negative, print "Invalid Input" and terminate the program. 

Sample Input 1:
4
S Dhawan
MS Dhoni
AT Rayudu
MK Pandey
Sample Output 1:
[S Dhawan, MS Dhoni, AT Rayudu, MK Pandey]

Sample Input 2:
-5
Sample Output 2:
Invalid Input
 */

//Source Code:
//package Arrays_API;
import java.util.*;
import java.io.*;
public class Selected_Squad {
	    public static void main(String args[])throws Exception{
	        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	        
	        int n = Integer.parseInt(bf.readLine());
	        if(n<0){
	            System.out.println("Invalid Input");
	            System.exit(1);
	        }
	        String[] name = new String[n];
	        for(int i =0;i<n;i++){
	            name[i] = bf.readLine();
	        }
	        
	        System.out.println(Arrays.toString(name));
	    }
	
}
