module spacetrip.spacetrip2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens spacetrip.spacetrip2 to javafx.fxml;
    exports spacetrip.spacetrip2;
    exports spacetrip.spacetrip2.Logic;
    opens spacetrip.spacetrip2.Logic to javafx.fxml;
}