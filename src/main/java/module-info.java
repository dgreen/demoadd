module edu.uab.dgreen.demoadd {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens edu.uab.dgreen.demoadd to javafx.fxml;
    exports edu.uab.dgreen.demoadd;
}
