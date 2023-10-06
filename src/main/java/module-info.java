module com.myapp.desktoptimemanager {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.myapp.desktoptimemanager to javafx.fxml;
    exports com.myapp.desktoptimemanager;
}
