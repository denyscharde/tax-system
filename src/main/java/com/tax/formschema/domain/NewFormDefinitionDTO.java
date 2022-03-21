package com.tax.formschema.domain;

public class NewFormDefinitionDTO {
    String formType;
    String formDefinition;

    public NewFormDefinitionDTO(String formType, String formDefinition) {
        this.formType = formType;
        this.formDefinition = formDefinition;
    }

    public String getFormType() {
        return formType;
    }

    public void setFormType(String formType) {
        this.formType = formType;
    }

    public String getFormDefinition() {
        return formDefinition;
    }

    public void setFormDefinition(String formDefinition) {
        this.formDefinition = formDefinition;
    }
}
