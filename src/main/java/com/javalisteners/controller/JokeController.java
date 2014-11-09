
package com.javalisteners.controller;

import com.javalisteners.interfaces.JokeButtonListener;
import com.javalisteners.interfaces.JokeListener;
import com.javalisteners.model.Joke;
import com.javalisteners.model.JokeTeller;
import com.javalisteners.view.JokeView;
import javafx.stage.Stage;


public class JokeController implements JokeListener, JokeButtonListener
{
	private final JokeTeller jokeTeller;
	
	private final JokeView view;
	
	
	public JokeController(Stage stage)
	{
		this.jokeTeller = new JokeTeller();
		this.view = new JokeView(stage);
		this.view.showJokeView();
		
		this.view.addAdListener(this);
		this.jokeTeller.addAdListener(this);
	}

	public void didGetJoke(Joke joke)
	{
		this.view.updateLabel(joke.getContent());
	}

	public void didPressJokeButton()
	{
		this.jokeTeller.tellJoke();
	}
}