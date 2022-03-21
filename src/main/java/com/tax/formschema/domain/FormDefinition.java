package com.tax.formschema.domain;

public class FormDefinition {

    private int id;
    private FormContent formContent;

    public FormDefinition(int id, FormContent formContent) {
        this.id = id;
        this.formContent = formContent;
    }

    public FormDefinition() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public FormContent getFormContent() {
        return formContent;
    }

    public void setFormContent(FormContent formContent) {
        this.formContent = formContent;
    }
}
