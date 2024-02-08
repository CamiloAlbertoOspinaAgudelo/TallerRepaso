module com.example.tallerrepaso2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.tallerrepaso2 to javafx.fxml;
    exports com.example.tallerrepaso2;
}