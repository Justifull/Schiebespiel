module com.example.schiebespiel {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.schiebespiel to javafx.fxml;
    exports com.example.schiebespiel;
}