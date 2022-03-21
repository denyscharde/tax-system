package com.tax.formschema.adapter.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseJdbcConnector {

    private static DatabaseJdbcConnector connector;
    private Connection connection;

    public static DatabaseJdbcConnector getInstance() {
        if(connector == null) {
            connector = new DatabaseJdbcConnector();
        }
        return connector;
    }

    private DatabaseJdbcConnector() {
        String url = "jdbc:mysql:// localhost:3306/taxform";
        String user = "root";
        String pass = "root";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
