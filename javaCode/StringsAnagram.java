import java.util.Scanner;

/*
	Author: Lalitha Rajanala
	Code for problem : https://www.hackerrank.com/challenges/anagram 
*/
class StringAnagram
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int numOfStrings = keyboard.nextInt();
		String[] inputs  = new String[100];
		int i;
		int strLength = 0;
		for(i=0;i<numOfStrings;i++)
		{
			inputs[i] = keyboard.next();
		}
		
		for(i=0;i<numOfStrings;i++)
		{
			strLength = inputs[i].length();
			
			//If the length of the string is odd,return -1
			if(strLength%2 == 1)
			{
				System.out.println(-1);
			}
			else //If the length of the string is even,extract substring 
			{
				String processingNow = inputs[i];
				String firstString = processingNow.substring(0,((strLength/2)));
				String secondString = processingNow.substring((strLength/2));
			
				//System.out.println("First string: "+firstString+" ----Second string: "+secondString);	
				int tobeChangedInSubstring = firstString.length() - getInterSectionWithoutSort(firstString,secondString).length();
				System.out.println(tobeChangedInSubstring);
			}
		
		}
	}

    public static String getInterSectionWithoutSort(String str1,String str2)
	{
		int[] charCountArray1 = new int[26];
		int[] charCountArray2 = new int[26];
		int numCommon = 0;
		int value2=0;
		int value1=0;
		String commonString="";
		
		int strLength1 = str1.length();
		int strLength2 = str2.length();
		
		for(int i=0;i<strLength1;i++)
		{
			value1 = str1.charAt(i)-'a';
			charCountArray1[value1]++;
		}
		for(int j=0;j<strLength2;j++)
		{
			value2 = str2.charAt(j)-'a';
			charCountArray2[value2]++;
		}
		for(int k=0;k<26;k++)
		{
			numCommon = Math.min(charCountArray1[k],charCountArray2[k]);
			for(int r=0;r<numCommon;r++)
			{	
				commonString = commonString+(char)('a'+ k);
			}
		}
		return commonString;
	}


}
