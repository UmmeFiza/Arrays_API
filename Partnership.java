//Partnership
/*
 * Input Format:
First line of the input is an integer that contains the number of partnerships “n”.
Every 3 lines after the first line, contains the details of “n” partnerships namely, names of the pair of players involved in the partnership and their scores as string in each line.

Output Format:
Output should display the string array with the details of “n”  partnerships, namely the names of the players in the partnership and their scores.
If the array size is negative, print "Invalid Input" and terminate the program. 


Sample Input 1:
3
MS Dhoni
S Dhawan
102
V Kohli
AT Rayudu
57
M Vijay        
HH Pandya
43
Sample Output 1:
[[MS Dhoni, S Dhawan, 102], [V Kohli, AT Rayudu, 57], [M Vijay, HH Pandya, 43]]

Sample Input 2:
-5
Sample Output 2:
Invalid Input
 */
//Source Code:
//package Arrays_API;
import java.util.*;
	import java.io.*;
public class Partnership {
	    public static void main(String args[])throws Exception{
	        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	        int n =Integer.parseInt(bf.readLine());
	        if(n<0){
	            System.out.println("Invalid Input");
	            System.exit(1);
	        }
	        String[][] patner = new String[n][3];
	        for(int i = 0;i<n;i++){
	            patner[i][0] = bf.readLine();
	            patner[i][1] = bf.readLine();
	            patner[i][2] = bf.readLine();
	        }
	        System.out.println(Arrays.deepToString(patner));
	    }
	
}
