import java.util.Scanner;

class FlippingBits
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int no_of_inputs = keyboard.nextInt();
		long[] array = new long[100];
		for(int i=0;i<no_of_inputs;i++)
		{
			array[i] = keyboard.nextLong();
		}
		for(int i=0;i<no_of_inputs;i++)
        {
            String inputNumString = Long.toBinaryString(array[i]);
	    String flippedString = Long.toBinaryString(~array[i]);
            System.out.println("The inputstring binary is:"+inputNumString);
	    System.out.println("The flipped string is:"+flippedString);
            FlippingBits.printNumberFromString(flippedString);
        }
	}
	public static void printNumberFromString(String inputString)
	{
		long finalNumber = 0;
		int length = inputString.length();
        //System.out.println("Length is"+length);
		for(int i=32;i<length;i++)
		{
			if(inputString.charAt(i) == '0')
			{
			}
			else
			{
				finalNumber= finalNumber + (long)Math.pow(2,(63-i));
			}
		
		}
		System.out.println(finalNumber);
	}

}
