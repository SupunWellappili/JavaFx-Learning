import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;

public class WindowsOneFormController {

    public AnchorPane windowOneContext;

    public void backToHomeOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) windowOneContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("MainForm08.fxml"))));

    }
}
