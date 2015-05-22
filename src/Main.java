import java.util.Scanner;


public class Main 
{

	public static void main(String[] args) 
	{
		String name;
		int [][] position;
		position =new int[10][10];
	    int life=1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Set name:");
		name = sc.nextLine();
		Character one = new Character(name,1,1);
		System.out.println("Battle start!");
		while(life==1)
		{
			System.out.print(""+Character.name);
			System.out.printf(" you are at (%d,%d)\n",Character.Spotx,Character.Spoty);
			Character.movephase();
			Character.choosephase();
			
		}
		
		
		
	}

}
