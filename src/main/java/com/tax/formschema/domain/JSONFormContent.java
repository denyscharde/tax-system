package com.tax.formschema.domain;

public class JSONFormContent implements FormContent{

    private String formContent;

    public JSONFormContent(String formContent) {
        this.formContent = formContent;
    }

    public void setFormContent(String formContent) {
        this.formContent = formContent;
    }

    @Override
    public String getFormContent() {
        return formContent;
    }
}
