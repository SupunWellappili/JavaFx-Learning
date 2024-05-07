import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class MainFormController {

    public TextField txtName; //Auto Generate codes
    public TextField txtLanguage;
    public TextField txtCountry;

    public void printOnAction(ActionEvent actionEvent) {
        System.out.println(txtName.getText());
       // txtName.setText("");//Don't Use
        txtName.clear();
    }

    public void printMyTextOnAction(ActionEvent actionEvent) {

        if (txtLanguage.getText().isEmpty()){
            new Alert(Alert.AlertType.WARNING,"Value is Required", ButtonType.OK).show();
            return;
        }

        System.out.println(txtLanguage.getText());
        txtLanguage.clear();
    }


    public void onKeyPressedOnAction(KeyEvent keyEvent) {
        System.out.println(txtCountry.getText());
    }


    public void onKeyReleasedOnAction(KeyEvent keyEvent) {
    }
}
