package com.tax.formschema.adapter.persistence;

public class FormSchema {
    private static int counter = 0;
    private int id;
    private String form;

    public FormSchema(int id, String form) {
        this.id = id;
        this.form = form;
    }

    public FormSchema(String form) {
        this.id = counter++;
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

    @Override
    public String toString() {
        return "FormSchema{" +
                "id=" + id +
                ", form='" + form + '\'' +
                '}';
    }
}
