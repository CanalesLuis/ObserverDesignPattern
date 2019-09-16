/**
 * 
 * @author Luis
 * Teacher class, take in warning from Watchman
 * update warning status and print related 
 * message status
 * 
 */
public class Teacher implements Observer {
	private int warning;
	private Subject Watchman;
	
	public Teacher(Subject Watchman)
	{
		this.Watchman = Watchman;
		Watchman.registerObserver(this);
	}
	
	@Override
	public void update(int warning)
	{
		this.warning = warning;
		
		if(warning == 1)
			System.out.println("Teacher: Helps get every kid home safe");
		else if(warning == 2)
			System.out.println("Teacher: Brings all students to the underground shelter");
	}

}
