module com.example.section9practice {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.section9practice to javafx.fxml;
    exports com.example.section9practice;
}