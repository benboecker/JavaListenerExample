package com.javalisteners;

import com.javalisteners.controller.JokeController;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.stage.Stage;

/**
 *
 */
public class App extends Application
{
	/**
	 * Entry method for the game, creates the JokeController.
	 * @param primaryStage The primary stage object, gets passed to the controller.
	 */
	public void start(Stage primaryStage)
	{
		JokeController areaController;
		areaController = new JokeController(primaryStage);
	}

	/**
	 * Fallback if start method doesn't get called.
	 * @param args the command line arguments
	 */
	public static void main(String[] args)
	{
		launch(args);
	}	
}
