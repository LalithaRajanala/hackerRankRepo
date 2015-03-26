import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Set;
import java.util.Iterator;
import java.util.Arrays;

class GemElements
{

	public static void main(String[] args) 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner keyboard = new Scanner(System.in);
        int numOfInputs = keyboard.nextInt();
        ArrayList<String> array = new ArrayList<String>();
        for(int i=0;i<numOfInputs;i++)
        {
        	array.add(keyboard.next());
        }          
        GemElements.countGems(array);     
    }
     
    public static void countGems(ArrayList<String> string)
    {
    	int size = string.size();
    	String start = "";
    	start = string.get(0);
    	for(int i=1;i<size;i++)
    	{
    		start = GemElements.printIntersection(start,string.get(i));
    	}	
    	
    	System.out.println(start.length());	
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