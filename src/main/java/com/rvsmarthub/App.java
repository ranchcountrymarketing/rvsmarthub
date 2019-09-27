package com.rvsmarthub;

/**
 *  JavaFX Imports
 */
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *  Primary Application Class
 *  ------------------------------------------------------------------------
 *  Initializes application preferences and displays the GUI
 */
public class App extends Application
{
	// String Constants
	private static String APP_NAME								= "RV Smart Hub";
	
	// Main Scene Properties
	Scene mainScene;
	
	/**
	 * main()
	 * ---------------------------------------------------------------------
	 */
	public static void main(String[] args) throws InterruptedException {

		// Launch JavaFX GUI
		launch(args); 	
		
	 } 

	/** 
	 * start()
	 * ---------------------------------------------------------------------
	 */
	@Override
	public void start(Stage mainStage) throws Exception {
		
		Parent root = FXMLLoader.load(getClass().getResource("/App.fxml"));
		
		// Main Stage / Scene
		// -------------------------------------------------------			
		mainScene = new Scene(root, 1024, 600);		
		
		// Add CSS
		mainScene.getStylesheets().add(App.class.getResource("/App.css").toExternalForm());
		
		showScene(mainStage, mainScene, APP_NAME);
		
	}
	
	/**
	 * showScene()
	 * ---------------------------------------------------------------------
	 * Shows the scene being requested in the stage provided and sets 
	 * the title for that stage.
	 * 
	 * @param stage Stage to display scene in.
	 * @param scene Scene being requested
	 * @param title Title to be assigned to the Stage
	 */
	public void showScene(Stage stage, Scene scene, String title) {
		
		stage.setTitle(title);
		stage.setScene(scene);
		stage.show();
		
	}
}