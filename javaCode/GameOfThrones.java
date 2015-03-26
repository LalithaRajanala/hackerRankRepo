import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GameOfThrones
{

    public static void main(String[] args) 
    {
        Scanner myScan = new Scanner(System.in);
        String ans;
        String inputString = myScan.nextLine();
        int length = inputString.length();
        char check = inputString.charAt(0);
        for(int i=1;i<length;i++)
        {
           check = (char)(check ^ inputString.charAt(i)); 
        }
	System.out.println("The final check is:"+check);
       	if((check == 0) && ((length%2) ==0))
	{
		ans = "YES";
	}
	else if((check != 0) && ((length%2) !=0))
	{
		ans = "YES";
        }
	else
	{
		ans = "NO";
	}
        // Assign ans a value of YES or NO, depending on whether or not inputString satisfies the required condition
        System.out.println(ans);
        myScan.close();
    }
}


