package com.javalisteners.view;


import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class JokeView
{
	/**
	 * The Stage object that displays the scene.
	 */
	private final Stage stage;
	/**
	 * The Scene object.
	 */
	private final Scene scene;
	/**
	 * A BorderPane object to layout the user interface elements.
	 */
	private final BorderPane pane;
	/**
	 * The Label object to display a joke.
	 */
	private final Label jokeLabel;
	/**
	 * The Button object to trigger a new joke.
	 */
	private final Button jokeButton;
	
	
	/**
	 * Constructor for the JokeView, creates and initializes the user interface.
	 *
	 * @param stage object that displays the area scene.
	 */
	public JokeView(Stage stage)
	{
		//this.delegate = delegate;

		// Stage
		this.stage = stage;

		// Layout
		this.pane = new BorderPane();

		// Number Label
		this.jokeLabel = new Label("Joke");

		// Number Button
		this.jokeButton = new Button("Erzähl mir einen Witz!");
		this.jokeButton.setOnAction(new JokeButtonEventHandler());

		VBox vbox = new VBox();
		vbox.setPadding(new Insets(15, 12, 15, 12));
		vbox.setSpacing(10);
		vbox.setStyle("-fx-background-color: #336699;");
		vbox.getChildren().addAll(this.jokeButton, this.jokeLabel);

		// Set scene size
		this.scene = new Scene(this.pane, 500, 300);
		this.pane.setCenter(vbox);
	}
	
	/**
	 * This method sets the scene to the stage and displays it.
	 */
	public void showJokeView()
	{
		this.stage.setTitle("Schlechte Witze für alle");
		this.stage.setScene(this.scene);
		this.stage.show();
	}

	/**
	 * Updates the joke label
	 */
	public void updateLabel()
	{
		
	}

	/**
	 * The EventHandler subclass for the button.
	 */
	class JokeButtonEventHandler implements EventHandler
	{
		/**
		 * This callback handles the button click and delegates it.
		 *
		 * @param event The button's click event.
		 */
		public void handle(Event event)
		{

		}
	}
}
