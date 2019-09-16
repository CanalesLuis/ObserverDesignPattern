/**
 * 
 * @author Luis
 * ShopOwner class, take in warning from Watchman
 * update warning status and print related 
 * message status
 * 
 */
public class ShopOwner implements Observer {
	private int warning;
	private Subject Watchman;
	
	public ShopOwner(Subject Watchman)
	{
		this.Watchman = Watchman;
		Watchman.registerObserver(this);
	}
	
	@Override
	public void update(int warning)
	{
		this.warning = warning;
		
		if(warning == 1)
			System.out.println("Shop Owner: Close down shop and head home");
		else if(warning == 2)
			System.out.println("Shop Owner: Drops everything and find nearest hideout");
	}
}
