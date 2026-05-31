module com.mycompany.nlp_finalproj {
    requires javafx.controls;
    requires javafx.fxml;

    // This opens your package so the FXMLLoader can read your FXML files
    opens com.mycompany.nlp_finalproj to javafx.fxml;
    
    exports com.mycompany.nlp_finalproj;
}
