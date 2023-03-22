module com.example.tercerparcialpatrones {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tercerparcialpatrones to javafx.fxml;
    exports com.example.tercerparcialpatrones;
}