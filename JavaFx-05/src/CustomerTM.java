import javafx.scene.control.Button;

public class CustomerTM {
    private String id;
    private String name;
    private String address;
    private double salary;
    private Button btn;

    public CustomerTM(String id, String name, String address, double salary, Button btn) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.btn = btn;
    }

    public Button getBtn() {
        return btn;
    }

    public void setBtn(Button btn) {
        this.btn = btn;
    }
}
