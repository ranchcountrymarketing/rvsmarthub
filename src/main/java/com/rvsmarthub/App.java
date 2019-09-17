package com.rvsmarthub;

/**
 *  JavaFX Imports
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *  Primary Application Class
 *  ------------------------------------------------------------------------
 *  Initializes application preferences and displays the GUI
 */
@SuppressWarnings("restriction")
public class App extends Application 
{
	Button testButton; // Used as a test case
	
	public static void main(String[] args) throws InterruptedException {

		launch(args);
	 }

	@Override
	public void start(Stage mainWindow) throws Exception {

		// Set window title
		mainWindow.setTitle("RV Smart Hub");
		
		// Test Button
		testButton = new Button();
		testButton.setText("Test Button");
		
		// Main Window Layout
		StackPane layout = new StackPane();
		layout.getChildren().add(testButton);
		
		// Main Window
		Scene scene = new Scene(layout, 1024, 600);
		mainWindow.setScene(scene);
		mainWindow.show();
	}
}
