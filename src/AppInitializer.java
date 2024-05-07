import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
       /* URL resource = getClass().getResource("MainForm.fxml");//option+return
        Parent load = FXMLLoader.load(resource);//object --> parent (object type aka dagannawa parent type akakta aya import krna gannawa..)
        Scene scene = new Scene(load);
        primaryStage.setScene(scene);
        primaryStage.setTitle("My first App");
        primaryStage.show();*/

        primaryStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("MainForm.fxml"))));
        primaryStage.show();
    }
}
