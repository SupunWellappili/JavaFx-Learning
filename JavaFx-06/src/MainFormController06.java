import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class MainFormController06 {

    public TextField txtInput;

    public void nextWindowOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("subWindowFormController.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage subStage = new Stage();
        subStage.setScene(scene);
        subStage.show();

    }
}
