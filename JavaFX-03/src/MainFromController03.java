import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;


public class MainFromController03 {
    public CheckBox cbxJava;
    public CheckBox cbxC;
    public CheckBox cbxKotlin;
    public CheckBox cbxRuby;
    public ListView<String> languageList;
    public RadioButton rdnFemale;
    public TextField txtGenderAnswer;


    public void btnSubmitOnAction(ActionEvent actionEvent) {
        ObservableList<String> list = FXCollections.observableArrayList();
        if (cbxJava.isSelected()) list.add("Java");
        if (cbxC.isSelected()) list.add("C");
        if (cbxKotlin.isSelected()) list.add("Kotlin");
        if (cbxRuby.isSelected()) list.add("Ruby");

        languageList.setItems(list);

    }

    public void PrintGenderOnAction(ActionEvent actionEvent) {

        //-----------------1st Solution-----------------------------
        String gender = "Male";
        if (rdnFemale.isSelected()) gender = "Female";
        txtGenderAnswer.setText(gender);

        //-----------------2nd Solution-----------------------------
        txtGenderAnswer.setText(rdnFemale.isSelected() ? "Female" : "Male");
    }
}
