package com.javalisteners.model;

import com.javalisteners.interfaces.JokeListener;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.swing.event.EventListenerList;

public class JokeTeller
{
	private EventListenerList listeners = new EventListenerList();

	private static final List<String> jokes = Arrays.asList(
		"Sorry, aber du siehst so aus, wie ich mich fühle.",
		"Eine Null kann ein bestehendes Problem verzehnfachen.",
		"Wer zuletzt lacht, hat es nicht eher begriffen.",
		"Wer zuletzt lacht, stirbt wenigstens fröhlich.",
		"Unsere Luft hat einen Vorteil: Man sieht, was man einatmet."
	);

	public void tellJoke()
	{
		Collections.shuffle(this.jokes);
		this.notifyListeners(new Joke(this, this.jokes.get(0)));
	}
	
	public void addAdListener(JokeListener listener) 
	{
		this.listeners.add(JokeListener.class, listener);
	}
	
	public void removeAdListener(JokeListener listener)
	{
		this.listeners.remove(JokeListener.class, listener);
	}

	protected synchronized void notifyListeners(Joke joke)
	{
		for (JokeListener listener : this.listeners.getListeners(JokeListener.class))
		{
			listener.didGetJoke(joke);
		}
	}
}
