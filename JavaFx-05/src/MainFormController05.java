import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.util.Observable;

public class MainFormController05 {


    public TableView tblCustomer;
    public TableColumn colID;
    public TableColumn colName;
    public TableColumn colAddress;
    public TableColumn colSalary;
    public TableColumn colOperate;

    public void initialize(){
        loadData();
    }

    private void loadData() {
        //code base to data loading
        ObservableList<Customer> obList = FXCollections.observableArrayList(CustomerDatabaseTable.dataSource);
        tblCustomer.setItems(obList);
    }

}
