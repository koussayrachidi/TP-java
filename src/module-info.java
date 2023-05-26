module test_projet {
	    requires javafx.controls;
	    requires javafx.fxml;
	    requires javafx.graphics;
	    requires javafx.base;
		requires java.sql;

	    exports application;
	    opens application to javafx.graphics, javafx.fxml;
	}