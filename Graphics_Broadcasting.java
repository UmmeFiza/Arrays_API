//Graphics Broadcasting

/* A part of the programming involved sorting of strings wherein two strings S1 and S2 are present and Dhilip has to sort the first string in ascending order and second string in descending order. Since Dhilip has to concentrate on more vital coding, can you help him program this requirement? Use Sort method.

Input Format:
First line of the input is the first string S1.
Second line of the input is the first string S2.
 
Output Format:
Output should display the sorted string in a single line.

Sample Input1:
hd
oin
Sample Output1:
dhoni

Sample Input2:
ivd
ay
Sample Output2:
divya
 */
//Source Code:

package Arrays_API;
import java.io.*;
import java.util.*;
import java.lang.*;
public class Graphics_Broadcasting {
	    public static void main(String args[])throws Exception{
	        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	        
	        String s1 = bf.readLine();
	        String s2 = bf.readLine();
	        String as1 = "";
	        
	        char temp[] = s1.toCharArray();
	        Arrays.sort(temp);
	        as1 = new String(temp);
	        System.out.print(as1);
	        
	        char temp2[] = s2.toCharArray();
	        Arrays.sort(temp2);
	        String as2 = new String(temp2);
	        StringBuilder str2 = new StringBuilder();
	        str2.append(as2);
	        str2 = str2.reverse();
	        for(int i=0;i<str2.length();i++)
	        System.out.print(str2.charAt(i));
	    }
	
}
