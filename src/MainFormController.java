import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class MainFormController  {

    public TextField txtName; //Auto Generate codes
    public TextField txtLanguage;
    public TextField txtCountry;
    public Label lblAnswer;
    public TextField txtCity;
    public TextField txtFinalText;

    public void initialize(){ //public, void (interface aka tr)

    }

    public void printOnAction(ActionEvent actionEvent) {
        System.out.println(txtName.getText());
        // txtName.setText("");//Don't Use
        txtName.clear();
    }

    public void printMyTextOnAction(ActionEvent actionEvent) {

        if (txtLanguage.getText().isEmpty()) {
            new Alert(Alert.AlertType.WARNING, "Value is Required", ButtonType.OK).show();
            return;
        }

        System.out.println(txtLanguage.getText());
        txtLanguage.clear();
    }


    public void onKeyPressedOnAction(KeyEvent keyEvent) {
        // System.out.println(txtCountry.getText());
    }


    public void onKeyReleasedOnAction(KeyEvent keyEvent) {
        //  System.out.println(keyEvent.getCode());
        if (keyEvent.getCode().equals(KeyCode.ENTER)) {
            System.out.println(txtCountry.getText());
            txtCountry.clear();
        }
    }

    public void printCityOnAction(KeyEvent keyEvent) {
        lblAnswer.setText(txtCity.getText());
    }

/*    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("Initialize");
    }*/
}
