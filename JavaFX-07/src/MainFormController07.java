import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class MainFormController07 {
    public AnchorPane context;


    public void openWindowOneOnAction(ActionEvent actionEvent) throws IOException {
        setUi("WindowOneForm");
    }

    public void openWindowTwoOnAction(ActionEvent actionEvent) throws IOException {
        setUi("WindowTwoForm");

    }

    private void setUi(String location) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource(location + ".fxml"));
        context.getChildren().clear();
        context.getChildren().add(parent);

    }
}
