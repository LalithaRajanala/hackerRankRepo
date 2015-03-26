class Intersection
{
	public static void main(String[] args)
	{
		String str1 = "abcdde";
		String str2 = "abccdef";

		int str1Length = str1.length();
		int str2Length = str2.length();
		
		String interSection = "";
		
		int i = 0;
		int j = 0;
		
		while(i< str1Length && j< str2Length)
		{
			if(str1.charAt(i)== str2.charAt(j))
			{
				interSection = interSection+str1.charAt(i);
				i++;
				j++;
			}
			else if(str1.charAt(i) < str2.charAt(j))
			{
				i++;
			}
			else
			{
				j++;
			}
			
		}
		System.out.println(interSection);	
	}
}