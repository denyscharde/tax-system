package com.tax.formschema.domain;

import com.tax.formschema.adapter.persistence.FormsRepository;
import com.tax.formschema.adapter.persistence.FormsRepositoryImpl;

public class FormCreationService {

    FormContentFactory formContentFactory = new FormContentFactory();
    FormsRepository formsRepository = new FormsRepositoryImpl();

    public void createFormDefinition(NewFormDefinitionDTO formDefinitionDTO) {
        FormDefinition formDefinition = new FormDefinition();
        formDefinition.setFormContent(formContentFactory.createFormContent(formDefinitionDTO.getFormType(), formDefinitionDTO.formDefinition));
    }
}
