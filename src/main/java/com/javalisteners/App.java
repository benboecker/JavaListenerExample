package com.javalisteners;

import com.javalisteners.controller.JokeController;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.stage.Stage;


public class App extends Application
{
	public void start(Stage primaryStage)
	{
		JokeController areaController;
		areaController = new JokeController(primaryStage);
	}

	public static void main(String[] args)
	{
		launch(args);
	}	
}
