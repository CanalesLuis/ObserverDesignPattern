/**
 * 
 * @author Luis
 *
 * The Subject interface is meant to be implemented
 * by the Watchman class, or the class that is meant
 * to moniter and inform the observers
 */
public interface Subject {
	public void registerObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyObservers();
}
