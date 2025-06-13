module com.mycompany.interfazmuseo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.interfazmuseo to javafx.fxml;
    exports com.mycompany.interfazmuseo;
}
