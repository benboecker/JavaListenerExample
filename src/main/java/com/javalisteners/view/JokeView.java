package com.javalisteners.view;

import com.javalisteners.interfaces.JokeButtonListener;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javax.swing.event.EventListenerList;

public class JokeView
{
	private final EventListenerList listeners = new EventListenerList();

	private final Stage stage;
	private final Scene scene;
	private final BorderPane pane;
	private final Label jokeLabel;
	private final Button jokeButton;
	
	public JokeView(Stage stage)
	{
		this.stage = stage;
		this.pane = new BorderPane();
		this.jokeLabel = new Label("Joke");
		this.jokeButton = new Button("Erzähl mir einen Witz!");
		this.jokeButton.setOnAction(new JokeButtonEventHandler());

		VBox vbox = new VBox();
		vbox.setPadding(new Insets(15, 12, 15, 12));
		vbox.setSpacing(10);
		vbox.setStyle("-fx-background-color: #336699;");
		vbox.getChildren().addAll(this.jokeButton, this.jokeLabel);

		this.scene = new Scene(this.pane, 500, 300);
		this.pane.setCenter(vbox);
	}
	
	public void showJokeView()
	{
		this.stage.setTitle("Schlechte Witze für alle");
		this.stage.setScene(this.scene);
		this.stage.show();
	}

	public void updateLabel(String string)
	{
		this.jokeLabel.setText(string);
	}

	public void addAdListener(JokeButtonListener listener) 
	{
		this.listeners.add(JokeButtonListener.class, listener);
	}
	
	public void removeAdListener(JokeButtonListener listener)
	{
		this.listeners.remove(JokeButtonListener.class, listener);
	}

	protected synchronized void notifyListeners()
	{
		for (JokeButtonListener listener : this.listeners.getListeners(JokeButtonListener.class))
		{
			listener.didPressJokeButton();
		}
	}
	
	
	class JokeButtonEventHandler implements EventHandler
	{
		public void handle(Event event)
		{
			JokeView.this.notifyListeners();
		}
	}
}
