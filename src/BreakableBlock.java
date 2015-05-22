import java.util.Random;

public class BreakableBlock extends Block
{
	private int Outlook;
	private int ItemDrop;
	
	public BreakableBlock(int Defence,int Outlook,int ItemDrop)
	{
		super(Defence);
		this.Outlook = Outlook;
		this.ItemDrop = ItemDrop;
	}
	
	Random ra = new Random();
	ItemDrop = ra.nextInt(4);
}
