package com.tax.formschema.adapter.persistence;

import java.sql.SQLException;
import java.util.List;

public interface FormsRepository {

    void saveFormSchema(FormSchema schema);

    List<FormSchema> getAllFormSchemas() throws SQLException;

    FormSchema findFormSchemaById(int id) throws SQLException;
}
