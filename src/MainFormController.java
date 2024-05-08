import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import java.net.URL;
import java.util.ArrayList;
import java.util.Observable;
import java.util.ResourceBundle;

public class MainFormController {

    public TextField txtName; //Auto Generate codes
    public TextField txtLanguage;
    public TextField txtCountry;
    public Label lblAnswer;
    public TextField txtCity;
    public TextField txtFinalText;
    public ComboBox<String> cmbLanguages;
    public ComboBox cmdCities;

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


//-----------------------------------------

    public void initialize() {
       // setData1();
        setData2();
        setData3();

    }

    public void setData1() {
        cmbLanguages.getItems().add("C#");
        cmbLanguages.getItems().add("JAVA");
        cmbLanguages.getItems().add("JavaScript");
        cmbLanguages.getItems().add("Python");
        cmbLanguages.getItems().add("TypeScript");
    }

    private void setData2() {
        cmbLanguages.getItems().addAll("C#", "JAVA", "JavaScript", "Python", "TypeScript");
    }

    private void setData3() {
        /*ArrayList<String> dataSet = new ArrayList<>();
        dataSet.add("Colombo");
        dataSet.add("Galle");
        dataSet.add("Matara");

        cmdCities.setItems(dataSet);//Error (Java & JAvaFX Direct Not Support)

        //--------------------1st-----------------------
*/
        /*ObservableList<String> dataSet = FXCollections.observableArrayList();
        dataSet.add("Colombo");
        dataSet.add("Galle");
        dataSet.add("Matara");
        cmdCities.setItems(dataSet);*/

        //--------------------2nd------------------------

        ArrayList<String> list  = new ArrayList<>();
        list.add("Colombo");
        list.add("Galle");
        list.add("Matara");
        ObservableList<String> dataSet2 = FXCollections.observableArrayList(list);
        cmdCities.setItems(dataSet2);

    }
}
