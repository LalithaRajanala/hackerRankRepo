import java.io.*;
import java.util.Scanner;

class LoveLetterMysterSolution
{
    public static void main(String[] args) 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner keyboard = new Scanner(System.in);
        int numOfInputs = keyboard.nextInt();
        String[] array = new String[10];
        for(int i=0;i<numOfInputs;i++)
        {
            array[i] = keyboard.next(); 
        }  
        
        for(int j=0;j<numOfInputs;j++)
        {
        	System.out.println("The difference for string "+array[j]+" is:"+ LoveLetterMysterSolution.getDifference(array[j]));
        }
         
    }
    
    
    public static int getDifference(String string)
    {
    	int stringLength = string.length();
    	int i = 0;
    	int j = stringLength -1;
    	int difference =0;
    	
    	while(i<j)
    	{
    		difference = difference + Math.abs(string.charAt(i) - string.charAt(j));
    		i++;
    		j--;
    	}
    	return difference;
    }

}