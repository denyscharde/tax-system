package com.tax.formschema.domain;

public class XSDFormContent implements FormContent{

    String formContent;

    public XSDFormContent(String formContent) {
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
