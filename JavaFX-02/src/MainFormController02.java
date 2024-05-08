import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class MainFormController02 {
    public ListView<String> lstLanguages;
    public TextField txtLanguage;
    public TextField txtSelectedLanguage;


    public void initialize() {
        setListData();

        //-------------------

        lstLanguages.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
           /* System.out.println(oldValue); //Pre Values Display
            System.out.println(newValue);*/ //PostValues Display
            txtSelectedLanguage.setText(newValue);
        });
    }

    private void setListData() {
        ObservableList<String> list = FXCollections.observableArrayList();
        list.addAll("JAVA", "JavaScript", "C#", "Swift", "Python", "Kotlin", "Ruby","C++");
        lstLanguages.setItems(list);
    }

    public void saveLanguageOnAction(ActionEvent actionEvent) {
        lstLanguages.getItems().add(txtLanguage.getText());
        txtLanguage.clear();
    }
}
