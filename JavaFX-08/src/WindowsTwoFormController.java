import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class WindowsTwoFormController {

    public AnchorPane windowTwoContext;

    public void backToHomeOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) windowTwoContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("MainForm08.fxml"))));

    }
}
