import java.util.Observer;
import java.util.Observable;

class ObservableDemo extends Observable
{
	private String weather;

	public ObservableDemo(String weather)
    {
			this.weather = weather;
    }
	public String getWeather()
    {
	    return weather;
    }
	public void setWeather(String weather)
    {
	    this.weather = weather;
	    setChanged();
	    notifyObservers();
    }
}
public class ObserverDemo implements Observer
{
	private ObservableDemo weatherUpdate ;

    public void update(Observable observable, Object arg)
    {
		weatherUpdate = (ObservableDemo) observable;
		System.out.println("Weather Report Live. Its "+weatherUpdate.getWeather());
    }
	public static void main(String[] args)
    {
		ObservableDemo observable = new ObservableDemo(null);
		ObserverDemo observer = new ObserverDemo();
		observable.addObserver(observer);
		observable.setWeather("Bright and sunny...Let's play cricket!! ");
		observable.setWeather("Raining Heavily!..Let's have hot Pakodas!!");
    }
}