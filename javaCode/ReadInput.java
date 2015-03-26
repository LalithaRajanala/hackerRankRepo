import java.util.Scanner;


class ReadInput
{
	public static void main(String[] args)
	{
			Scanner keyboard = new Scanner(System.in);
			int num = 0;
			String str = keyboard.next();
			boolean pointReached = false;
			while(keyboard.hasNextInt())
			{
				num = keyboard.nextInt();
				if(num != 42 && !pointReached)
				{
					str = str+"\n"+num;
				}
				if(num == 42)
				{
					break;
				}
			}
			System.out.println(str);
	}
}
