import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
public class MainFormController05 {


    public TableView<CustomerTM> tblCustomer;
    public TableColumn<CustomerTM, String> colID;
    public TableColumn<CustomerTM, String> colName;
    public TableColumn<CustomerTM, String> colAddress;
    public TableColumn<CustomerTM, String> colSalary;
    public TableColumn<CustomerTM, Button> colOperate;

    public void initialize() {
        colID.setCellValueFactory(new PropertyValueFactory<>("id"));
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
        colSalary.setCellValueFactory(new PropertyValueFactory<>("salary"));
        colOperate.setCellValueFactory(new PropertyValueFactory<>("btn"));
        loadData();
    }

    private void loadData() {
        //code base to data loading
        ObservableList<CustomerTM> obList = FXCollections.observableArrayList();

        for (Customer c : CustomerDatabaseTable.dataSource
        ) {
            Button btn = new Button("Delete");
            obList.add(new CustomerTM(c.getId(), c.getName(), c.getAddress(), c.getSalary(), btn));

        }
        tblCustomer.setItems(obList);
    }

}
