import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;

public class MainFormController08 {
    public AnchorPane mainFormContext;

    public void openWindowOneInAction(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) mainFormContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("WindowsOneForm.fxml"))));
    }

    public void openWindowTwoInAction(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) mainFormContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("WindowsTwoForm.fxml"))));
    }

}

