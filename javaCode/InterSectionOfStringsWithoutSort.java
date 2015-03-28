
class InterSectionOfStringsWithoutSort
{
	public static void main(String[] args)
	{
		InterSectionOfStringsWithoutSort inter = new InterSectionOfStringsWithoutSort();
		System.out.println(inter.getInterSectionWithoutSort("abccaabbc","bbc"));	
	}
	
	
	public String getInterSectionWithoutSort(String str1,String str2)
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