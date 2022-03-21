package com.tax.formschema.domain;

public class FormContentFactory {

    public FormContent createFormContent(String formType, String form) {
        if(formType == "json") {
            return new JSONFormContent(form);
        }
        if( formType == "xsd") {
            return new XSDFormContent(form);
        }

        else {
            throw new IllegalStateException("asd");
        }
    }
}
