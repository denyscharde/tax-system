package com.tax;

import com.tax.formschema.adapter.persistence.DatabaseJdbcConnector;

public class Main {
    public static void main(String[] args) {
        DatabaseJdbcConnector connector = DatabaseJdbcConnector.getInstance();

    }
}
