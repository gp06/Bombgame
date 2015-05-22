import java.util.Random;

public class BreakableBlock extends Block
{
	private int Outlook;
	private int ItemDrop;
	
	Random ra = new Random();
	ItemDrop = ra.nextInt(4);
}
