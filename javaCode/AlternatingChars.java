import java.util.Scanner;

class AlternatingChars
{
        public static void main(String[] args)
        {
                Scanner keyboard = new Scanner(System.in);
                String[] stringArray = new String[10];
                int noOfStrings = keyboard.nextInt();
		String s = keyboard.nextLine();
                for(int i=0;i<noOfStrings;i++)
                {
                    stringArray[i] = keyboard.nextLine().toString();    
                }
		for(int i=0;i<noOfStrings;i++)
		{
			String myStr = stringArray[i].toString();
			char checkingChar = myStr.charAt(0);
			int numDeletions = 0;
			for(int j=1;j<myStr.length();j++)
			{
				if(myStr.charAt(j) == checkingChar)
				{
					numDeletions++;
				}
				else
				{
					checkingChar=myStr.charAt(j);
				}
			}
			System.out.println(numDeletions);    
		}
	}
}
