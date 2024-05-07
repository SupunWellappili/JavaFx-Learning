import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class MainFormController {

    public TextField txtName; //Auto Generate code

    public void printOnAction(ActionEvent actionEvent) {
        System.out.println(txtName.getText());
       // txtName.setText("");//Don't Use
        txtName.clear();
    }
}
