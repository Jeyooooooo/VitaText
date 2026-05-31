package com.mycompany.nlp_finalproj;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.stage.StageStyle;

/**
 * JavaFX App - VitaText Dashboard Launcher
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        // Point explicitly to your FXML layout file
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/fxml.fxml"));
        scene = new Scene(root);
        
        stage.setScene(scene);
        stage.setTitle("VitaText - NLP Analyzer Studio");
        stage.initStyle(StageStyle.UNDECORATED);

        stage.setMaximized(true);
        
        // Optional: Prevents users from easily breaking layout constraints via exit escape warnings
        stage.setFullScreenExitHint("Press ESC to reduce window form factor or exit application");
        
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}