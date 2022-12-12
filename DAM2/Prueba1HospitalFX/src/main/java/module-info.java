module com.example.switchscenes {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    exports com.hospital;
    opens com.hospital to javafx.fxml;
}