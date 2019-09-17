package com.rvsmarthub;

/**
 *  JavaFX Imports
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *  Primary Application Class
 *  ------------------------------------------------------------------------
 *  Initializes application preferences and displays the GUI
 */
@SuppressWarnings("restriction")
public class App extends Application
{
	// String Constants
	private static String APP_NAME								= "RV Smart Hub";
	private static String SETTINGS_SCENE_TITLE			= "Settings";
	private static String EXIT_BUTTON_TXT 					= "Exit";
	
	// Main Scene Properties
	Scene mainScene;
	Label mainSceneTitle;
	Button settingsButton;
	
	// Settings Scene Properties
	Scene settingsScene;
	Label settingsSceneTitle;
	Button settingsExitButton;
	
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
		
		// Settings Scene
		// -------------------------------------------------------
		settingsSceneTitle = new Label();
		settingsSceneTitle.setText(SETTINGS_SCENE_TITLE);
		
		settingsExitButton = new Button();
		settingsExitButton.setText(EXIT_BUTTON_TXT);
		settingsExitButton.setOnAction(e -> showScene(mainStage, mainScene, APP_NAME));
		
		VBox settingsLayout = new VBox();
		settingsLayout.getChildren().addAll(settingsSceneTitle, settingsExitButton);
		
		Scene settingsScene =  new Scene(settingsLayout, 1024, 600);			
		
		// Main Stage / Scene
		// -------------------------------------------------------	
		mainSceneTitle = new Label();
		mainSceneTitle.setText(APP_NAME);			
		
		settingsButton = new Button();
		settingsButton.setText(SETTINGS_SCENE_TITLE);
		settingsButton.setOnAction( e -> showScene(mainStage, settingsScene, SETTINGS_SCENE_TITLE));
		
		VBox mainLayout = new VBox();
		mainLayout.getChildren().addAll(mainSceneTitle, settingsButton);
		
		mainScene = new Scene(mainLayout, 1024, 600);		
		
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