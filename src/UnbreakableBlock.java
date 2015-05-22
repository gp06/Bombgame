
public class UnbreakableBlock extends Block 
{
	private int outlook;
	private int ItemDrop=0;
	
	public UnbreakableBlock(int Defence,int outlook,int ItemDrop)
	{
		super(Defence);
		this.outlook = outlook;
		this.ItemDrop = ItemDrop;
	}

	public int getItemdrop() {
		return ItemDrop;
	}

	public void setItemdrop(int itemdrop) {
		ItemDrop = itemdrop;
	}

	public int getOutlook() 
	{
		return outlook;
	}

	public void setOutlook(int outlook) {
		this.outlook = outlook;
	}
	
}

