//Reliable Bowlers

/*
 * Given the performance statistics of “n” Indian bowlers based on the economy-rate, write a program to print the economy-rate of a particular bowler “x”. Use binarySearch method.
 Input Format:
First line of the input is an integer “n” that specifies the number of bowlers.
Next “n” lines is a string array containing the names of each of these bowlers.
Second set of “n” lines is a float array that contains the economy-rate of the corresponding bowlers.
Last line contains a string “x” whose economy-rate has to be printed.

Output Format:
Output should print the float value of the economy-rate of the player x, in a single line.
If the array size is negative, print "Invalid Input" and terminate the program.

Sample Input1:
2
Shami
Ashwin
5.65
8.92 
Ashwin 
Sample Output1:
8.92

Sample Input2:
-9
Sample Output2:
Invalid Input 
 */

//Source Code:

//package Arrays_API;
import java.io.*;
public class Reliable_Bowlers {
	
	public static void main(String args[])throws Exception{
	        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	        
	        int n = Integer.parseInt(bf.readLine());
	        if(n<0){
	            System.out.println("Invalid Input");
	            System.exit(1);
	        }
	        String[] name = new String[n];
	        float[] eco = new float[n];
	        
	        for(int i =0;i<n;i++)
	            name[i] = bf.readLine();
	        for(int i =0;i<n;i++){
	            eco[i] = Float.parseFloat(bf.readLine());
	            if(eco[i]<0){
	                System.out.println("Invalid Input");
	                System.exit(1);
	            }
	        }
	        String bowl = bf.readLine();
	        for(int i=0;i<n;i++){
	            if(name[i].equals(bowl)){
	                System.out.println(eco[i]);
	                break;
	            }
	        }
	    }
	
}
