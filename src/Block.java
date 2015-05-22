
public abstract class Block 
{
	private int Defence;
		
	protected Block(int Defence)
	{
		this.Defence = Defence;
	}

	public int getDefence() {
		return Defence;
	}

	public void setDefence(int defence) {
		Defence = defence;
	}
	
}

