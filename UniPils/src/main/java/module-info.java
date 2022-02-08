module it.unipi.lsmdb {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml;
    requires org.mongodb.driver.sync.client;
    requires org.mongodb.driver.core;
    requires org.mongodb.bson;

    opens it.unipi.lsmdb to javafx.fxml;
    exports it.unipi.lsmdb;
    exports it.unipi.lsmdb.controller;
    opens it.unipi.lsmdb.controller to javafx.fxml;

}