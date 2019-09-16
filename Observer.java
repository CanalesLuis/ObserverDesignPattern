/**
 * 
 * @author Luis
 * Observer interface is meant to be implemented
 * by the Classes that need to Observe or obtain
 * an input from the Watchman Class or 
 * Subject interface
 * 
 */
public interface Observer {
	public void update(int warning);
}
