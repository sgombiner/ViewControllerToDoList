module com.example.viewcontrollertodolist {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.viewcontrollertodolist to javafx.fxml;
    exports com.example.viewcontrollertodolist;
}