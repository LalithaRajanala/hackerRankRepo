import java.util.Scanner;
import java.util.Arrays;

/*	
	Code for coding problem https://www.hackerrank.com/challenges/make-it-anagram
 	Extract intersection and subtract the number of elements in intersection
	Author: Lalitha Rajanala
*/
class MakeItAnagram
{
	public static void main(String[] args) 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner keyboard = new Scanner(System.in);
        
        
        //Getting the string
        String str1 = keyboard.next();
        String str2 = keyboard.next();          
        String intersection =  MakeItAnagram.printIntersection(str1,str2);   
        
        
        int strLength1 = str1.length();
        int strLength2 = str2.length();
        int interSectionLength = intersection.length();
        
        int numOfDeletions = (strLength1+strLength2) - (2*interSectionLength);
        
        //Printing the output
        //System.out.println("The output is:"+intersection);
        System.out.println(numOfDeletions);
        
        
    }
    
    public static String printIntersection(String str1,String str2)
    {
  		char[] arr1 = str1.toCharArray();
  		char[] arr2 = str2.toCharArray();
  		
  		Arrays.sort(arr1);
  		Arrays.sort(arr2);
  		
    	String strSorted1 = new String(arr1);
		String strSorted2 = new String(arr2);

		int str1Length = strSorted1.length();
		int str2Length = strSorted2.length();
		
		String interSection = "";
		
		int i = 0;
		int j = 0;
		
		while(i < str1Length && j< str2Length)
		{
			if(strSorted1.charAt(i)== strSorted2.charAt(j))
			{
				interSection = interSection+strSorted1.charAt(i);
				i++;
				j++;
			}
			else if(strSorted1.charAt(i) < strSorted2.charAt(j))
			{
				i++;
			}
			else
			{
				j++;
			}
			
		}
		return interSection;	
    }



}
