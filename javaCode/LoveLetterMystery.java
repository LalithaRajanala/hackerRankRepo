import java.util.Scanner;

class LoveLetterMystery
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int[] charArray = new int[256];
		int oddCount = 0;
		String palindrome;
			palindrome = keyboard.nextLine();
			for(int i=0;i<palindrome.length();i++)
			{
				charArray[(int)palindrome.charAt(i)]++;
			}
			for(int j=0;j<256;j++)
			{
				if((charArray[j] %2) ==1)
				{
					oddCount++;
				}
			}

			if(oddCount <= 1)
			{
				System.out.println("Yes");
			}
			else
			{
				System.out.println("No");
			}
	}
}
