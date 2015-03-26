import java.util.Scanner;
import java.util.HashMap;

class Pangrams
{

	public static void main(String[] args) 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner keyboard = new Scanner(System.in);
        String array = new String();
        array = keyboard.nextLine();  
        
        System.out.println(Pangrams.isPangram(array));
         
    }
    
    
    public static String isPangram(String string)
    {
    	int stringLength = string.length();
    	String stringNew = string.toLowerCase();
    	HashMap<Character,Integer> charMap = new HashMap<Character,Integer>();
    	String ispangramFlag = "pangram";
    	int currentValue = 0;
    	for(int i=0;i<stringLength;i++)
    	{
    			if(charMap.containsKey(stringNew.charAt(i)))
    			{
    				currentValue = charMap.get(stringNew.charAt(i));
    				charMap.put(stringNew.charAt(i),currentValue+1);
    			}
    			else
    			{
    				charMap.put(stringNew.charAt(i),1);
    			}
    	}
    	
    	Character charA = 'a';
    	int i = 0;
    	while(!(charA == '{'))
    	{
    		if(charMap.containsKey(charA))
    		{
    			i++;
    		}
			charA++;
    	}
    	if(i != 26)
    	{
    		ispangramFlag = "not pangram";
    	}
    	return ispangramFlag;
    }
}