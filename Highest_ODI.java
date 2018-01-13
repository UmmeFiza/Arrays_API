//Highest ODI score
/*
 *Given are “n” number of batsmen and two arrays, the first array containing the names of the batsmen and the second array containing the highest score of the corresponding batsmen. Write a program to find the names of all batsmen from “n” who have scored exactly 183 runs as that of Dhoni. Use Equals method.

Input Format:
First line of the input is an integer “n” that specifies the number of batsmen.
“n” Even numbered lines from the second line of the input contains a string each denoting the the names of the batsmen.
“n” Odd numbered lines from the second line of the input contains an integer each denoting the highest score of the corresponding batsmen.

Output Format:
Output should display the strings line after line, that corresponds to the name of the batsmen who have scored 183. If there are no batsmen who have got 183, then print “None”.
If the array size or any of the array elements is negative, print "Invalid Input" and terminate the program.

Sample Input1:
2
Sachin
200
Ganguly
183
Sample Output1: 
Ganguly 

Sample Input2:
-5
Sample Output2:
Invalid Input

Sample Input3:
3 
Sachin 
200
Rohit
264
Guptill
237
Sample Output3:
None

Sample Input4:
2
kohli
-200
Sample Output4:
Invalid Input 
 */

// Source Code:

package Arrays_API;
import java.io.*;
import java.util.*;
public class Highest_ODI{
	    public static void main(String args[])throws Exception{
	        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	        int i;
	        boolean flag = false;
	        int n = Integer.parseInt(bf.readLine());
	        if(n<0){
	            System.out.println("Invalid Input");
	            System.exit(1);
	        }
	        String[] name = new String[n];
	        int[] runs = new int[n];
	        for(i=0;i<n;i++){
	            name[i] = bf.readLine();
	            runs[i] = Integer.parseInt(bf.readLine());
	            if(runs[i]<0){
	                System.out.println("Invalid Input");
	                System.exit(1);
	            }
	        }
	        int r = 183;
	        for(i=0;i<n;i++){
	            switch(runs[i]){
	                case 183: System.out.println(name[i]);
	                flag = true;
	                break;
	            }
	        }
	            
	        
	        if(flag == false)
	            System.out.println("None");
	}
	
}
