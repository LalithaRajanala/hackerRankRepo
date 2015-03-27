package javaCode;
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
