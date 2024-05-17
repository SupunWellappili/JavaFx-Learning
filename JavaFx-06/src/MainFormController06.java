import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;

public class MainFormController06 {

    public TextField txtInput;

    public void nextWindowOnAction(ActionEvent actionEvent) throws IOException {
        
        //Just Open UI
        /*URL resource = getClass().getResource("subWindowForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage subStage = new Stage();
        subStage.setScene(scene);
        subStage.show();*/

        //with Code Open UI
        FXMLLoader fxmlLoader = new FXMLLoader(Objects.requireNonNull(getClass().getResource("subWindowForm.fxml")));
        Parent parent = fxmlLoader.load();
        SubWindowFormController controller = fxmlLoader.getController();
        controller.setValue(txtInput.getText());
        Stage stage = new Stage();
        stage.setScene(new Scene(parent));
        stage.show();
    }
}
