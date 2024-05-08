import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ListView;


public class MainFromController03 {
    public CheckBox cbxJava;
    public CheckBox cbxC;
    public CheckBox cbxKotlin;
    public CheckBox cbxRuby;
    public ListView<String> languageList;


    public void btnSubmitOnAction(ActionEvent actionEvent) {
        ObservableList<String> list = FXCollections.observableArrayList();
        if (cbxJava.isSelected()) list.add("Java");
        if (cbxC.isSelected()) list.add("C");
        if (cbxKotlin.isSelected()) list.add("Kotlin");
        if (cbxRuby.isSelected()) list.add("Rubby");

        languageList.setItems(list);

    }
}
