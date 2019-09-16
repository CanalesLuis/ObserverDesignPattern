/**
 * 
 * @author Luis
 * Knight class, take in warning from Watchman
 * update warning status and print related 
 * message status
 * 
 */
public class Knight implements Observer {
	private int warning;
	private Subject Watchman;
	
	public Knight(Subject Watchman)
	{
		this.Watchman = Watchman;
		Watchman.registerObserver(this);
	}
	
	@Override
	public void update(int warning)
	{
		this.warning = warning;
		
		if(warning == 1)
			System.out.println("Knight: Helps everyone get home safe");
		else if(warning == 2)
			System.out.println("Knight: Prepares for battle");
	}
}