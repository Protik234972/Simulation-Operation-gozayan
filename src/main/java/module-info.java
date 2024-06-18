module com.oop.simulationoperationgozayan {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.oop.simulationoperationgozayan to javafx.fxml;
    exports com.oop.simulationoperationgozayan;
    opens com.oop.simulationoperationgozayan.login to javafx.fxml;
    exports com.oop.simulationoperationgozayan.login;
    opens com.oop.simulationoperationgozayan.amanta.admin to javafx.fxml;
    exports com.oop.simulationoperationgozayan.amanta.admin;
    opens com.oop.simulationoperationgozayan.amanta.hrm to javafx.fxml;
    exports com.oop.simulationoperationgozayan.amanta.hrm;
    opens com.oop.simulationoperationgozayan.plabon.operation_manager to javafx.fxml;
    exports com.oop.simulationoperationgozayan.plabon.operation_manager;
    opens com.oop.simulationoperationgozayan.plabon.customer_service_executive to javafx.fxml;
    exports com.oop.simulationoperationgozayan.plabon.customer_service_executive;
    opens com.oop.simulationoperationgozayan.protik.accounts_and_finance_officer to javafx.fxml;
    exports com.oop.simulationoperationgozayan.protik.accounts_and_finance_officer;
    opens com.oop.simulationoperationgozayan.protik.customer to javafx.fxml;
    exports com.oop.simulationoperationgozayan.protik.customer;
    opens com.oop.simulationoperationgozayan.toushia.hotel_manager to javafx.fxml;
    exports com.oop.simulationoperationgozayan.toushia.hotel_manager;
    opens com.oop.simulationoperationgozayan.toushia.tour_agent to javafx.fxml;
    exports com.oop.simulationoperationgozayan.toushia.tour_agent;


}