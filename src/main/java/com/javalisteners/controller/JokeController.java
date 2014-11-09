
package com.javalisteners.controller;

import com.javalisteners.model.JokeTeller;
import com.javalisteners.view.JokeView;
import javafx.stage.Stage;


public class JokeController
{

	private final JokeTeller jokeTeller;
	
	private final JokeView view;
	
	
	public JokeController(Stage stage)
	{
		this.jokeTeller = new JokeTeller();
		this.view = new JokeView(stage);
		this.view.showJokeView();
	}
}