import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class MainFormController {

    public TextField txtName; //Auto Generate codes
    public TextField txtLanguage;
    public TextField txtCountry;
    public Label lblAnswer;
    public TextField txtCity;
    public TextField txtFinalText;
    public ComboBox<String> cmbLanguages;

   /* public void initialize() { //public, void (interface aka run wenawath ekkama run wee.)
//Auto Trigger wenawaa(Call Wenawaa)
        //System.out.println("init");

        txtFinalText.textProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println(newValue);
        });
    }*/

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


    public void initialize(){
        cmbLanguages.getItems().add("supun");
        cmbLanguages.getItems().add(12);
        cmbLanguages.getItems().add(56.4);
        cmbLanguages.getItems().add(true);
        cmbLanguages.getItems().add('A');
    }


}
