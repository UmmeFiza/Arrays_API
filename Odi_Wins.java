//ODI Wins
/*
 * Input Format:
First line of the input is an integer “n” that specifies the number of Years considered.
Even indexed lines from the second line of the input contain “n” Years.
Odd indexed lines from the second line of the input contain the number of Wins in the corresponding “n” years.
Last line contains an integer “x” that specifies a particular year in which the number of wins is to be known.

Output Format:
Output should display in a single line an integer that gives the number of wins in the year “x”.
Assume that the "x" year will always be present in the  year array.
If the array size or any of the array elements is negative, print "Invalid Input" and terminate the program.

Sample Input1:
3
2015
100
2016
150
2017
20
2017
Sample Output1:
20

Sample Input2:
-5
Sample Output2:
Invalid Input

Sample Input3:
2
2016
-300
Sample Output3:
Invalid Input 
 */

// Source Code:
//package Arrays_API;
import java.io.*;
import java.util.*;
public class Odi_Wins {
	    public static void main(String args[])throws Exception{
	        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	        
	        int n = Integer.parseInt(bf.readLine());
	        if(n<0){
	            System.out.println("Invalid Input");
	            System.exit(1);
	        }
	        int[] year = new int[n];
	        int[] win = new int[n];
	        
	        for(int i = 0;i < n;i++){
	            year[i] = Integer.parseInt(bf.readLine());
	            if(year[i]<0){
	                System.out.println("Invalid Input");
	                System.exit(1);
	            }
	            win[i] = Integer.parseInt(bf.readLine());
	            if(win[i]<0){
	                System.out.println("Invalid Input");
	                System.exit(1);
	            }
	        }
	        int searchYear = Integer.parseInt(bf.readLine());
	        if(searchYear<0){
	            System.out.println("Invalid Input");
	            System.exit(1);
	        }
	        
	           int pos = Arrays.binarySearch(year,searchYear);
	           if(pos>=0){
	                System.out.println(win[pos]);
	            }
	        }	    
}
