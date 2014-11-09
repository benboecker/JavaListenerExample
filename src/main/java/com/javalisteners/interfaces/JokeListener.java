
package com.javalisteners.interfaces;

import com.javalisteners.model.Joke;
import java.util.EventListener;

public interface JokeListener extends EventListener
{
	void didGetJoke(Joke joke);
}
