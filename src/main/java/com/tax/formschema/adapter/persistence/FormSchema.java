package com.tax.formschema.adapter.persistence;

public class FormSchema {
    private int id;
    private String form;

    public FormSchema(int id, String form) {
        this.id = id;
        this.form = form;
    }

    public FormSchema() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }
}
