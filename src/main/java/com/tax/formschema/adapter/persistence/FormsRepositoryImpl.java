package com.tax.formschema.adapter.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FormsRepositoryImpl implements FormsRepository{

    DatabaseJdbcConnector databaseJdbcConnector;

    public FormsRepositoryImpl() {
        databaseJdbcConnector = DatabaseJdbcConnector.getInstance();
    }

    @Override
    public void saveFormSchema(FormSchema schema) {
        Connection connection = databaseJdbcConnector.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement("insert into form_schema(id, form) VALUES (?, ?)");
            statement.setInt(1, schema.getId());
            statement.setString(2, schema.getForm());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<FormSchema> getAllFormSchemas() throws SQLException {
        Connection connection = databaseJdbcConnector.getConnection();
        String query = "select * from form_schema";
        PreparedStatement statement = connection.prepareStatement(query);
        ResultSet resultSet = statement.executeQuery();
        List<FormSchema> result = new ArrayList<>();
        while (resultSet.next()) {
            FormSchema formSchema = new FormSchema();
            formSchema.setId(resultSet.getInt("id"));
            formSchema.setForm(resultSet.getString("form"));
            result.add(formSchema);
        }
        return result;
    }

    @Override
    public FormSchema findFormSchemaById(int id) throws SQLException{
        Connection connection = databaseJdbcConnector.getConnection();
        String query = "select * from form_schema where id= ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1, id);
        FormSchema formSchema = new FormSchema();
        ResultSet resultSet = statement.executeQuery();
        boolean check = false;
        while (resultSet.next()) {
            check = true;
            formSchema.setId(resultSet.getInt("id"));
            formSchema.setForm(resultSet.getString("form"));
        }
        if (check == true) {
            return formSchema;
        } else {
            return null;
        }
    }
}
