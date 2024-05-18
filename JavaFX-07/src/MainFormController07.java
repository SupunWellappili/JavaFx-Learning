import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class MainFormController07 {
    public AnchorPane context;


    public void openWindowOneOnAction(ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("WindowOneForm.fxml"));
        context.getChildren().clear();
        context.getChildren().add(parent);
    }

    public void openWindowTwoOnAction(ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("WindowTwoForm.fxml"));
        context.getChildren().clear();
        context.getChildren().add(parent);

    }
}
