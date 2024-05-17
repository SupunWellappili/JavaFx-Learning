import Customer;

import java.util.ArrayList;

public class CustomerDatabaseTable {
    public static ArrayList<Customer> dataSource = new ArrayList();

    static {
        dataSource.add( new Customer("1001","Nimal","Galle",23000));
        dataSource.add( new Customer("1002","Kamal","Jafna",34000));
        dataSource.add( new Customer("1003","Nizan","Trincomale",54000));
        dataSource.add( new Customer("1004","Sama","Tangalle",79000));
        dataSource.add( new Customer("1005","Fathi","Panadura",21200));
    }
}
