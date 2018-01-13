//Run-Rate Display
/*
 * Given the “n” teams and the net run-rate of the “n” teams in a double array, write a program to sort the teams based on the net run-rate in ascending order. Use Sort method.
 Input Format:
First line of the input is an integer “n” that specifies the number of teams qualified for the tournament.
Next “n” lines contains a double value each that specifies the net run-rate of the “n” teams.

Output Format:
Output should display the sorted net run-rate of the teams, line by line.
If the array size or any of the array elements is negative, print "Invalid Input" and terminate the program.

Sample Input1:
5
2.05
9.05
1.50
6.55
4.78
Sample Output1:
1.5
2.05
4.78
6.55
9.05

Sample Input2:
2
-12.05
Sample Output2:
Invalid Input

Sample Input3:
-6
Sample Output3:
Invalid Input
 */
//Source Code:

//package Arrays_API;
import java.util.*;
import java.io.*;
public class Run_Rate {
	    public static void main(String args[])throws Exception{
	       BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	        
	        int n = Integer.parseInt(bf.readLine());
	        if(n<0){
	            System.out.println("Invalid Input");
	            System.exit(1);
	            
	        }
	        double[] rrate = new double[n];
	        for(int i = 0;i<n;i++){
	          rrate[i] = Double.parseDouble(bf.readLine());
	          if(rrate[i]<0){
	            System.out.println("Invalid Input");
	            System.exit(1);
	          }
	        }
	        Arrays.sort(rrate);
	        for(int i = 0;i<n;i++){
	            System.out.println(rrate[i]);
	        }
	    }
	
}
