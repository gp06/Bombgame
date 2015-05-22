import java.util.Scanner;


public class Character 
{
	public static int Spotx=4;
	public static int Spoty=4;

	public static String name;
	private int Attack =1;
	private int Defence = 0;
	private static int MoveSpeed;
	private static int DeployMax;
	private int FireRange =1;
	private static int move ;
	
	
	public Character(String name,int MoveSpeed, int DeployMax)
	{
		this.name = name;
		this.MoveSpeed = MoveSpeed;
		this.DeployMax = DeployMax;
	}
	
	static Scanner sc = new Scanner(System.in);
	public static void movephase()
	{
		System.out.print("Please choose where to go (8 is up,2 is down,4 is left,6 is right):");
		move = sc.nextInt();
		if(move==8)
		{
			if(getSpotx()+1>9)
			{
				System.out.println("Can't move that way!");
				movephase();
			}
			else
			{
				Spotx++;
			}
		}
		else if(move==2)
		{
			if(getSpotx()-1<0)
			{
				System.out.println("Can't move that way!");
				movephase();
			}
			else
			{
				Spotx--;
			}
		}
		else if(move==4)
		{
			if(getSpoty()-1<0)
			{
				System.out.println("Can't move that way!");
				movephase();
			}
			else
			{
				Spoty--;
			}
		}
		else if(move==6)
		{
			if(getSpoty()+1>9)
			{
				System.out.println("Can't move that way!");
				movephase();
			}
			else
			{
				Spoty++;
			}
		}
	}
	public static void choosephase()
	{
		
	}
	
	public static int getSpotx() {
		return Spotx;
	}

	public void setSpotx(int spotx) {
		Spotx = spotx;
	}

	public static int getSpoty() {
		return Spoty;
	}

	public void setSpoty(int spoty) {
		Spoty = spoty;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAttack() {
		return Attack;
	}

	public void setAttack(int attack) {
		Attack = attack;
	}

	public int getDefence() {
		return Defence;
	}

	public void setDefence(int defence) {
		Defence = defence;
	}

	public int getMoveSpeed() {
		return MoveSpeed;
	}

	public void setMoveSpeed(int moveSpeed) {
		MoveSpeed = moveSpeed;
	}

	public int getDeployMax() {
		return DeployMax;
	}

	public void setDeployMax(int deployMax) {
		DeployMax = deployMax;
	}

	public int getFireRange() {
		return FireRange;
	}

	public void setFireRange(int fireRange) {
		FireRange = fireRange;
	}
}
