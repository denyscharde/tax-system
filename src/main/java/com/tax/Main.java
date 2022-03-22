package com.tax;

import com.tax.formschema.adapter.persistence.DatabaseJdbcConnector;
import com.tax.formschema.adapter.persistence.FormSchema;
import com.tax.formschema.adapter.persistence.FormsRepository;
import com.tax.formschema.adapter.persistence.FormsRepositoryImpl;
import com.tax.formschema.domain.FormContent;
import com.tax.formschema.domain.FormContentFactory;
import com.tax.formschema.domain.FormCreationService;
import com.tax.formschema.domain.NewFormDefinitionDTO;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        FormContentFactory formContentFactory = new FormContentFactory();
        FormsRepository formsRepository = new FormsRepositoryImpl();

        List<FormContent> formContentList = Arrays.asList(
            formContentFactory.createFormContent("xsd", "<example>"),
            formContentFactory.createFormContent("json", "\"another\":\"example\"")
        );

        formContentList.forEach((f) -> System.out.println(f.getFormContent()));

        formContentList.forEach((f) -> formsRepository.saveFormSchema(new FormSchema(f.getFormContent())));

        try {
            List<FormSchema> allFromDBList = formsRepository.getAllFormSchemas();
            allFromDBList.toString();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
