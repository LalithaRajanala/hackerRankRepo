import java.util.Scanner;
class UtopianTree
{
	static int height = 1;
	public static void main(String[] args)
	{

		Scanner keyboard = new Scanner(System.in);		
		int noOfInputs = keyboard.nextInt();
		int[] array = new int[10];
		for(int i=0;i<noOfInputs;i++)
		{
			array[i] = keyboard.nextInt();
				
		}
		for(int i=0;i<noOfInputs;i++)
		{
			System.out.println(UtopianTree.calculateTreeHeight(array[i]));
		}
	}
	
	public static int calculateTreeHeight(int cycle)
	{
			int returnHeight=0;
			if(cycle == 0)
			{
				returnHeight = height;
			}
			else if(cycle==1)
			{
				returnHeight = 2*height;
			}
			else if((cycle>1) && ((cycle%2)==0))
			{
				returnHeight = (int)UtopianTree.calculateTreeHeight((int)(cycle-1))+ 1;
			}
			else if((cycle>1) && ((cycle%2)==1))
			{
				returnHeight= 2*((int)UtopianTree.calculateTreeHeight((int)(cycle-1)));
			}
			return returnHeight;
	}

} 
