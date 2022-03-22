package com.tax.formschema.adapter.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

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
        String url = "jdbc:postgresql://localhost:5432/tax";
        String user = "user";
        String pass = "password";
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        String ddl = "CREATE TABLE IF NOT EXISTS form_schema (id int primary key, form varchar)";
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(ddl);
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public Connection getConnection() {
        return connection;
    }
}
