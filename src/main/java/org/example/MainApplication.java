
package org.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/main-table-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1200, 600);

//        scene.getStylesheets().add(getClass().getResource("/css/style.css").toExternalForm());

        stage.setTitle("JavaFX Demo App");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}